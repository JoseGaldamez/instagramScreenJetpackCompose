package dev.josegaldamez.screeninstalogin.login.ui

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import dev.josegaldamez.screeninstalogin.ui.theme.BlueInsta

@Composable
fun FooterLogin(){

    Box( modifier = Modifier
        .fillMaxWidth()
        .height(50.dp), contentAlignment = Alignment.Center) {
        Row {
            Text(text = "Don't have an account? ")
            Text(text = "Sign up", color = BlueInsta, fontWeight = FontWeight.Bold, modifier = Modifier.clickable {
                Log.d("signup", "Sign Up")
            })
        }
    }

}