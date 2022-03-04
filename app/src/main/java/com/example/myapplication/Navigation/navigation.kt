package com.example.myapplication.Navigation

import androidx.compose.animation.AnimatedContentScope
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.composable.*
import com.example.myapplication.composable.splashScreen
import com.google.accompanist.navigation.animation.AnimatedNavHost
//import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

@Composable
fun navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.route
    ){
        composable(route = Screens.SplashScreen.route){
            splashScreen(navController)
        }
        composable(
            route = Screens.LoginScreen.route
        ){
             loginNo(navController = navController)
        }
        composable(route = Screens.OtpScreen.route){
            otpScreen(navController = navController)
        }
        composable(route = Screens.Identity.route){
            identity(navController = navController)
        }
        composable(route = Screens.OptionScreen.route){
            option(navController = navController)
        }
        composable(route = Screens.HaWorksScreen.route){
            howWorks(navController)
        }
        composable(route = Screens.HtUseScreen.route){
            howUse(navController = navController)
        }
        composable(route = Screens.HelpLineScreen.route){
            helpline(navController = navController)
        }

        composable(route = Screens.TermsAndCondition.route){
            termsCondition(navController = navController)
        }
        composable(route = Screens.RequestScreen.route){
            requestScreen(navController = navController)
        }
        composable(route = Screens.Preference.route){
            preferences(navController = navController)
        }
        composable(route = Screens.DoneScreen.route){
            doneSt(navController = navController)
        }
        composable(route = Screens.Processing.route){
            processingSt(navController = navController)
        }
    }
}