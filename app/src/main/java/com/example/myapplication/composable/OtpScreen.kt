package com.example.myapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.Navigation.Screens
import com.example.myapplication.R
import com.example.myapplication.composable.AddColor

@Composable
fun otpScreen(navController: NavController) {
    val OtpNumber = remember { mutableStateOf("") }
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Image(painter = painterResource(id = R.drawable.orangearc), contentDescription = null, modifier = Modifier
            .align(
                Alignment.TopCenter
            )
            .fillMaxWidth()
            .height(165.dp))
        Text(
            text = "ENTER OTP",
            style = TextStyle(
                fontSize = 18.sp
            ),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 240.dp)
        )
        Spacer(modifier = Modifier.padding(30.dp))
        OutlinedTextField(
            value = OtpNumber.value,
            onValueChange = { OtpNumber.value = it },
            label = { Text(text = "OTP number") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = AddColor.nBlue,
                focusedLabelColor = AddColor.nBlue,
                unfocusedLabelColor = AddColor.nBlue,
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.Black,
            ) ,
            modifier = Modifier.padding(top = 290.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            singleLine = true
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = 400.dp)
        ) {
            Button(
                onClick = {navController.navigate(Screens.Identity.route)},
                modifier = Modifier
                    .height(50.dp)
                    .width(130.dp)
                    .clip(RoundedCornerShape(40.dp)),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = AddColor.nBlue,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Send OTP", style = TextStyle(
                        fontSize = 18.sp
                    )
                )
            }
        }
        Image(painter = painterResource(id = R.drawable.greenarc), contentDescription = null, modifier = Modifier
            .align(
                Alignment.BottomCenter
            )
            .fillMaxWidth()
            .height(153.dp))
    }
}