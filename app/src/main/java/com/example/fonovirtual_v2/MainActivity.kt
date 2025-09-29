package com.example.fonovirtual_v2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fonovirtual_v2.ui.debug.DebugScreen
import com.example.fonovirtual_v2.ui.home.HomeScreen
import com.example.fonovirtual_v2.ui.splash.SplashScreen
import com.example.fonovirtual_v2.ui.theme.FonoVirtualv2Theme
import com.example.fonovirtual_v2.ui.tts_test.TtsTestScreen
import com.example.fonovirtual_v2.ui.asr_test.AsrTestScreen // Nova importação

/**
 * Activity principal do app FonoVirtual_V2.
 *
 * Gerencia a navegação entre SplashScreen, HomeScreen, DebugScreen, TtsTestScreen e AsrTestScreen
 * usando Jetpack Compose Navigation.
 *
 * @since 0.2.0 (Estrutura inicial de navegação)
 * @updated 1.0.1 - Rota "asr_test_screen" agora aponta para AsrTestScreen.kt.
 * @validationStatus Em Teste
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FonoVirtualv2Theme { // Aplicando o tema raiz aqui
                FonoVirtualApp()
            }
        }
    }
}

/**
 * Composable raiz da aplicação FonoVirtual_V2.
 *
 * Define o NavHost e as rotas de navegação para todas as telas principais.
 * Utiliza um NavController para gerenciar a pilha de navegação.
 *
 * @since 0.2.0 (Estrutura inicial de navegação)
 * @updated 1.0.1 - Rota "asr_test_screen" agora aponta para AsrTestScreen.kt.
 * @validationStatus Em Teste
 */
@Composable
fun FonoVirtualApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("debug") { DebugScreen(navController) }
        composable("tts_test_screen") { TtsTestScreen(/*viewModel aqui se não usar hilt/padrão*/) }
        composable("asr_test_screen") { AsrTestScreen(navController) } // Rota atualizada
    }
}

// A função PlaceholderAsrTestScreen foi removida daqui.
