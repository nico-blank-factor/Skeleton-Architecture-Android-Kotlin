package com.example.myrecipeapp.utils

sealed class Screen(val route:String) {
    object RecipeScreen:Screen("recipiescreen")
    object DetailScreen:Screen("detailscreen")
}