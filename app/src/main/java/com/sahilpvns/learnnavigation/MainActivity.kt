package com.sahilpvns.learnnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sahilpvns.learnnavigation.ui.MyAppNavigation
import com.sahilpvns.learnnavigation.ui.Routes
import com.sahilpvns.learnnavigation.ui.ScreenA
import com.sahilpvns.learnnavigation.ui.ScreenB

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyAppNavigation()
        }
    }
}

