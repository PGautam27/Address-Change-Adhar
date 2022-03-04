package com.example.myapplication.Navigation

sealed class Screens(val route:String){
    object SplashScreen : Screens(route = "splash_screen")
    object LoginScreen : Screens(route = "login_screen")
    object OtpScreen : Screens(route = "otp_screen")
    object Identity: Screens(route = "identity_screen")
    object OptionScreen: Screens(route = "option_screen")
    object HaWorksScreen: Screens(route = "how_works")
    object HtUseScreen: Screens(route = "how_use")
    object HelpLineScreen: Screens(route = "help_line")
    object TermsAndCondition: Screens(route = "term_condition")
    object RequestScreen : Screens(route = "request_screen")
    object Preference : Screens(route = "preference_screen")
    object DoneScreen: Screens(route = "done_screen")
    object Processing: Screens(route = "processing_screen")
}
