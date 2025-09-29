package com.example.fonovirtual_v2.ui.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.fonovirtual_v2.R
import com.example.fonovirtual_v2.BuildConfig // Importação adicionada

/**
 * Tela Home (Principal) da aplicação FonoVirtual.
 *
 * Exibe o título da aplicação, opções de navegação principais (botões),
 * a versão atual do app (obtida dinamicamente do BuildConfig)
 * e informações adicionais do projeto.
 *
 * @param navController Controla a navegação entre as telas.
 * @since 0.2.1
 * @updated 1.0.0 (DD/MM/AAAA - Data da Atualização) - Versão agora obtida dinamicamente do BuildConfig.
 * @validationStatus Validado
 */
@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Título da Tela (agora "FonoVirtual")
        Text(
            text = stringResource(id = R.string.title_screen_home),
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Botão Cadastro/Seleção de Profissional e Paciente
        Button(onClick = { /* TODO: Implementar navegação ou lógica */ }) {
            Text(text = stringResource(id = R.string.home_button_professional_patient))
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botão Teste Rápido
        Button(onClick = { /* TODO: Implementar navegação ou lógica */ }) {
            Text(text = stringResource(id = R.string.home_button_quick_test))
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Botão Debug
        Button(onClick = { navController.navigate("debug") }) {
            Text(text = stringResource(id = R.string.home_button_debug))
        }

        Spacer(modifier = Modifier.weight(1f)) // Empurra as informações da versão para baixo

        // Versão do App (obtida dinamicamente)
        Text(
            text = "Versão: ${BuildConfig.VERSION_NAME}",
            style = MaterialTheme.typography.bodySmall
        )
        // Informação Adicional do Projeto
        Text(
            text = stringResource(id = R.string.home_project_integrator_info),
            style = MaterialTheme.typography.bodySmall
        )
    }
}

/**
 * Preview para a HomeScreen.
 * Demonstra a tela com as informações atualizadas e versão dinâmica (no preview pode mostrar um placeholder se BuildConfig não estiver disponível em tempo de preview).
 * @validationStatus Validado
 */
@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    MaterialTheme {
        // Para o preview, usamos um NavController "dummy" que não faz nada,
        // pois o NavController real é injetado durante a navegação.
        HomeScreen(navController = rememberNavController())
    }
}
