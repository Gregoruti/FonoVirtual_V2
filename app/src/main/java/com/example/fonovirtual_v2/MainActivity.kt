package com.example.fonovirtual_v2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fonovirtual_v2.ui.splash.SplashScreen
import com.example.fonovirtual_v2.ui.home.HomeScreen

/**
 * Activity principal do app.
 *
 * Gerencia a navegação entre SplashScreen e HomeScreen usando Jetpack Compose Navigation.
 *
 * @validationStatus Em Teste
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FonoVirtualApp()
        }
    }
}

/**
 * Função principal do app, define o NavHost e as rotas.
 */
@Composable
fun FonoVirtualApp() {
    val navController = rememberNavController()
    MaterialTheme {
        NavHost(navController = navController, startDestination = "splash") {
            composable("splash") { SplashScreen(navController) }
            composable("home") { HomeScreen() }
        }
    }
}
