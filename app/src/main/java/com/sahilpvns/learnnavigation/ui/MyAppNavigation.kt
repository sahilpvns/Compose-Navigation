package com.sahilpvns.learnnavigation.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyAppNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.SCREEN_A) {
        composable(Routes.SCREEN_A) {
            ScreenA(navController)
        }

        composable(Routes.SCREEN_B + "/{name}") {
            val name = it.arguments?.getString("name")
            ScreenB(name)
        }
    }
}