package dev.josegaldamez.screeninstalogin.login.ui.form_parts

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun OrDivider() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 30.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Divider(modifier = Modifier.width(150.dp))
        Text(text = "OR", fontSize = 14.sp, modifier = Modifier.padding(horizontal = 10.dp))
        Divider(modifier = Modifier.width(150.dp))
    }
}
