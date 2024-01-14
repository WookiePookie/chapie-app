plugins {
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
}

kotlin {
    jvm()
    android()

    jvmToolchain(19)
}

dependencies {
    commonMainImplementation(compose.ui)
    commonMainImplementation(compose.foundation)
    commonMainImplementation(compose.runtime)
    commonMainImplementation(compose.material3)
    commonMainImplementation(compose.materialIconsExtended)
    commonMainImplementation(compose.uiTooling)
    commonMainImplementation(projects.styleSystem)

    commonMainImplementation(libs.moko.resources.compose)
    commonMainImplementation(libs.moko.resources)
}

android {
    namespace = "com.wookiepookie.kanbreeze.feature.authorization"
    compileSdk = libs.versions.compileSdk.get().toInt()
}
