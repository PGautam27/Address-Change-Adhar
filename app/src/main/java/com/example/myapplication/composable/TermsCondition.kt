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
fun termsCondition(navController: NavController) {
    val state = rememberScrollState()
    val checkedStatus = remember { mutableStateOf(false) }
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
                text = "TERMS AND CONDITION",
                style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 30.sp),
                maxLines = 2
            )
            Spacer(modifier = Modifier.padding(5.dp))
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
                    .height(280.dp)
                    .fillMaxWidth()
                    .verticalScroll(state)
            ) {
                Text(text = "Welcome to ____. By visiting this application and accessing the information, resources, service and tools we provide, you understand and agree to accept and adhere to the following terms and conditions as stated in this policy (hereafter referred to as 'User Agreement'), along with the terms and conditions as stated in our Privacy Policy (please refer to the Privacy Policy section below for more information).\n" +
                        "\n" +
                        "We reserve the right to change this User Agreement from time to time without notice. You acknowledge and agree that it is your responsibility to review this User Agreement periodically to familiarize yourself with any modifications. Your continued use of this site after such modifications will constitute acknowledgment and agreement of the modified terms and conditions.\n" +
                        "\n" +
                        "\t\t\t\t\t\t\t\t1. Responsible Use & Conduct\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t______________\n" +
                        "•\tIn order to access our Resources, you may be required to provide certain information about yourself (such as identification, phone number, contact details, etc.) as part of the registration process, or as part of your ability to use the Resources. You agree that any information you provide will always be accurate, correct, and up to date.\n" +
                        "•\tAccessing (or attempting to access) any of our Resources by any means other than through the means we provide, is strictly prohibited. You specifically agree not to access (or attempt to access) any of our Resources through any automated, unethical or unconventional means.\n" +
                        "•\tEngaging in any activity that disrupts or interferes with our Resources, including the servers and/or networks to which our Resources are located or connected, is strictly prohibited.\n" +
                        "•\tAttempting to copy, duplicate or reproduce our resources is strictly prohibited.\n" +
                        "•\tYou are solely responsible any consequences, losses, or damages that we may directly or indirectly incur or suffer due to any unauthorized activities conducted by you, as explained above, and may incur criminal or civil liability.\n" +
                        "\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2. Privacy\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t______________\n" +
                        "Your privacy is very important to us, which is why we've created a separate Privacy Policy in order to explain in detail how we collect, manage, process, secure, and store your private information. Our privacy policy is included under the scope of this User Agreement.\n" +
                        "\n" +
                        "\t\t\t\t\t\t\t\t\t\t3. Limitation Of Liability\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t______________\n" +
                        "By using this application you expressly understand and agree that any claim against us shall be limited, for use of services. __ will not be liable for any direct, indirect, incidental, consequential or exemplary loss or damages which may be incurred by you as a result of using our Resources, or as a result of any changes, data loss or corruption, cancellation, loss of access, or downtime to the full extent that applicable limitation of liability laws apply.\n" +
                        "\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t4. Termination Of Use\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t______________\n" +
                        "You agree that we may, at our sole discretion, suspend or terminate your access to all or part of our application and Resources with or without notice and for any reason, including, without limitation, breach of this User Agreement. Any suspected illegal, fraudulent or abusive activity may be grounds for terminating your relationship and may be referred to appropriate law enforcement authorities. Upon suspension or termination, your right to use the Resources we provide will immediately cease, and we reserve the right to remove or delete any information that you may have on file with us, including any account or login information.\n" +
                        "\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t5. Governing Law\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t______________\n" +
                        "By accessing our application, you agree that the statutes and laws of India will apply to all matters relating to the use of this application.\n" +
                        "\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t6. Guarantee\n" +
                        "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t______________\n" +
                        "Unless otherwise expressed, www.msmeregistration.org expressly disclaims all warranties and conditions of any kind, whether express or implied, including, but not limited to the implied warranties and conditions of merchantability, fitness for a particular purpose and non-infringement.",
                    style = TextStyle(fontSize = 14.sp)
                )
                Spacer(modifier = Modifier.padding(5.dp))
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
                    Checkbox(
                        checked = checkedStatus.value,
                        onCheckedChange = { checkedStatus.value = !checkedStatus.value },
                        modifier = Modifier.padding(start = 30.dp),
                        colors = CheckboxDefaults.colors(
                            checkedColor = AddColor.nBlue,
                            checkmarkColor = Color.White,
                            uncheckedColor = Color.LightGray
                        )
                    )
                    Spacer(modifier = Modifier.padding(10.dp))
                    Text(text = "I Agree to the above Terms and Conditions", style = TextStyle(fontSize = 15.sp))
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Button(
                onClick = {navController.navigate(Screens.Processing.route)},
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