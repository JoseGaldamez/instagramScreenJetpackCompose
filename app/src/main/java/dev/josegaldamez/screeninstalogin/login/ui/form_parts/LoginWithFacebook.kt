package dev.josegaldamez.screeninstalogin.login.ui.form_parts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.josegaldamez.screeninstalogin.R
import dev.josegaldamez.screeninstalogin.ui.theme.BlueInsta

@Composable
fun LoginWithFacebook() {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Image(
            painter = painterResource(id = R.drawable.fb),
            contentDescription = "Facebook logo",
            Modifier.size(20.dp)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Text(text = "Continue as Jose Galdamez", color = BlueInsta)
    }
}