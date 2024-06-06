package dev.josegaldamez.screeninstalogin.login.ui.form_parts

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import dev.josegaldamez.screeninstalogin.ui.theme.BlueInsta

@Composable
fun ButtonLogin(isLoginEnabled: Boolean) {
    Button(
        enabled = isLoginEnabled,
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            containerColor = BlueInsta,
            contentColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 10.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(text = "Log in")
    }
}