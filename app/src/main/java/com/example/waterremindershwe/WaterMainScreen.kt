package com.example.waterremindershwe

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import com.example.waterremindershwe.viewmodel.WaterViewModel

@Composable
fun MainScreen(modifier: Modifier = Modifier,
               waterViewModel: WaterViewModel) {

    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        CustomPorgressIndicator()
        WaterAmountChoicer()
    }
}

@Composable
fun CustomPorgressIndicator(modifier: Modifier = Modifier,) {

    Box(modifier = Modifier
        .fillMaxWidth(),
        contentAlignment = Alignment.Center
        ){

        Column(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Text(text = "Target Drink",
                fontSize = 64.sp,
                modifier = Modifier
                    .padding(bottom = 30.dp))
            Text(text = "1000 / 2500 ml",
                fontSize = 32.sp,
                textAlign = TextAlign.Center)
        }

    }

    /*var waterAmount by remember { mutableStateOf(0.6f) }
    val animatedProgress = animateFloatAsState(
        targetValue = waterAmount,
        animationSpec = ProgressIndicatorDefaults.ProgressAnimationSpec
    ).value

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp)
                .padding(top = 32.dp)
                .background(MaterialTheme.colorScheme.onPrimaryContainer),
            contentAlignment = Alignment.Center
        ){
            LinearProgressIndicator(
                progress = animatedProgress,
                modifier = Modifier
                    .height(32.dp)
                    .width(300.dp)
                    .clip(RoundedCornerShape(16.dp)),
                color = Color.Blue,
                trackColor = Color.LightGray


            )
        }*/
}

@Composable
fun WaterAmountChoicer(modifier: Modifier = Modifier) {

    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        //
        item{
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)) {
                Text(text = "1")
            }
        }

        //
        item{
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)) {
                Text(text = "1")
            }
        }

        //
        item{
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)) {
                Text(text = "1")
            }
        }

        //
        item{
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)) {
                Text(text = "1")
            }
        }

        //
        item{
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)) {
                Text(text = "1")
            }
        }

        //
        item{
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)) {
                Text(text = "1")
            }
        }

        //
        item{
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)) {
                Text(text = "1")
            }
        }

        //
        item{
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)) {
                Text(text = "1")
            }
        }

        //
        item{
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)) {
                Text(text = "1")
            }
        }

        //
        item{
            TextButton(onClick = { /*TODO*/ },
                modifier = Modifier.padding(8.dp)) {
                Text(text = "1")
            }
        }
    }
    /*
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(9) { index ->

            TextButton(onClick = { *//*TODO*//* }) {
                text = "Item $index",
                modifier = Modifier.padding(8.dp)
            }
            *//* Text(
                text = "Item $index",
                modifier = Modifier.padding(8.dp)
            )*//*
        }
    }*/
    
}


/*@Preview
@Composable
private fun MainScreenPreview() {
    val waterViewModel = WaterViewModel();
    MainScreen(
        waterViewModel = waterViewModel
    )
}*/
/*@Preview
@Composable
private fun CustomProgressIndicatorPreview() {
    CustomPorgressIndicator()
}*/

/*
@Preview
@Composable
private fun WaterAmountChoicerPreview() {
    WaterAmountChoicer()
}*/
