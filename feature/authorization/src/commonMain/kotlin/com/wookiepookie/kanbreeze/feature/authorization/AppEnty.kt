package com.wookiepookie.kanbreeze.feature.authorization

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import dev.icerock.moko.resources.compose.fontFamilyResource
import com.wookiepookie.kanbreeze.style.system.Resources
import com.wookiepookie.kanbreeze.style.system.theme.AppTheme
import dev.icerock.moko.resources.compose.asFont
import dev.icerock.moko.resources.compose.colorResource

@Composable
fun AppEntry() {
    AppTheme {
        Box(Modifier.background(Color.White)) {
            Text(
                text = "Hello World",
                color = colorResource(Resources.colors.valueColor),
                fontFamily = FontFamily.SansSerif
            )
        }
    }
}