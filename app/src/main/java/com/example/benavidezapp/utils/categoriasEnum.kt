package com.example.benavidezapp.utils
import com.example.benavidezapp.R

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

enum class categoriasEnum(
    val nombreRes: Int,
    val icono: Int
) {
    CAFETERIAS(R.string.cat_cafeterias, R.drawable.ic_cafe),
    RESTAURANTS(R.string.cat_restaurantes, R.drawable.ic_restaurante),
    ENTRETENIMIENTO_NINOS(R.string.cat_ninos, R.drawable.ic_ninios),
    PARQUES(R.string.cat_parques, R.drawable.ic_park),
    PANADERIAS(R.string.cat_panaderias, R.drawable.ic_bakery)
}