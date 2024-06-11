package com.dovantuan.asm_ph31763_kot104.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.dovantuan.asm_ph31763_kot104.ui.screen.Boarding
import com.dovantuan.asm_ph31763_kot104.ui.screen.Cart
import com.dovantuan.asm_ph31763_kot104.ui.screen.CheckOut
import com.dovantuan.asm_ph31763_kot104.ui.screen.Congrats
import com.dovantuan.asm_ph31763_kot104.ui.screen.Home
import com.dovantuan.asm_ph31763_kot104.ui.screen.Login
import com.dovantuan.asm_ph31763_kot104.ui.screen.ProductDetail
import com.dovantuan.asm_ph31763_kot104.ui.screen.SignUp
//

@Composable
fun ScreenNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.Boarding.route,
    ) {
        composable(Screen.Boarding.route) { Boarding(navController) }
        composable(Screen.Login.route) { Login(navController) }
        composable(Screen.SignUp.route) { SignUp(navController) }
        composable(Screen.MyBottombar.route) { MyBottombar(navController) }
        composable(Screen.Home.route) { Home(navController) }
        composable(
            "${Screen.ProductDetail.route}/{productID}",
            arguments = listOf(navArgument("productID") { type = NavType.StringType })
        ) {
            ProductDetail(
                productId = it.arguments?.getString("productID").orEmpty(),
                navController = navController
            )
        }
        composable(Screen.Cart.route) { Cart(navController) }
        composable(Screen.CheckOut.route) { CheckOut(navController) }
        composable(Screen.Congrats.route) { Congrats(navController) }
    }
}