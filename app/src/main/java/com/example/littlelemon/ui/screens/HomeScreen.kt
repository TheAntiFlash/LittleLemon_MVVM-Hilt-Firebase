package com.example.littlelemon.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.littlelemon.DrawerContent
import com.example.littlelemon.TopAppBar
import com.example.littlelemon.UpperPanel
import com.example.littlelemon.ui.components.LowerPanel
import com.example.littlelemon.ui.viewmodel.DishViewModel

@Composable
fun HomeScreen(navController: NavHostController, viewModel: DishViewModel) {
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    Scaffold(drawerContent = { DrawerContent() }, scaffoldState = scaffoldState,  ) {
        Column(Modifier.padding(it)) {
            TopAppBar(scaffoldState = scaffoldState, scope = coroutineScope)
            UpperPanel()
            LowerPanel(navController, viewModel = viewModel)
        }
    }

}
