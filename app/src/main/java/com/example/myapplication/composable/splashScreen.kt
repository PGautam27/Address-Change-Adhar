package com.example.myapplication.composable

import android.view.animation.OvershootInterpolator
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import androidx.compose.animation.core.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.draw.scale
import androidx.navigation.NavController
import com.example.myapplication.Navigation.Screens
import kotlinx.coroutines.delay

@Composable
fun splashScreen(navController: NavController) {
    val scale = remember {
        Animatable(0f)
    }

    LaunchedEffect(key1 = true){
        scale.animateTo(
            targetValue = 1.0f,
            animationSpec = tween(
                durationMillis = 500,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
        delay(1500L)
        navController.navigate(Screens.LoginScreen.route)
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .scale(scale.value)
            .background(color = Color(0xFFFFFFFF)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id =R.drawable.chakra), contentDescription = null, modifier = Modifier
            .height(500.dp)
            .fillMaxWidth())

        Spacer(modifier = Modifier.padding(3.dp))
        LinearProgressIndicator(color = Color(0xFFFB8C00), modifier = Modifier.width(200.dp))
        Spacer(modifier = Modifier.padding(10.dp))
        Box(
            modifier = Modifier
                .height(45.dp)
                .width(250.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xE6F4511E), Color(0xB5FDD835), Color(0x7C00FF0B), Color(
                                0x372E9DFD
                            ), Color(0x99FFFFFF)
                        ),
                    )
                ), contentAlignment = Alignment.Center
        ){
            Row(horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(id = R.drawable.namaste), contentDescription = "null", modifier = Modifier.size(30.dp))
                Spacer(modifier = Modifier.padding(5.dp))
                Text(text = "Welcome to Aadhaar")
            }
        }
    }
}
@Composable
fun CustomProgressBar(
    modifier: Modifier, width: Dp, backgroundColor: Color, foregroundColor: Brush, percent: Int
) {
    var k = percent
    var j = width * k/100

    Box(
        modifier = modifier
            .background(backgroundColor)
            .width(width)
    ) {
        Box(
            modifier = modifier
                .background(foregroundColor)
                .width(j)
        )
    }
    Spacer(modifier = Modifier.padding(10.dp))
    Button(onClick = {  k+=10}) {
        Text(text = "Increment")
    }
}
