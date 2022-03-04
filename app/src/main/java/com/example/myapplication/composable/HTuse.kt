package com.example.addresschange.composable

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
import com.example.myapplication.R
import com.example.myapplication.composable.AddColor

@Composable
fun howUse(navController: NavController) {
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
                text = "HOW TO USE \n \t\t THE APP",
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
                Text(text = "1. After logging into the ___ application, the resident will be able to view his current information which is reflected on the Aadhaar.\n" +
                        "\n" +
                        "2.The user will be able to view all the service providers with which his Aadhaar is linked.\t\n" +
                        "\n" +
                        "3.The resident can then choose his preferences to whom he would like to push the notification\n" +"\n" +
                        "4.The resident can then proceed with the request to push the notification to required service providers.\n" +"\n" +
                        "5.The resident can check the status of his request here(add link) or (add photo where it is located )\n" +
                        "\n" +
                        "6.Once the notification is sent to the service providers, the resident would also receive a notification informing that their request has been granted.",
                    style = TextStyle(fontSize = 16.sp)
                )
            }
            Spacer(modifier = Modifier.padding(2.dp))
            Button(
                onClick = {navController.navigate(Screens.OptionScreen.route)},
                modifier = Modifier
                    .height(43.dp)
                    .width(105.dp)
                    .clip(RoundedCornerShape(40.dp))
                    .align(Alignment.End),
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