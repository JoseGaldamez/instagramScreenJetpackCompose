package dev.josegaldamez.screeninstalogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dev.josegaldamez.screeninstalogin.login.ui.LoginScreen
import dev.josegaldamez.screeninstalogin.login.ui.LoginViewModel
import dev.josegaldamez.screeninstalogin.ui.theme.ScreenInstaLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScreenInstaLoginTheme {
                LoginScreen( LoginViewModel() )
            }
        }
    }
}