package com.example.benavidezapp.ui.pantallas.recomendaciones

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.benavidezapp.data.ProveedorDataLocal
import com.example.benavidezapp.ui.componentes.LugarItem
import com.example.benavidezapp.ui.pantallas.categorias.categoriasPantalla
import com.example.benavidezapp.utils.categoriasEnum


@Composable
fun recomendacionesPantalla(modifier: Modifier = Modifier.fillMaxWidth()
    .padding(10.dp), categoria: categoriasEnum,){

    val lugares = ProveedorDataLocal.filtrado(categoria)
    LazyColumn{
        items(lugares.size) {

                item -> (LugarItem(nombre = lugares[item].nombre, imagen = lugares[item].imagen,onItemClick = {}))
            Spacer(modifier = Modifier.size(10.dp))
        }
    }


}


@Preview
@Composable
fun categoriasPantallaPreview(){
    recomendacionesPantalla(categoria = categoriasEnum.CAFETERIAS)
}