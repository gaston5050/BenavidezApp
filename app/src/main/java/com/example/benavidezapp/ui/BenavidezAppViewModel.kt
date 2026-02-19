package com.example.benavidezapp.ui

import androidx.lifecycle.ViewModel
import com.example.benavidezapp.data.ProveedorDataLocal
import com.example.benavidezapp.model.LugarRecomendado
import com.example.benavidezapp.utils.categoriasEnum
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow


class BenavidezAppViewModel : ViewModel(){

    private val _uiState = MutableStateFlow(BenavidezUiState(
        listaLugares = ProveedorDataLocal.lugares,
        categoriaSeleccionada = categoriasEnum.CAFETERIAS
    ))
    val uiState: StateFlow<BenavidezUiState> = _uiState.asStateFlow()







}

data class BenavidezUiState(
    val listaLugares: List<LugarRecomendado> = ProveedorDataLocal.lugares.,
    val categoriaSeleccionada: categoriasEnum = categoriasEnum.CAFETERIAS,
    val lugarSeleccionado: LugarRecomendado? = null

    )


)