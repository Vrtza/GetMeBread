package com.bakerydev.breadlegram.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private fun _resetPasswordButton() {

}

@Composable
fun ResetPassword() {
    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    var repeatPassword = remember { mutableStateOf("") }
    Column(verticalArrangement = Arrangement.spacedBy(10.dp)) {
        Text("Resetear Contraseña", fontSize = 30.sp)
        CustomTextField(text = "Email", value = email)
        CustomTextField(text = "Password", value = password)
        CustomTextField(text = "Confirmar contraseña", value = repeatPassword)
        Button(onClick = { _resetPasswordButton()}) {
            Text("Confirmar")
        }
    }
}

@Composable
fun CustomTextField(text: String, value: MutableState<String>) {
    OutlinedTextField(value = value.value, onValueChange = {  value.value = it}, label = { Text(text) } )
}

@Preview()
@Composable
fun ResetPasswordPreview() {
    ResetPassword()
}