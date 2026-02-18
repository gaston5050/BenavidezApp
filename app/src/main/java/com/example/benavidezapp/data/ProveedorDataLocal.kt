package com.example.benavidezapp.data

import com.example.benavidezapp.R
import com.example.benavidezapp.utils.categoriasEnum

object ProveedorDataLocal {
    val lugares = listOf(
       //cafeterias
        LugarRecomendado(
            id = 1,
            nombre = R.string.nomb_en_calma,
            descripcion = R.string.desc_en_calma,
            imagen = R.drawable.en_calma_cafe,
            categoria = categoriasEnum.CAFETERIAS
        ),
        LugarRecomendado(
            id = 2,
            nombre = R.string.nomb_alex_coffee,
            descripcion = R.string.desc_alex_coffee,
            imagen = R.drawable.alex_coffee,
            categoria = categoriasEnum.CAFETERIAS
        ),
        LugarRecomendado(
            id = 3,
            nombre = R.string.nomb_starbucks,
            descripcion =R.string.desc_starbucks,
            imagen = R.drawable.starbucks_benavidez,
            categoria = categoriasEnum.CAFETERIAS
        ),

        //restaurantes
        LugarRecomendado(
            id = 4,
            nombre = R.string.nomb_mestizo,
            descripcion = R.string.desc_mestizo,
            imagen = R.drawable.mestizo_deli,
            categoria = categoriasEnum.RESTAURANTS
        ),
        LugarRecomendado(
            id = 5,
            nombre = R.string.nomb_la_selva,
            descripcion = R.string.desc_la_selva,
            imagen = R.drawable.parrilla_la_selva,
            categoria = categoriasEnum.RESTAURANTS
        ),
        LugarRecomendado(
            id = 6,
            nombre =R.string.nomb_club_benavidez,
            descripcion =R.string.desc_club_benavidez,
            imagen = R.drawable.el_club_benavidez,
            categoria = categoriasEnum.RESTAURANTS
        ),

        // -niños
        LugarRecomendado(
            id = 7,
            nombre = R.string.nomb_euca_tigre,
            descripcion = R.string.desc_euca_tigre,
            imagen = R.drawable.euca_tigre,
            categoria = categoriasEnum.ENTRETENIMIENTO_NINOS
        ),
        LugarRecomendado(
            id = 8,
            nombre = R.string.nomb_torre_pueblo,
            descripcion =R.string.desc_torre_pueblo,
            imagen = R.drawable.torre_pueblo,
            categoria = categoriasEnum.ENTRETENIMIENTO_NINOS
        ),
        LugarRecomendado(
            id = 9,
            nombre = R.string.nomb_neverland,
            descripcion =R.string.desc_neverland,
            imagen = R.drawable.neverland_nordelta,
            categoria = categoriasEnum.ENTRETENIMIENTO_NINOS
        ),

// parques
        LugarRecomendado(
            id = 10,

            nombre = R.string.nomb_plaza_san_martin,
            descripcion = R.string.desc_plaza_san_martin,
            imagen = R.drawable.plaza_san_martin,
            categoria = categoriasEnum.PARQUES
        ),
        LugarRecomendado(
            id = 11,
            nombre = R.string.nomb_paseo_bahia,
            descripcion = R.string.desc_paseo_bahia,
            imagen = R.drawable.paseo_bahia,
            categoria = categoriasEnum.PARQUES
        ),
        LugarRecomendado(
            id = 12,
            nombre = R.string.nomb_poli_benavidez,
            descripcion = R.string.desc_poli_benavidez,
            imagen = R.drawable.poli_benavidez,
            categoria = categoriasEnum.PARQUES
        ),

       //panaderias
        LugarRecomendado(
            id = 13,
            nombre = R.string.nomb_marino,
            descripcion = R.string.desc_marino,
            imagen = R.drawable.panaderia_marino,
            categoria = categoriasEnum.PANADERIAS
        ),
        LugarRecomendado(
            id = 14,
            nombre = R.string.nomb_alvear,
            descripcion = R.string.desc_alvear,
            imagen = R.drawable.panaderia_alvear,
            categoria = categoriasEnum.PANADERIAS
        ),
        LugarRecomendado(
            id = 15,
            nombre = R.string.nomb_fabrica_pan,
            descripcion = R.string.desc_fabrica_pan,
            imagen = R.drawable.fabrica_de_pan,
            categoria = categoriasEnum.PANADERIAS
        )
    )
}