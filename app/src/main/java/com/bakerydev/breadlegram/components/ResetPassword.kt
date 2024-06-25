package com.bakerydev.breadlegram.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Shapes
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bakerydev.breadlegram.ui.theme.BreadlegramTheme

private fun _resetPasswordButton() {

}

@Composable
fun ResetPassword() {
    var email = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    var repeatPassword = remember { mutableStateOf("") }
    Surface(
        modifier = Modifier.padding(8.dp),
        shape = RoundedCornerShape(8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text("Resetear Contraseña", fontSize = 30.sp)
            CustomTextField(text = "Email", value = email)
            CustomTextField(text = "Password", value = password)
            CustomTextField(text = "Confirmar contraseña", value = repeatPassword)
            Button(
                onClick = { _resetPasswordButton() }, modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
                    .padding(top = 8.dp)
            ) {
                Text("Confirmar")
            }
        }
    }
}

@Composable
fun CustomTextField(text: String, value: MutableState<String>) {
    TextField(value = value.value, onValueChange = {  value.value = it}, label = { Text(text) } )
}

@Preview(showSystemUi = true)
@Composable
fun ResetPasswordPreview() {
    BreadlegramTheme {
        ResetPassword()
    }
}