package com.mexiti.navegacion.views

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.mexiti.navegacion.components.ActionButton
import com.mexiti.navegacion.components.MainButton
import com.mexiti.navegacion.components.Space
import com.mexiti.navegacion.components.TitleBar
import com.mexiti.navegacion.components.TitleView
import kotlin.reflect.KProperty

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeView(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {TitleBar(name = "TopHomeView")},
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Gray
                )
            )
        },
        floatingActionButton = {
            ActionButton()
        }
    ){
        ContentHomeView(navController = navController)
    }

}

@Composable
fun ContentHomeView(navController: NavController){
    val id = 123
    var opcional by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleView(name = "Home View")
        Space()
        TextField(
            value = opcional, onValueChange ={ opcional = it },
            label = { Text(text = "Opcional")} )
        MainButton(name = "DetailView", backColor = Color.Gray, color = Color.White ) {
            navController.navigate("Detail/${id}/?$opcional")
        }
    }

}



@Preview
@Composable
fun HomeViewPreview(){
    //HomeView()
}