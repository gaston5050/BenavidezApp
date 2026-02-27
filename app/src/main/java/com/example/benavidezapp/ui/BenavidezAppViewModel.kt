package com.example.benavidezapp.ui

import androidx.lifecycle.ViewModel
import com.example.benavidezapp.R
import com.example.benavidezapp.data.ProveedorDataLocal
import com.example.benavidezapp.model.LugarRecomendado
import com.example.benavidezapp.utils.categoriasEnum
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update


class BenavidezAppViewModel : ViewModel(){

    private val _uiState = MutableStateFlow(
        BenavidezUiState(
            listaLugares = ProveedorDataLocal.obtenerLugares()
            , categoriaSeleccionada = null
            , lugarSeleccionado = null
            , titulo = R.string.app_name

            ))
    val uiState: StateFlow<BenavidezUiState> = _uiState.asStateFlow()

    fun actualizarTitulo(titulo: Int){
        _uiState.update {
            it.copy(titulo =titulo)
        }
    }
    fun actualizarLugarSeleccionado(lugar: LugarRecomendado){

        _uiState.update {
            it.copy(lugarSeleccionado = lugar,
                titulo = lugar.nombre)
        }
}   fun actualizarCategoriaSeleccionada(categoria: categoriasEnum) {

        _uiState.update{
            it.copy(categoriaSeleccionada= categoria,

                listaLugares = ProveedorDataLocal.filtrado(categoria)
                )
        }
    }





}






data class BenavidezUiState(
    val listaLugares: List<LugarRecomendado> = emptyList(),
    val categoriaSeleccionada: categoriasEnum? = null,
    val lugarSeleccionado: LugarRecomendado? = null,
    val titulo: Int = 0
    )


