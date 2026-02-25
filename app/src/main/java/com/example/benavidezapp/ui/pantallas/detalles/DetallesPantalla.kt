package com.example.benavidezapp.ui.pantallas.detalles

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.benavidezapp.data.ProveedorDataLocal
import com.example.benavidezapp.model.LugarRecomendado
import com.example.benavidezapp.ui.componentes.LugarItem
import com.example.benavidezapp.utils.categoriasEnum

@Composable
fun detallePantalla(LugarRecomendado: LugarRecomendado,modifier: Modifier = Modifier
    .padding(10.dp)
){


    Column(modifier = modifier.fillMaxWidth().padding(10.dp)) {
        Image(painter = painterResource(id = LugarRecomendado.imagen), contentDescription = null, contentScale = ContentScale.FillWidth)
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = stringResource(id = LugarRecomendado.nombre))
        Spacer(modifier = Modifier.size(10.dp))
        Text(text = stringResource(id = LugarRecomendado.descripcion))





    }


}


@Preview
@Composable
fun detallePantallaPreview(){
   //detallePantalla(categoria = categoriasEnum.CAFETERIAS, LugarRecomendado = ProveedorDataLocal.obtenerLugares().get(0))
}