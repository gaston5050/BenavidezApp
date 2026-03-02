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
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.benavidezapp.R
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
    val uiState by viewModel.uiState.collectAsState()

    Scaffold(
        topBar = {
           BenaAppBar(navController)
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
                       // viewModel.actualizarTitulo(it.nombreRes)
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
fun BenaAppBar(navController: NavHostController){

  //  var topBarTitle by remember { mutableStateOf("Inicio") }
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    val titleResId = when (currentRoute) {
           Pantalla.CatPantalla.ruta-> R.string.app_name
            RecoPantalla.ruta-> R.string.recomendaciones
            Pantalla.DetallePantalla.ruta-> R.string.detalle
            else -> R.string.app_name
        }


     TopAppBar(
         colors = TopAppBarDefaults.topAppBarColors(
             containerColor = MaterialTheme.colorScheme.primaryContainer,
             titleContentColor = MaterialTheme.colorScheme.primary,
         ),
         title = {
             Text(text = stringResource(id = titleResId))
         })

}


