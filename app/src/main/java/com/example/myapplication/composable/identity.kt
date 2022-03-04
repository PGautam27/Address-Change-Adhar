package com.example.myapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.Data.Addhaar
import com.example.myapplication.DataProvider.DataProvider
import com.example.myapplication.Navigation.Screens
import com.example.myapplication.R

internal var id = 0

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AddharData(Addhaar: Addhaar, navController: NavController) {
    Card(
        modifier = Modifier
            .width(300.dp)
            .height(120.dp)
            .padding(top = 7.dp, start = 2.dp, end = 2.dp, bottom = 10.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(10.dp),
        onClick = {
            navController.navigate(Screens.OptionScreen.route)
            id = Addhaar.id
        }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start,
            modifier = Modifier.background(color = Color(0xFFDFE3E4))
        ) {
            Image(
                painter = painterResource(id = R.drawable.fault),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 20.dp)
                    .size(60.dp)
            )
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.padding(start = 15.dp)
            ) {
                Text(
                    text = Addhaar.name,
                    style = TextStyle(
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )
                )
                Text(
                    text = Addhaar.AadhaarNO.toString(),
                    style = TextStyle(
                        fontSize = 17.sp,
                        color = Color.Black
                    )
                )
            }
        }
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun identity(navController: NavController) {
    val state = rememberScrollState()
    val addhaar = remember { DataProvider.aadhaar}
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
        Text(
            text = "CHOOSE YOUR IDENTITY",
            modifier = Modifier.padding(top = 175.dp),
            style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp)
        )
        LazyColumn(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 205.dp)
                .height(360.dp)
                .fillMaxWidth()
        ) {
            items(
                items = addhaar,
                itemContent = {
                    AddharData(Addhaar = it, navController = navController)
                }
            )
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