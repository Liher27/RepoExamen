package com.example.examencompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.examencompose.ui.theme.ExamenComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExamenComposeTheme {
                GreetingPreview()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = androidx.compose.ui.graphics.Color.Cyan
            )
    ) {
        Row(
            modifier = Modifier
                .padding(top = 40.dp)
                .padding(horizontal = 40.dp)
                .background(color = androidx.compose.ui.graphics.Color.Gray)
                .fillMaxWidth()
                .size(300.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier
                    .align(
                        Alignment.CenterVertically
                    )
                    .padding(top = 40.dp),
            ) {
                Row(
                    modifier = Modifier
                        .background(color = androidx.compose.ui.graphics.Color.Red),
                ) {
                    Text("Hello Android!")
                }
            }
            Column(
                modifier = Modifier
                    .align(
                        Alignment.CenterVertically
                    )
                    .padding(top = 40.dp)
                    .background(color = androidx.compose.ui.graphics.Color.Red),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Hello Android!")
                Text("Hello Android!")
                Text("Hello Android!")
            }
        }
        Row(
            modifier = Modifier
                .background(color = androidx.compose.ui.graphics.Color.White)
                .padding(horizontal = 40.dp)
                .align(Alignment.CenterHorizontally)
                .size(width = 100.dp, height = 150.dp)
        ) {
            Column(
                modifier = Modifier
                    .align(
                        Alignment.CenterVertically
                    )
                    .padding(top = 40.dp)
            ) {
                Text("Hello Android!")
            }
        }

        Row(
            modifier = Modifier
                .background(color = androidx.compose.ui.graphics.Color.Green)
                .padding(horizontal = 40.dp)
                .size(width = 225.dp, height = 200.dp)
                .align(Alignment.CenterHorizontally),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Column(
                modifier = Modifier
                    .background(color = androidx.compose.ui.graphics.Color.Blue)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row {
                    CreateButton(1)
                }
                Row {
                    CreateButton(2)
                }
                Row {
                    CreateButton(3)
                }
            }

            Column(
                modifier = Modifier
                    .background(color = androidx.compose.ui.graphics.Color.Magenta)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row {
                    CreateButton(4)
                }
                Row {
                    CreateButton(5)
                }
                Row {
                    CreateButton(6)
                }
            }
            Column(
                modifier = Modifier
                    .background(color = androidx.compose.ui.graphics.Color.Black)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Row {
                    CreateButton(7)
                }
                Row {
                    CreateButton(8)
                }
                Row {
                    CreateButton(9)
                }
            }
        }
    }
}

@Composable
fun CreateButton(number: Int) {
    Button(
        onClick = {},
        modifier = Modifier
            .border(
                1.dp,
                androidx.compose.ui.graphics.Color.Transparent,
                shape = androidx.compose.foundation.shape.RoundedCornerShape(90)
            )
    ) {
        Text(number.toString())
    }
}
