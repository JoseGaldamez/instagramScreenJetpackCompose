package dev.josegaldamez.screeninstalogin.login.ui.form_parts

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp

@Composable
fun EmailInputLogin(
    modifier: Modifier,
    inputColors: TextFieldColors,
    email: String,
    onChangeValue: (string: String) -> Unit
) {
    OutlinedTextField(
        value = email,
        onValueChange = { onChangeValue(it) },
        modifier = modifier,
        maxLines = 1,
        singleLine = true,
        keyboardOptions = KeyboardOptions( keyboardType = KeyboardType.Email ),
        shape = RoundedCornerShape(10.dp),
        colors = inputColors,
        placeholder = {Text(text = "Email", color = Color.Gray)},

    )
}