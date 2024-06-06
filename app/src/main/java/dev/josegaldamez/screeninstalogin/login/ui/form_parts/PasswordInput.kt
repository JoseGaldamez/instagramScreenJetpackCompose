package dev.josegaldamez.screeninstalogin.login.ui.form_parts

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun PasswordInputLogin(
    modifier: Modifier,
    inputColors: TextFieldColors,
    password: String,
    onChangePassword: (String) -> Unit,
) {

    var passwordVisible by remember { mutableStateOf(false) }

    OutlinedTextField(
        value = password,
        onValueChange = { onChangePassword(it) },
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        label = { Text(text = "Password") },
        colors = inputColors,
        singleLine = true,
        maxLines = 1,
        trailingIcon = {
            val imageIcon = if(passwordVisible) {
                Icons.Filled.Visibility
            } else {
                Icons.Filled.VisibilityOff
            }
            IconButton(onClick = { passwordVisible = !passwordVisible }) {

                Icon(imageVector = imageIcon,
                    contentDescription = "Visibility Icon",
                    tint = Color.Gray
                    )

            }
        },
        visualTransformation = if(passwordVisible) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        }
    )
}