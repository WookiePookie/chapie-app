plugins {
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.android.library)
    alias(libs.plugins.compose.multiplatform)
    alias(libs.plugins.moko.multiplatform.resources)
}

kotlin {
    jvm()
    android()


    sourceSets {
        val commonMain by getting {
            kotlin.srcDir("build/generated/moko/commonMain")
        }

        val androidMain by getting {
            kotlin.srcDir("build/generated/moko/androidMain")
        }

        val jvmMain by getting {
            kotlin.srcDir("build/generated/moko/jvmMain")
        }
    }
}

kotlin {
    jvmToolchain(19)
}

dependencies {
    commonMainApi(compose.ui)
    commonMainImplementation(compose.material)
    commonMainApi(compose.material3)
    commonMainApi(compose.animation)
    commonMainApi(compose.foundation)
    commonMainApi(compose.materialIconsExtended)

    commonMainImplementation(libs.moko.resources)
    commonMainImplementation(libs.moko.resources.compose)

}


android {
    namespace = "com.wookiepookie.kanbreeze.style.system"
    compileSdk = libs.versions.compileSdk.get().toInt()
}

multiplatformResources {
    multiplatformResourcesPackage = "com.wookiepookie.kanbreeze.style.system"
    multiplatformResourcesClassName = "Resources"
}