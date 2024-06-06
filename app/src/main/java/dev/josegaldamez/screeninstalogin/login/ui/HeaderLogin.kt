package dev.josegaldamez.screeninstalogin.login.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlin.system.exitProcess

@Composable
fun HeaderLogin() {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.CenterEnd) {
        Icon(
            imageVector = Icons.Default.Close,
            contentDescription = "Close this app",
            Modifier.padding(horizontal = 10.dp, vertical = 16.dp).size(30.dp).clickable {
                exitProcess(-1)
            }
        )
    }
}