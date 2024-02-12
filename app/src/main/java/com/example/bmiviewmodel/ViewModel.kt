package com.example.bmiviewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel() {
    var heightInput: MutableState<String> = mutableStateOf("")
    var weightInput: MutableState<String> = mutableStateOf("")

    fun calculateBmi(): Float {
        val height = heightInput.value.toFloatOrNull() ?: 0.0f
        val weight = weightInput.value.toIntOrNull() ?: 0
        return if (weight > 0 && height > 0) weight / (height * height) else 0.0f
    }
}
