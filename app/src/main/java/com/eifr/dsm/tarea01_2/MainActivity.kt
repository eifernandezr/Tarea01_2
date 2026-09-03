package com.eifr.dsm.tarea01_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.eifr.dsm.tarea01_2.ui.theme.Tarea01_2Theme
import androidx.compose.foundation.layout.Row

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Tarea01_2Theme() {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    GreetingImage(
//                        message = stringResource(R.string.happy_birthday_text),
//                        from = stringResource(R.string.from_text),
//                    )
//                    TaskManagerApp()
//                    ComposeQuadrant()
                    BusinessCard()
                }
            }
        }


    }
}

@Composable
fun GreetingText(message: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = message,
            fontSize = 100.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .align(alignment = Alignment.End)
        )
    }
}


//@Preview(showBackground = true)
@Composable
fun GreetingTextPreview() {
    Tarea01_2Theme {
        GreetingText(
            message = stringResource(R.string.happy_birthday_text),
            from = stringResource(R.string.from_text)
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.androidparty)

    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5f,
        )
        GreetingText(
            message = message,
            from = from,
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    Tarea01_2Theme() {
        GreetingImage(
            message = stringResource(R.string.happy_birthday_text),
            from = stringResource(R.string.from_text),
        )
    }
}



@Preview(showBackground = true)
@Composable
fun LearnTogetherPreview() {
    Tarea01_2Theme() {
        Column() {
            Header()
            JetpackComposeTutorialText()

            FirstParagraph()
            SecondParagraph()
        }
    }
}
@Composable
fun Header() {
    val image = painterResource(R.drawable.bg_compose_background)
    Box {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
        )
    }
}

@Composable
fun JetpackComposeTutorialText() {
    Box(

    ) {
        Text(
            text = "Jetpack Compose Tutorial",
            textAlign = TextAlign.Left,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(8.dp)
        )
    }
}

@Composable
fun FirstParagraph() {
    Text(
        text = "Jetpack Compose is a modern toolkit for building " +
                "native Android UI. Compose simplifies and " +
                "accelerates UI development on Android with less code, " +
                "powerful tools, and intuitive Kotlin APIs.",
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(8.dp)

    )
}

@Composable
fun SecondParagraph() {
    Text(
        text = "In this tutorial, you build a simple UI component " +
                "with declarative functions. You call Compose functions " +
                "to say what elements you want and the Compose compiler " +
                "does the rest. Compose is built around Composable " +
                "functions. These functions let you define your app's UI " +
                "programmatically because they let you describe how it " +
                "should look and provide data dependencies, rather than " +
                "focus on the process of the UI's construction, such as " +
                "initializing an element and the attaching it to a parent. " +
                "To create a Composable function, you add the @Composable " +
                "annotation to the function name.",
        textAlign = TextAlign.Justify,
        modifier = Modifier
            .padding(8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun TaskManagerAppPreview() {
    Tarea01_2Theme() {
        TaskManagerApp()
    }
}

@Composable
fun TaskManagerApp() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(R.drawable.ic_task_completed),
            contentDescription = null,
        )
        Text(
            text = "All tasks completed",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
        Text(
            text = "Nice work!",
            textAlign = TextAlign.Center,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    Tarea01_2Theme() {
        ComposeQuadrant()
    }
}

@Composable
fun ComposeQuadrant() {
    Column(
        modifier = Modifier.fillMaxSize(),
    ) {
        Row(modifier = Modifier.weight(1f)) {
            Quadrant1(modifier = Modifier.weight(1f))
            Quadrant2(modifier = Modifier.weight(1f))
        }
        Row(modifier = Modifier.weight(1f)) {
            Quadrant3(modifier = Modifier.weight(1f))
            Quadrant4(modifier = Modifier.weight(1f))
        }

    }
}

@Composable
fun Quadrant1(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFEADDFF))
    ) {

        Text(
            text = "Text composable",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Displays text and follows the recommended " +
                    "Material Design guidelines.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(bottom = 16.dp)
        )

    }
}

@Composable
fun Quadrant2(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFD0BCFF))
    ) {
        Text(
            text = "Image composable",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "Creates a composable that lays out and draws " +
                    "a given Painter class object.",
            textAlign = TextAlign.Justify,
        )
    }
}

@Composable
fun Quadrant3(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFB69DF8))
    ) {
        Text(
            text = "Row composable",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "A layout composable that places its children " +
                    "in a horizontal sequence.",
            textAlign = TextAlign.Justify,
        )

    }
}

@Composable
fun Quadrant4(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFF6EDFF))
    ) {

        Text(
            text = "Column composable",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = "A layout composable that places its children " +
                    "in a vertical sequence.",
            textAlign = TextAlign.Justify,
        )
    }

}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Tarea01_2Theme {
        BusinessCard()
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.android_logo)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxSize().background(Color(0xFF0B7FA8))
    ) {
        Spacer(modifier = modifier.weight(1f))
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Fit,
        )
        Text(
            text = "Eddy Fernández",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
        )
        Text(
            text = "Estudiante de Ingeniería de Sistemas",
            textAlign = TextAlign.Center,
            fontSize = 16.sp
        )
        Spacer(modifier = modifier.weight(1f))
        Column(
            verticalArrangement = Arrangement.Bottom,
            modifier = modifier,
        ) {
            Row {
                Text(
                    text = "+51 11552233 97"
                )
            }
            Row {
                Text(
                    text = "@eferriv"
                )
            }
            Row {
                Text(
                    text = "eddy.fernandez@unmsm.edu.pe"
                )
            }
        }
        Spacer(modifier = modifier.weight(1f))
    }
}
