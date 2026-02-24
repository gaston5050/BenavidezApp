package com.example.benavidezapp.ui.pantallas.categorias

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.benavidezapp.ui.componentes.LugarItem
import com.example.benavidezapp.utils.categoriasEnum


@Composable
fun categoriasPantalla( onItemClick: (categoriasEnum) -> Unit,
                        modifier: Modifier = Modifier.fillMaxWidth()
    .padding(10.dp)){
    val categorias = categoriasEnum.entries

    LazyColumn{
        items(categorias.size) {
            item -> (LugarItem(nombre = categorias[item].nombreRes, imagen = categorias[item].icono, onItemClick = {onItemClick(categorias[item])}))
            Spacer(modifier = Modifier.size(10.dp))
        }
    }


}


@Preview
@Composable
fun categoriasPantallaPreview(){

    //categoriasPantalla()

}