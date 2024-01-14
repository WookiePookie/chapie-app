package com.wookiepookie.kanbreeze.platform.android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import com.wookiepookie.kanbreeze.feature.authorization.AppEntry
import dev.icerock.moko.resources.compose.fontFamilyResource
import com.wookiepookie.kanbreeze.style.system.Resources

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppEntry()
        }
    }
}