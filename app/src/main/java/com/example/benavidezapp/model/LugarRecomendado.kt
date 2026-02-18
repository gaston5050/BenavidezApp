package com.example.benavidezapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.benavidezapp.utils.categoriasEnum

data class LugarRecomendado(
    val id: Int,
    @StringRes val nombre: Int,
    @StringRes val descripcion: Int,
    @DrawableRes val imagen: Int,
    val categoria: categoriasEnum

)