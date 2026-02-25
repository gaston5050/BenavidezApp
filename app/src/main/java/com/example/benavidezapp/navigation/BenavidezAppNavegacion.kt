package com.example.benavidezapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.benavidezapp.navigation.Pantalla.RecoPantalla
import com.example.benavidezapp.ui.BenavidezAppViewModel
import com.example.benavidezapp.ui.pantallas.categorias.categoriasPantalla
import com.example.benavidezapp.ui.pantallas.detalles.detallePantalla
import com.example.benavidezapp.ui.pantallas.recomendaciones.recomendacionesPantalla

sealed class Pantalla(val ruta: String){
    object CatPantalla: Pantalla("cat_pantalla")
    object RecoPantalla: Pantalla("rec_pantalla")
    object DetallePantalla: Pantalla("det_pantalla")
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
             val uiState by viewModel.uiState.collectAsState()
            recomendacionesPantalla(listaLugaresFiltrada = uiState.listaLugares,
                onItemClick = {
                   viewModel.actualizarLugarSeleccionado(it)
                    navController.navigate(Pantalla.DetallePantalla.ruta)
                    //categoria ->
                    //navController.navigate("recomendaciones_pantalla/$categoria")
                })

        }

        composable(Pantalla.DetallePantalla.ruta){
            val uiState by viewModel.uiState.collectAsState()
            detallePantalla(LugarRecomendado = uiState.lugarSeleccionado!!)

        }




    }





}