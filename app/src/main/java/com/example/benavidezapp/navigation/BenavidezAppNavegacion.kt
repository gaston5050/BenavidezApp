package com.example.benavidezapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.benavidezapp.ui.pantallas.categorias.categoriasPantalla

@Composable
fun BenavidezAppNavegacion(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "cat_pantalla"){
        composable("cat_pantalla"){
            categoriasPantalla(
                onItemClick = { categoria ->
                    navController.navigate("recomendaciones_pantalla/$categoria")
                }
            )
        }



    }





}