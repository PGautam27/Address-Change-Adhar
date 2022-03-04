package com.example.myapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.Data.Addhaar
import com.example.myapplication.DataProvider.DataProvider
import com.example.myapplication.Navigation.Screens
import com.example.myapplication.R


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun requestScreen(navController: NavController) {
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
        Spacer(modifier = Modifier.padding(2.dp))
        Column(verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(top = 170.dp)
                .height(430.dp)
                .fillMaxWidth()) {
            Button(
                onClick = {navController.navigate(Screens.DoneScreen.route)},
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
                    text = "NOTIFICATION STATUS", style = TextStyle(
                        fontSize = 18.sp
                    )
                )
            }
            LazyColumn(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                items(
                    items = addhaar,
                    itemContent = {
                        if (it.id== id){
                            newCard(Addhar = it)
                        }
                    }
                )
            }
            /*Card(onClick = {},
                modifier = Modifier
                    .width(300.dp)
                    .height(110.dp)
                    .padding(top = 7.dp, start = 2.dp, end = 2.dp, bottom = 10.dp),
                elevation = 5.dp,
                shape = RoundedCornerShape(5.dp)
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
                            text = "Sonal J",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Medium,
                                color = Color.Black
                            )
                        )
                        Text(
                            text = "ADDRESS",
                            style = TextStyle(
                                fontSize = 16.sp,
                                color = Color.Black
                            )
                        )
                    }
                }
            }*/
            Spacer(modifier = Modifier.padding(2.dp))
            Box(modifier = Modifier
                .border(width = 2.dp, color = AddColor.nBlue, shape = RoundedCornerShape(10.dp))
                .width(300.dp)
                .height(160.dp), contentAlignment = Alignment.Center){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Spacer(modifier = Modifier.height(7.dp))
                    Text(
                        text = AnnotatedString(text = "AADHAAR last updated on: \n").plus(
                            AnnotatedString(
                                text = "\t\t\t\t\t\t\tDD/MM/YYYY",
                                spanStyle = SpanStyle(color = Color.Blue)
                            )
                        )

                    )
                    Text(
                        text = AnnotatedString(text = "\nDate of request for change: \n").plus(
                            AnnotatedString(
                                text = "\t\t\t\t\t\t\tDD/MM/YYYY",
                                spanStyle = SpanStyle(color = Color.Blue)
                            )
                        )

                    )
                    Text(
                        text = AnnotatedString(text = "\nAddress update in UDAI status: ").plus(
                            AnnotatedString(
                                text = "Success",
                                spanStyle = SpanStyle(color = Color.Blue)
                            )
                        )

                    )
                }
            }
            Spacer(modifier = Modifier.padding(4.dp))
            Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.End, modifier = Modifier.width(300.dp)) {
                Button(
                    onClick = {navController.navigate(Screens.Preference.route)},
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

@Composable
fun newCard(
    Addhar: Addhaar
) {

    Card(
        modifier = Modifier
            .width(300.dp)
            .height(110.dp)
            .padding(top = 7.dp, start = 2.dp, end = 2.dp, bottom = 10.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(5.dp)
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
                    text = Addhar.name,
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium,
                        color = Color.Black
                    )
                )
                Text(
                    text = Addhar.Address,
                    style = TextStyle(
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                )
            }
        }
    }
}