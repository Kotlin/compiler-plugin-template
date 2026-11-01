plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(libs.devkit.settings)
    implementation(libs.devkit.plugins)
    implementation(kotlin("gradle-plugin", libs.versions.kotlin.get()))
}
