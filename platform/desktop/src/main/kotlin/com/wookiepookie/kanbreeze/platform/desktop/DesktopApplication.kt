package com.wookiepookie.kanbreeze.platform.desktop

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() {
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "TimeMates",
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Text("Platform - Desktop")
            }
        }
    }
}