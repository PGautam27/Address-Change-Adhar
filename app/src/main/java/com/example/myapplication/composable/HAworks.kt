package com.example.myapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import com.example.myapplication.composable.AddColor
import com.example.myapplication.R

@Composable
fun howWorks(navController: NavController) {
    val state = rememberScrollState()
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
                .padding(top = 160.dp, end = 10.dp)
                .height(430.dp)
                .fillMaxWidth()) {
            Text(
                text = "HOW THE APP \n \t\t\t\t\t WORKS",
                style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 30.sp),
                maxLines = 2
            )
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .height(280.dp)
                    .fillMaxWidth()
                    .verticalScroll(state)
            ) {
                Text(text = "1.This application enables the residents to intimate the service providers about the change of address in their Aadhar through push notification .\n" +
                        "\n" +
                        "2.\tThis service will be based on the specific consent by the resident . It will be triggered by the Aadhar authentication.\n" +
                        "\n" +
                        "\t3.On successful address update , the application sends a push notification to the consumer agencies to intimate the change in the address",
                    style = TextStyle(fontSize = 16.sp)
                )
            }
            Button(
                onClick = {navController.navigate(Screens.OptionScreen.route)},
                modifier = Modifier
                    .height(43.dp)
                    .width(105.dp)
                    .clip(RoundedCornerShape(40.dp)).align(Alignment.End),
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