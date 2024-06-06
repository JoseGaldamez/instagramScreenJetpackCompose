package dev.josegaldamez.screeninstalogin.login.ui

import android.util.Patterns
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel:ViewModel() {

    // Email configuration
    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    // Password configuration
    private val _password = MutableLiveData<String>()
    val password: LiveData<String> = _password



    fun setEmailAndPassword(email: String, password: String) {

        // Update email and password only if they are different
        if (email != _email.value){
            _email.value = email
        }
        if (password != _password.value){
            _password.value = password
        }

        // Enable login button if email and password are valid
        canLogin()
    }


    // Login button enable configuration
    private val _loginEnabled = MutableLiveData<Boolean>()
    val loginEnabled: LiveData<Boolean> = _loginEnabled

    private fun canLogin() {
        // valid our email and password
        _loginEnabled.value = ( isAnValidEmail(email.value!!) && isAnValidPassword(password.value!!) )
    }

    // Email validation
    private fun isAnValidEmail(email: String):Boolean{
        return email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    // Password validation at least 6 characters, one number and one uppercase
    private fun isAnValidPassword(password: String):Boolean{
        return password.length > 5 && password.contains(Regex("[0-9]")) && password.contains(Regex("[A-Z]"))
    }

}