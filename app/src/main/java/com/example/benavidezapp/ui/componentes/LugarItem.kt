package com.example.benavidezapp.ui.componentes

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.benavidezapp.R
import com.example.benavidezapp.model.LugarRecomendado


@Composable
fun LugarItem(nombre: Int ,
              imagen: Int,
              onItemClick: () -> Unit,
              ){

    Card(Modifier.fillMaxWidth()
        .clickable { onItemClick() }

        ){
        Row(
            modifier = Modifier.fillMaxWidth().
            padding(10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(painter = painterResource(id = imagen), contentDescription = null,
                modifier = Modifier.size(40.dp)

                    )
            Spacer(modifier = Modifier.size(10.dp))
            Text(text = stringResource(id = nombre),
                textAlign = TextAlign.Left,
                fontWeight = FontWeight.Bold,
                fontSize = 30.sp,
                modifier = Modifier.weight(3f)
                )
        }


    }

}



@Preview
@Composable
fun lugarItemPreview(){
    LugarItem(nombre = R.string.cat_cafeterias , imagen = R.drawable.ic_cafe, onItemClick = {})
}

