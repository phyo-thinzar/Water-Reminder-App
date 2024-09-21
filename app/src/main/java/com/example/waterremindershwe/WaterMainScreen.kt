package com.example.waterremindershwe

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.waterremindershwe.viewmodel.WaterViewModel

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    waterViewModel: WaterViewModel = hiltViewModel()
) {

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        /*val context = LocalContext.current
        val waterDao = WaterDatabase.getDatabase(context).waterDao()
        val waterSource = WaterLocalSource(waterDao)
        val waterRepository = WaterRepository(waterSource)
        val waterViewModel:WaterViewModel = remember { WaterViewModel(waterRepository) }
*/

        var waterAmount by remember { mutableStateOf(0) }
        var waterId by remember { mutableStateOf(0) }

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
                    fontSize = 54.sp,
                    modifier = Modifier
                        .padding(bottom = 30.dp)

                )
                Log.d("Pass","Taget Drink")
                Text(

                    text = "$waterAmount ml / 2200 ml" ,
                    fontSize = 32.sp,
                    textAlign = TextAlign.Center

                )
                Log.d("Pass","Water Amount : ${waterAmount}")
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
                        waterAmount += 100
                        if(waterAmount == 0){
                            waterViewModel.insert(waterAmount)
                        }else{
                            //waterViewModel.updateWaterAmount(waterId,waterAmount)
                        }

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
                        waterAmount += 200
                        if(waterAmount == 0){
                            waterViewModel.insert(waterAmount)
                        }else{
                           // waterViewModel.updateWaterAmount(waterId,waterAmount)
                        }
                    },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "200 ml")

                }
            }

            //
            item {
                TextButton(
                    onClick = {
                        waterAmount += 300
                        if(waterAmount == 0){
                            waterViewModel.insert(waterAmount)
                        }else{
                           //waterViewModel.updateWaterAmount(waterId,waterAmount)
                        }
                              },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "300 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = {
                        waterAmount += 400
                        if(waterAmount == 0){
                            waterViewModel.insert(waterAmount)
                        }else{
                            //waterViewModel.updateWaterAmount(waterId,waterAmount)
                        }
                              },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "400 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = {
                        waterAmount += 500
                        if(waterAmount == 0){
                            waterViewModel.insert(waterAmount)
                        }else{
                            //waterViewModel.updateWaterAmount(waterId,waterAmount)
                        }
                              },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "500 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = {
                        waterAmount += 600
                        if(waterAmount == 0){
                            waterViewModel.insert(waterAmount)
                        }else{
                            //waterViewModel.updateWaterAmount(waterId,waterAmount)
                        }
                              },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "600 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = {
                        waterAmount += 700
                        if(waterAmount == 0){
                            waterViewModel.insert(waterAmount)
                        }else{
                           // waterViewModel.updateWaterAmount(waterId,waterAmount)
                        }
                              },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "700 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = { waterAmount += 800
                        if(waterAmount == 0){
                            waterViewModel.insert(waterAmount)
                        }else{
                            //waterViewModel.updateWaterAmount(waterId,waterAmount)
                        } },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "800 ml")
                }
            }

            //
            item {
                TextButton(
                    onClick = {
                        waterAmount += 900
                        if(waterAmount == 0){
                            waterViewModel.insert(waterAmount)
                        }else{
                            //waterViewModel.updateWaterAmount(waterId,waterAmount)
                        }
                              },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "900 ml")
                }
            }
        }

        //show Resultbutton
        Button(onClick = {
            waterViewModel.showResult()
        }) {
            Text(text = "Show Result")
        }
    }
}
