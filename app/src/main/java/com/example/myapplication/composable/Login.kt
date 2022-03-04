
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
fun loginNo(navController: NavController) {
    val Phselected = remember{ mutableStateOf(false)}
    val Adselected = remember { mutableStateOf(false)}
    val phNumber = remember { mutableStateOf("") }
    val sendOtp = remember{ mutableStateOf(false)}
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopCenter) {
        Image(painter = painterResource(id = R.drawable.orangearc), contentDescription = null, modifier = Modifier
            .align(
                Alignment.TopCenter
            )
            .fillMaxWidth()
            .height(165.dp))
        Text(
            text = "SELECT ANY ONE",
            style = TextStyle(
                fontSize = 18.sp
            ),
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 180.dp)
        )
        Spacer(modifier = Modifier.padding(30.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier.padding(top = 230.dp)
        ) {
            Button(onClick = {
                if (Phselected.value){
                    return@Button
                }else
                    Adselected.value = !Adselected.value }, modifier = Modifier
                .height(70.dp)
                .width(150.dp)
                .clip(RoundedCornerShape(40.dp)),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (Adselected.value) AddColor.nBlue else Color.LightGray,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "AADHAAR NO", style = TextStyle(
                        fontSize = 18.sp
                    )
                )
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Button(onClick = {
                if (Adselected.value){
                    return@Button
                }else
                    Phselected.value = !Phselected.value },
                modifier = Modifier
                    .height(70.dp)
                    .width(150.dp)
                    .clip(RoundedCornerShape(40.dp)),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (Phselected.value) AddColor.nBlue else Color.LightGray,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "PHONE NO", style = TextStyle(
                        fontSize = 18.sp
                    )
                )
            }
        }
        OutlinedTextField(
            value = phNumber.value,
            onValueChange = { phNumber.value = it
                            sendOtp.value = true
                            if(phNumber.value==""){
                                sendOtp.value=false
                            }},
            label = { Text(text = "Enter the number") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = AddColor.nBlue,
                focusedLabelColor = AddColor.nBlue,
                unfocusedLabelColor = AddColor.nBlue,
                focusedBorderColor = Color.Black,
                unfocusedBorderColor = Color.Black,
            ) ,
            modifier = Modifier.padding(top = 330.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone),
            singleLine = true
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier.padding(top = 440.dp)
        ) {
            Button(
                onClick = {navController.navigate(Screens.OtpScreen.route)},
                modifier = Modifier
                    .height(50.dp)
                    .width(130.dp)
                    .clip(RoundedCornerShape(40.dp)),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = if (sendOtp.value) AddColor.nBlue else Color.LightGray,
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