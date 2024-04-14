package com.example.hbdapp

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hbdapp.ui.theme.HbdappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HbdappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingText(
                        message = "Happy 20th Birthday!!",
                        from = "From Dad",
                        modifier = Modifier
                            .padding(24.dp)
                            .background(androidx.compose.ui.graphics.Color.Yellow, androidx.compose.foundation.shape.CircleShape)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = message,
            fontFamily = FontFamily.Monospace,
            fontSize = 48.sp,
            lineHeight = 42.sp,
            textAlign = TextAlign.Center
        )

        Text(
            text = from,
            fontFamily = FontFamily.Monospace,
            fontSize = 32.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(36.dp)
        )
    }
}

@Preview(
    showBackground = true,
    name = "Test Preview"
)
@Composable
fun BirthdayCardPreview() {
    HbdappTheme {
        GreetingText(
            message = "A long time ago in a Galaxy far, far away...",
            from = "George Lucas",
            modifier = Modifier.padding(12.dp)
        )
    }
}