package com.example.fonovirtual_v2.ui.exercises.recognition

import android.Manifest
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.fonovirtual_v2.R
import com.example.fonovirtual_v2.data.exercises.recognition.WordsRepository
import com.example.fonovirtual_v2.speech.AsrRecognitionStatus
import com.example.fonovirtual_v2.ui.exercises.recognition.model.WordExercise
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.isGranted
import com.google.accompanist.permissions.rememberPermissionState

/**
 * Tela de exercício de reconhecimento de palavras simples.
 * Permite ao usuário selecionar o número de sílabas e praticar a pronúncia
 * de palavras, com feedback visual e sonoro.
 *
 * @param navController Controlador de navegação
 * @param viewModel ViewModel do exercício
 * @since 1.0.3
 * @validationStatus Em Desenvolvimento
 */
@OptIn(ExperimentalMaterial3Api::class, ExperimentalPermissionsApi::class)
@Composable
fun SimpleRecognitionExerciseScreen(
    navController: NavController,
    viewModel: SimpleRecognitionExerciseViewModel = viewModel()
) {
    val currentWord by viewModel.currentWord.collectAsStateWithLifecycle()
    val asrStatus by viewModel.asrStatus.collectAsStateWithLifecycle()
    val asrResult by viewModel.asrResult.collectAsStateWithLifecycle()

    // Solicitar permissão do microfone assim que a tela for criada
    val permissionState = rememberPermissionState(
        permission = Manifest.permission.RECORD_AUDIO
    ) { isGranted ->
        if (isGranted) {
            viewModel.startListening()
        }
    }

    // Efeito para solicitar permissão ao entrar na tela
    LaunchedEffect(Unit) {
        if (!permissionState.status.isGranted) {
            permissionState.launchPermissionRequest()
        }
    }

    // Efeito para monitorar quando não há mais palavras
    LaunchedEffect(currentWord) {
        if (viewModel.selectedSyllableCount != null && currentWord == null) {
            // Se já selecionou sílabas mas não tem palavra atual, significa que acabou
            navController.navigate("exercise_result") {
                // Evita que o usuário volte para a última palavra ao pressionar voltar
                popUpTo("simple_recognition") { inclusive = true }
            }
        }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(stringResource(R.string.exercise_recognition_title)) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.onPrimaryContainer
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            if (viewModel.selectedSyllableCount == null) {
                SyllableSelectionSection(viewModel = viewModel)
            } else {
                currentWord?.let { word ->
                    ExerciseSection(
                        currentWord = word,
                        asrStatus = asrStatus,
                        asrResult = asrResult,
                        onPlayExampleClick = { viewModel.speakCurrentWord() },
                        onNextWordClick = {
                            // Verificar se a palavra atual está correta antes de avançar
                            currentWord?.let { word ->
                                val recognizedText = asrResult.lowercase().trim()
                                val targetWord = word.word.lowercase().trim()

                                // Verifica se a palavra reconhecida contém a palavra alvo
                                if (recognizedText.contains(targetWord)) {
                                    viewModel.incrementCorrectWords()
                                }
                            }

                            val hasNext = viewModel.loadNextWord()
                            if (!hasNext) {
                                // Quando não há mais palavras, navega para tela de resultado
                                val accuracy = viewModel.getAccuracyPercentage()
                                val correct = viewModel.getCorrectWords()
                                val total = viewModel.getTotalWords()

                                navController.navigate("exercise_result/${accuracy}/${correct}/${total}") {
                                    popUpTo("simple_recognition") { inclusive = true }
                                }
                            }
                        }
                    )
                }
            }
        }
    }
}

@Composable
private fun SyllableSelectionSection(viewModel: SimpleRecognitionExerciseViewModel) {
    val availableCounts = remember { WordsRepository.getAvailableSyllableCounts() }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = stringResource(R.string.exercise_select_syllables),
            style = MaterialTheme.typography.titleMedium,
            textAlign = TextAlign.Center
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            availableCounts.forEach { count ->
                Button(onClick = { viewModel.selectSyllableCount(count) }) {
                    Text(count.toString())
                }
            }
        }
    }
}

@Composable
private fun ExerciseSection(
    currentWord: WordExercise,
    asrStatus: AsrRecognitionStatus,
    asrResult: String,
    onPlayExampleClick: () -> Unit,
    onNextWordClick: () -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Palavra atual
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = currentWord.word,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                style = MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Center
            )
        }

        // Botão de exemplo sonoro
        Button(onClick = onPlayExampleClick) {
            Text(stringResource(R.string.exercise_listen_example))
        }

        // Status do reconhecimento
        Text(
            text = stringResource(
                when (asrStatus) {
                    is AsrRecognitionStatus.Idle -> R.string.exercise_status_idle
                    is AsrRecognitionStatus.Starting -> R.string.exercise_status_starting
                    is AsrRecognitionStatus.Listening -> R.string.exercise_status_listening
                    is AsrRecognitionStatus.Error -> R.string.exercise_status_error
                }
            ),
            style = MaterialTheme.typography.bodyMedium,
            color = when (asrStatus) {
                is AsrRecognitionStatus.Listening -> Color.Green
                is AsrRecognitionStatus.Error -> Color.Red
                else -> MaterialTheme.colorScheme.onSurface
            }
        )

        // Resultado do ASR sempre visível
        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = if (asrResult.isNotEmpty()) asrResult else "(Aguardando sua pronúncia...)",
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.bodyLarge
            )
        }

        // Botão Próxima Palavra sempre visível
        Button(
            onClick = onNextWordClick
        ) {
            Text(stringResource(R.string.exercise_next_word))
        }
    }
}
