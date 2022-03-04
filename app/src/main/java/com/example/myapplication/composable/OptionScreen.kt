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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.Navigation.Screens
import com.example.myapplication.R

@Composable
fun option(navController: NavController) {
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
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 170.dp)
                .height(390.dp)
        ) {
            Button(
                onClick = {navController.navigate(Screens.HaWorksScreen.route)},
                modifier = Modifier
                    .height(60.dp)
                    .width(245.dp)
                    .clip(RoundedCornerShape(40.dp)),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = AddColor.nBlue,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "How The App Works", style = TextStyle(
                        fontSize = 18.sp
                    )
                )
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Button(
                onClick = {navController.navigate(Screens.HtUseScreen.route) },
                modifier = Modifier
                    .height(60.dp)
                    .width(245.dp)
                    .clip(RoundedCornerShape(40.dp)),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = AddColor.nBlue,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "How To Use The App", style = TextStyle(
                        fontSize = 18.sp
                    )
                )
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Button(
                onClick = {navController.navigate(Screens.HelpLineScreen.route)},
                modifier = Modifier
                    .height(60.dp)
                    .width(245.dp)
                    .clip(RoundedCornerShape(40.dp)),
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = AddColor.nBlue,
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Helpline", style = TextStyle(
                        fontSize = 18.sp
                    )
                )
            }
            Spacer(modifier = Modifier.padding(20.dp))
            Button(
                onClick = {navController.navigate(Screens.RequestScreen.route)},
                modifier = Modifier
                    .height(53.dp)
                    .width(105.dp)
                    .align(Alignment.End)
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