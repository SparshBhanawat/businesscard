package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinesscardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinesscardTheme {
                    BusinessCard(
                        modifier = Modifier
                    )
                }
            }
        }
    }


@Composable
fun BusinessCard(modifier: Modifier){
        val image4 = painterResource(id = R.drawable.android_logo)
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize().background(Color(0xFF3ddc84))


        ) {
            Image(
                painter = image4,
                contentDescription = null,
                modifier = modifier.size(200.dp).background(Color(0xFF004d00))
            )

            Text(
                text = "Sparsh Bhanawat",
                fontWeight = FontWeight.Bold,
                fontSize = 26.sp,
                color = Color(0xFF004d00)
            )
            Text(
                text = "Developer",
                fontWeight = FontWeight.Bold,
                fontSize = 17.sp,
                color = Color(0xFF004d00)
            )

        }
    }

@Composable
fun Contact(modifier: Modifier = Modifier){
    val image1 = painterResource(id = R.drawable.baseline_call_24)
    val image2 = painterResource(id = R.drawable.baseline_share_24)
    val image3 = painterResource(id = R.drawable.baseline_mail_24)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(40.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row {
            Image(painter = image1, contentDescription = null )
            Text(
                text = "+1234567890",
                modifier = Modifier.padding(5.dp),
                color = Color(0xFF004d00)
            )
        }
        Row {
            Image(painter = image2, contentDescription = null)
            Text(
                text = "@AndroidDev",
                modifier = Modifier.padding(5.dp)


            )
        }
        Row {
            Image(painter = image3, contentDescription = null)
            Text(
                text = "sparsh@android.com",
                modifier = Modifier.padding(5.dp)
            )
        }
    }
}








@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinesscardTheme {
        BusinessCard(modifier = Modifier)
        Contact()
    }
}