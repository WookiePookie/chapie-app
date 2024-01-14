import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.compose.multiplatform)
    //application
}

dependencies {
    implementation(compose.desktop.currentOs)
    implementation(compose.runtime)
    implementation(projects.styleSystem)
    implementation(libs.moko.resources.compose)
    implementation(libs.moko.resources)
    implementation(projects.feature.authorization)
}

java {
    sourceCompatibility = JavaVersion.VERSION_19
    targetCompatibility = JavaVersion.VERSION_19
}

compose.desktop {
    application {
        mainClass = "DesktopApplicationKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb, TargetFormat.Exe)
            packageName = "Kanbreeze"
            packageVersion = "1.0.0"
        }
    }
}



//tasks.withType<Zip> {
//    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
//}
//
//tasks.withType<Jar> {
//    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
//}
//
//tasks.withType<Tar> {
//    duplicatesStrategy = DuplicatesStrategy.EXCLUDE
//}