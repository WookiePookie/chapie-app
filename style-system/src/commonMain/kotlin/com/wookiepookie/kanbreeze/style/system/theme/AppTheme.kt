package com.wookiepookie.kanbreeze.style.system.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

/**
 * Singleton object representing the application theme.
 */
object AppTheme {
    /**
     * The [AppColors] instance representing the colors for the current application theme.
     * The color values are read from the [LocalAppColors].
     *
     * @see LocalAppColors
     */
    val colors: AppColors
        @[Composable ReadOnlyComposable]
        get() = LocalAppColors.current
}


@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (!useDarkTheme) {
        MaterialLightColors
    } else {
        MaterialDarkColors
    }

    CompositionLocalProvider(
        LocalAppColors provides lightColors(),
    ) {
        MaterialTheme(colorScheme = colors) {
            Surface {
                content()
            }
        }
    }
}