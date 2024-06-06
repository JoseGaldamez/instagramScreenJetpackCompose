package dev.josegaldamez.screeninstalogin.login.ui


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dev.josegaldamez.screeninstalogin.login.ui.form_parts.ButtonLogin
import dev.josegaldamez.screeninstalogin.login.ui.form_parts.EmailInputLogin
import dev.josegaldamez.screeninstalogin.login.ui.form_parts.ForgotPassword
import dev.josegaldamez.screeninstalogin.login.ui.form_parts.LoginWithFacebook
import dev.josegaldamez.screeninstalogin.login.ui.form_parts.LogoInstagram
import dev.josegaldamez.screeninstalogin.login.ui.form_parts.OrDivider
import dev.josegaldamez.screeninstalogin.login.ui.form_parts.PasswordInputLogin


@Composable
fun FormLogin(
    modifier: Modifier,
    inputColors: TextFieldColors,
    viewModel: LoginViewModel
) {
    val email:String by viewModel.email.observeAsState("")
    val password:String by viewModel.password.observeAsState("")
    val isLoginEnabled:Boolean by viewModel.loginEnabled.observeAsState(false)

    // Render
    Column(
        Modifier
            .fillMaxWidth()
            .padding(bottom = 100.dp)
    ) {
        LogoInstagram()
        EmailInputLogin(modifier, inputColors, email) { viewModel.setEmailAndPassword(it, password) }
        PasswordInputLogin(modifier, inputColors, password) { viewModel.setEmailAndPassword(email, it) }
        ForgotPassword()
        ButtonLogin(isLoginEnabled)
        OrDivider()
        LoginWithFacebook()
    }
}
