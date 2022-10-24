package com.google.firebase.quickstart.auth.ablazycolumnlazyrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.firebase.quickstart.auth.ablazycolumnlazyrow.ui.theme.AbLazyColumnLazyRowTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                    AbLazyColRow()
        }
    }
}

@Composable
fun AbListListScopeSample(){
    LazyColumn {
        // Add a single item
        item {
            Text(text = "Header")
        }

        // Add 3 items
        items(3) { index ->
            Text(text = "First List items : $index")
        }

        // Add 2 items
        items(2) { index ->
            Text(text = "Second List Items: $index")
        }

        // Add another single item
        item {
            Text(text = "Footer")
        }
    }
}

private val countryList =
    mutableListOf("India", "Pakistan", "China", "United States")

private val listModifier = Modifier
    .fillMaxSize()
    .background(Color.Gray)
    .padding(10.dp)

private val textStyle = TextStyle(fontSize = 20.sp, color = Color.White)

@Composable
fun AbSimpleListView() {
    LazyColumn(modifier = listModifier) {
        items(countryList) { country ->
            Text(text = country, style = textStyle)
        }
    }
}

@Composable
fun AbLazyColRow()
{
    Column {
              AbListListScopeSample()
              AbSimpleListView()

    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun defaultPreview()
{
    AbLazyColRow()
}