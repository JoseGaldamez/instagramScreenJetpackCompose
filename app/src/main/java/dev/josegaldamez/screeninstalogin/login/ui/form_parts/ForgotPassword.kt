package dev.josegaldamez.screeninstalogin.login.ui.form_parts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.josegaldamez.screeninstalogin.ui.theme.BlueInsta

@Composable
fun ForgotPassword() {
    Box(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 10.dp),
        contentAlignment = Alignment.CenterEnd
    ) {
        Text(text = "Forgot Password?", fontSize = 14.sp, color = BlueInsta)
    }
}

