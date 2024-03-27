package com.mexiti.navegacion.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.mexiti.navegacion.components.MainButton
import com.mexiti.navegacion.components.MainIconButton
import com.mexiti.navegacion.components.Space
import com.mexiti.navegacion.components.TitleBar
import com.mexiti.navegacion.components.TitleView

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable

fun DetailView(navController: NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { TitleBar(name = "Detail View")},
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = Color.Blue
                ),
                navigationIcon = {
                    MainIconButton(icon = Icons.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ) {

        ContentDetailView(navController = navController)
    }

}


@Composable
fun ContentDetailView(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TitleView(name = "Detail View")
        Space()
        MainButton(name = "HomeView", backColor = Color.Blue, color = Color.White ) {
            navController.popBackStack()
        }
    }

}


@Preview
@Composable
fun DetailViewPreview(){
   // DetailView()
}