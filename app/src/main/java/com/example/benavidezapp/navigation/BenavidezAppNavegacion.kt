package com.example.benavidezapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.benavidezapp.ui.BenavidezAppViewModel
import com.example.benavidezapp.ui.pantallas.categorias.categoriasPantalla
import com.example.benavidezapp.ui.pantallas.recomendaciones.recomendacionesPantalla

sealed class Pantalla(val ruta: String){
    object CatPantalla: Pantalla("cat_pantalla")
    object RecoPantalla: Pantalla("rec_pantalla")
}

@Composable
fun BenavidezApp(viewModel: BenavidezAppViewModel = BenavidezAppViewModel(), navController: NavHostController = rememberNavController()

){



    NavHost(navController = navController, startDestination = Pantalla.CatPantalla.ruta){

        composable("cat_pantalla"){
            categoriasPantalla(
                onItemClick = {
                    viewModel.actualizarCategoriaSeleccionada(it)
                    navController.navigate("rec_pantalla")
                    //categoria ->
                    //navController.navigate("recomendaciones_pantalla/$categoria")
                }
            )
        }
        composable("rec_pantalla"){
            recomendacionesPantalla(

                onItemClick = {
                    viewModel.actualizarCategoriaSeleccionada(it)
                    navController.navigate("rec")
                    //categoria ->
                    //navController.navigate("recomendaciones_pantalla/$categoria")
                }
            )
        }




    }





}