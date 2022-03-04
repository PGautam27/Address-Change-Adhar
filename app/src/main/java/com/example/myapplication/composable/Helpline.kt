package com.example.myapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.Navigation.Screens
import com.example.myapplication.R

@Composable
fun helpline(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize(), contentAlignment = Alignment.TopCenter
    ) {
        Image(
            painter = painterResource(id = R.drawable.orangearc),
            contentDescription = null,
            modifier = Modifier
                .align(
                    Alignment.TopCenter
                )
                .fillMaxWidth()
                .height(165.dp)
        )
        Column(verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 180.dp)
                .height(430.dp)
                .fillMaxWidth()) {
            Text(
                text = "HELPLINE",
                style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 36.sp),
                maxLines = 1
            )
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp, top = 45.dp)
                    .height(280.dp)
                    .fillMaxWidth()
            ) {
                Text(text = "You can contact us on:\n" +
                        "\n" +
                        "Landline-no: 080********\n" +
                        "Telephone-no: +91*******\n" +
                        "Email-id: help@***.gov.in\n" +
                        "Twitter-id: @*****\n",
                    style = TextStyle(fontSize = 20.sp)
                )
                Spacer(modifier = Modifier.padding(10.dp))
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.fillMaxWidth()) {
                    Button(
                        onClick = {navController.navigate(Screens.OptionScreen.route)},
                        modifier = Modifier
                            .height(43.dp)
                            .width(105.dp)
                            .clip(RoundedCornerShape(40.dp)),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = AddColor.nBlue,
                            contentColor = Color.White
                        )
                    ) {
                        Text(
                            text = "Back", style = TextStyle(
                                fontSize = 18.sp
                            )
                        )
                    }
                    Spacer(modifier = Modifier.padding(10.dp))
                    Button(
                        onClick = {navController.navigate(Screens.RequestScreen.route)},
                        modifier = Modifier
                            .height(43.dp)
                            .width(105.dp)
                            .clip(RoundedCornerShape(40.dp)),
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = AddColor.nBlue,
                            contentColor = Color.White
                        )
                    ) {
                        Text(
                            text = "Next", style = TextStyle(
                                fontSize = 18.sp
                            )
                        )
                    }
                }

            }

        }
        Image(
            painter = painterResource(id = R.drawable.greenarc),
            contentDescription = null,
            modifier = Modifier
                .align(
                    Alignment.BottomCenter
                )
                .fillMaxWidth()
                .height(153.dp)
        )
    }
}