package com.wookiepookie.kanbreeze.platform.desktop

import androidx.compose.material3.Text
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.wookiepookie.kanbreeze.feature.authorization.AppEntry
import dev.icerock.moko.resources.compose.colorResource

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "TimeMates",
    ) {
        AppEntry()
    }
}