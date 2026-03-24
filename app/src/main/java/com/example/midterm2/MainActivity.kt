package com.example.midterm2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.midterm2.ui.theme.Midterm2Theme
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material3.Button
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

import androidx.compose.runtime.mutableStateOf

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Midterm2Theme {
                Scaffold { innerPadding ->
                    CounterScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

class CounterViewModel: ViewModel(){
    var count by mutableStateOf(0)
        private set
    fun increment() {
        count++
    }
}

@Composable
fun CounterScreen(modifier: Modifier = Modifier, viewModel: CounterViewModel = viewModel()
){
    Counter(
        viewModel.count,
        { viewModel.increment()} ,
        modifier = modifier

    )
}



@Composable
fun Counter(
    current: Int,
    onIncrement: () -> Unit,
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Count: $current")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = onIncrement) {
            Text("Increment")
        }
    }
}



@Preview(showBackground = true)
@Composable
fun CounterPreview() {
    Midterm2Theme {
        Counter(
            current = 0,
            onIncrement = {}
        )
    }
}