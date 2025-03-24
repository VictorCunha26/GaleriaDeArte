package com.example.galeriadearte

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlurEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.galeriadearte.R
import com.example.galeriadearte.ui.theme.GaleriaDeArteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GaleriaDeArteTheme{
                GaleriaApp()
            }
        }   }
}

@Composable
fun GaleriaApp(){
    var fotodeagora by remember { mutableIntStateOf(1)}
    when (fotodeagora){
        1 -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)

            ) {
                Image(
                    painter = painterResource(R.drawable.foto1), // Carrega a imagem.
                    contentDescription = stringResource(R.string.foto1), // Texto alternativo
                    modifier = Modifier
                        .wrapContentSize()
                        .background(color = Color.White)
                        .padding(horizontal = 40.dp)
                        .padding(vertical = 40.dp)
                )
                Spacer(modifier = Modifier.height(150.dp))
                Text(text = stringResource(R.string.foto1),
                    fontSize = 15.sp,
                    modifier = Modifier
                        .width(300.dp)
                        .background(color = Color(0xFFB7D6DC))
                        .padding(10.dp)
                )
                Spacer(modifier = Modifier.height(100.dp))
                Row {
                    Text(text = stringResource(R.string.previous),
                        fontSize = 20.sp,
                        modifier = Modifier
                            .background(color = Color(65, 95, 171), shape = RoundedCornerShape(10.dp))
                            .clickable { fotodeagora = 1 }
                            .padding(10.dp)
                    )
                    Spacer(modifier = Modifier.width(100.dp))
                    Text(text = stringResource(R.string.next),
                        fontSize = 20.sp,
                        modifier = Modifier
                            .background(color = Color(65, 95, 171), shape = RoundedCornerShape(10.dp))
                            .clickable { fotodeagora = 2 }
                            .padding(10.dp)
                    )
                }
            }
        }
        2 -> {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp)

            ) {
                Image(
                    painter = painterResource(R.drawable.foto2), // Carrega a imagem.
                    contentDescription = stringResource(R.string.foto2), // Texto alternativo
                    modifier = Modifier
                        .wrapContentSize()
                        .background(color = Color.White)
                        .padding(horizontal = 40.dp)
                        .padding(vertical = 40.dp)
                )
                Spacer(modifier = Modifier.height(150.dp))
                Text(text = stringResource(R.string.foto2),
                    fontSize = 15.sp,
                    modifier = Modifier
                        .width(300.dp)
                        .background(color = Color(0xFFB7D6DC))
                        .padding(10.dp)
                )
                Spacer(modifier = Modifier.height(100.dp))
                Row {
                    Text(text = stringResource(R.string.previous),
                        fontSize = 20.sp,
                        modifier = Modifier
                            .background(color = Color(65, 95, 171), shape = RoundedCornerShape(10.dp))
                            .clickable { fotodeagora = 1 }
                            .padding(10.dp)
                    )
                    Spacer(modifier = Modifier.width(100.dp))
                    Text(text = stringResource(R.string.next),
                        fontSize = 20.sp,
                        modifier = Modifier
                            .background(color = Color(65, 95, 171), shape = RoundedCornerShape(10.dp))
                            .clickable { fotodeagora = 2 }
                            .padding(10.dp)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GaleriaDeArteTheme{
        GaleriaApp()
    }
}