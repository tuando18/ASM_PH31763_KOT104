package com.dovantuan.asm_ph31763_kot104

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.dovantuan.asm_ph31763_kot104.ScreenNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//            ScreenNavigation()
//            Home(navController = null)
//            MyBottombar()
//            ProductDetail()
            Cart()
        }
    }
}

