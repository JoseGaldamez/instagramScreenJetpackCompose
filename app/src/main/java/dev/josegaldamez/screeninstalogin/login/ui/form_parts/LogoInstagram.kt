package dev.josegaldamez.screeninstalogin.login.ui.form_parts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import dev.josegaldamez.screeninstalogin.R


@Composable
fun LogoInstagram() {
    Box(
        Modifier
            .fillMaxWidth(), contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.insta),
            contentDescription = "Logo Instagram",
            Modifier
                .width(200.dp)
                .size(100.dp)
        )
    }
}
