package com.example.benavidezapp.ui.pantallas.categorias

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.benavidezapp.ui.componentes.LugarItem
import com.example.benavidezapp.utils.categoriasEnum


@Composable
fun categoriasPantalla(modifier: Modifier = Modifier.fillMaxWidth()){
    LazyColumn{
        items(categoriasEnum.entries) {
            item -> (LugarItem(nombre = item.nombre, imagen= item.icono))
        }
    }


}