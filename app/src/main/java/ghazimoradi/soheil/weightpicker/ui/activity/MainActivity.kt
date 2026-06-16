package ghazimoradi.soheil.weightpicker.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle.Companion.dark
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ghazimoradi.soheil.weightpicker.ui.components.Scale
import ghazimoradi.soheil.weightpicker.ui.components.ScaleStyle
import ghazimoradi.soheil.weightpicker.ui.theme.Gray
import ghazimoradi.soheil.weightpicker.ui.theme.Green
import ghazimoradi.soheil.weightpicker.ui.theme.LightGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge(
            statusBarStyle = dark(Gray),
            navigationBarStyle = dark(Gray)
        )

        setContent {

            var weight by remember {
                mutableIntStateOf(68)
            }

            Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(innerPadding)
                        .background(LightGray)
                ) {
                    Text(
                        text = "Select your weight",
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold
                    )

                    50.ToSpace()

                    Row {
                        Text(
                            text = "$weight",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                        10.ToSpace()
                        Text(
                            color = Green,
                            text = "KG",
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    50.ToSpace()

                    Scale(
                        style = ScaleStyle(scaleWidth = 150.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                    ) {
                        weight = it
                    }
                }
            }
        }
    }
}

@Composable
fun Int.ToSpace() = Spacer(Modifier.size(this.dp))