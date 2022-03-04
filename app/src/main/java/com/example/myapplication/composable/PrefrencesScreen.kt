package com.example.myapplication.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.Navigation.Screens
import com.example.myapplication.R
import com.example.myapplication.composable.AddColor

@Composable
fun preferences(navController: NavController) {
    val state = rememberScrollState()
    val checkedStatus = remember { mutableStateOf(false) }
    val LpgStatus = remember { mutableStateOf(false) }
    val PanStatus = remember { mutableStateOf(false) }
    val DriverStatus = remember { mutableStateOf(false) }
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
                text = "Choose the agencies to \n \t\t\t\t\t\t\t\t\t\t\tbe notified",
                style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 26.sp),
                maxLines = 2
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .height(230.dp)
                    .fillMaxWidth()
                    .verticalScroll(state)
            ) {
                    Spacer(modifier = Modifier.padding(5.dp))
                    Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                        Checkbox(
                            checked = checkedStatus.value,
                            onCheckedChange = { checkedStatus.value = !checkedStatus.value },
                            modifier = Modifier.padding(start = 60.dp),
                            colors = CheckboxDefaults.colors(
                                checkedColor = AddColor.nBlue,
                                checkmarkColor = Color.White,
                                uncheckedColor = Color.LightGray
                            )
                        )
                        Spacer(modifier = Modifier.padding(10.dp))
                        Text(text = "Bank Account", style = TextStyle(fontSize = 15.sp))
                    }
                Spacer(modifier = Modifier.padding(5.dp))
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                    Checkbox(
                        checked = LpgStatus.value,
                        onCheckedChange = { LpgStatus.value = !LpgStatus.value },
                        modifier = Modifier.padding(start = 0.dp),
                        colors = CheckboxDefaults.colors(
                            checkedColor = AddColor.nBlue,
                            checkmarkColor = Color.White,
                            uncheckedColor = Color.LightGray
                        )
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "LPG", style = TextStyle(fontSize = 15.sp))
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                    Checkbox(
                        checked = PanStatus.value,
                        onCheckedChange = { PanStatus.value = !PanStatus.value },
                        modifier = Modifier.padding(start = 30.dp),
                        colors = CheckboxDefaults.colors(
                            checkedColor = AddColor.nBlue,
                            checkmarkColor = Color.White,
                            uncheckedColor = Color.LightGray
                        )
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Pan Card", style = TextStyle(fontSize = 15.sp))
                }
                Spacer(modifier = Modifier.padding(5.dp))
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                    Checkbox(
                        checked = DriverStatus.value,
                        onCheckedChange = { DriverStatus.value = !DriverStatus.value },
                        modifier = Modifier.padding(start = 60.dp),
                        colors = CheckboxDefaults.colors(
                            checkedColor = AddColor.nBlue,
                            checkmarkColor = Color.White,
                            uncheckedColor = Color.LightGray
                        )
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "Driver License", style = TextStyle(fontSize = 15.sp))
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Button(
                onClick = {navController.navigate(Screens.TermsAndCondition.route)},
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