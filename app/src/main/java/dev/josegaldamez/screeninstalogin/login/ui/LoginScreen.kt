package dev.josegaldamez.screeninstalogin.login.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen( viewModel: LoginViewModel) {

    val inputModifier: Modifier =
        Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 1.dp)
            .clip(
                RoundedCornerShape(10.dp)
            )

    val inputColors = OutlinedTextFieldDefaults.colors(
        focusedBorderColor = Color(0xFFDDDDDD),
        unfocusedBorderColor = Color(0xFFDDDDDD),
        unfocusedContainerColor = Color(0xFFf1f1f1),
        focusedContainerColor = Color(0xFFf1f1f1),
        focusedLabelColor = Color.Gray,
        unfocusedLabelColor = Color.Gray
    )



    // Render
    Scaffold { paddingValue ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValue),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            HeaderLogin()
            FormLogin(inputModifier, inputColors, viewModel)
            FooterLogin()
        }
    }

}

//@Preview(showBackground = true)
//@Composable
//fun LoginScreenPreview() {
//    LoginScreen()
//}