package com.example.waterremindershwe

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.waterremindershwe.viewmodel.WaterViewModel

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
) {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val waterViewModel:WaterViewModel = remember { WaterViewModel() }
        var waterAmount = waterViewModel.waterAmount.observeAsState(0)

        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {

            Column(
                modifier = Modifier
                    .padding(4.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally

            ) {
                Text(
                    text = "Target Drink",
                    fontSize = 64.sp,
                    modifier = Modifier
                        .padding(bottom = 30.dp)
                )
                Text(

                    text = waterAmount.value.toString() ?: "" + " ml / 3000 ml",
                    fontSize = 32.sp,
                    textAlign = TextAlign.Center
                )
            }

        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(3),
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {

            //for 100 ml
            item {
                TextButton(
                    onClick = {
                        waterViewModel.setNewAmount(100)
                    },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "100 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = {
                        waterViewModel.setNewAmount(200)
                    },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "200 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = { waterViewModel.setNewAmount(300) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "300 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = { waterViewModel.setNewAmount(400) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "400 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = { waterViewModel.setNewAmount(500) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "500 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = { waterViewModel.setNewAmount(600) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "600 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = { waterViewModel.setNewAmount(700) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "700 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = { waterViewModel.setNewAmount(800) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "800 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = { waterViewModel.setNewAmount(900) },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "900 ml")
                }
            }
        }
    }
}
