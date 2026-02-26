package com.example.benavidezapp.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BenavidezApp(viewModel: BenavidezAppViewModel = BenavidezAppViewModel(), navController: NavHostController = rememberNavController()

) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    when(viewModel.uiState.value.titulo){

                    }
                },

                )
        }
    ) { innerPadding ->
            Column(
                modifier = Modifier.padding(innerPadding),

            ){

        NavHost(navController = navController, startDestination = Pantalla.CatPantalla.ruta) {

            composable("cat_pantalla") {
                categoriasPantalla(


                    onItemClick = {
                        viewModel.actualizarCategoriaSeleccionada(it)
                        viewModel.actualizarTitulo(it.nombreRes)
                        navController.navigate("rec_pantalla")
                        //categoria ->
                        //navController.navigate("recomendaciones_pantalla/$categoria")
                    }
                )
            }
            composable("rec_pantalla") {
                val uiState by viewModel.uiState.collectAsState()
                recomendacionesPantalla(
                    listaLugaresFiltrada = uiState.listaLugares,
                    onItemClick = {
                        viewModel.actualizarLugarSeleccionado(it)
                        navController.navigate(Pantalla.DetallePantalla.ruta)
                        //categoria ->
                        //navController.navigate("recomendaciones_pantalla/$categoria")
                    })

            }

            composable(Pantalla.DetallePantalla.ruta) {
                val uiState by viewModel.uiState.collectAsState()
                detallePantalla(LugarRecomendado = uiState.lugarSeleccionado!!)

            }


        }


    }
}
}

//top bar personalizada
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BenaAppBar(){

     TopAppBar(
         colors = TopAppBarDefaults.topAppBarColors(
             containerColor = MaterialTheme.colorScheme.primaryContainer,
             titleContentColor = MaterialTheme.colorScheme.primary,
         ),
         title = TODO(),
         modifier = TODO(),
         navigationIcon = TODO(),
         actions = TODO(),
         expandedHeight = TODO(),
         windowInsets = TODO(),
         scrollBehavior = TODO(),
     )

}

