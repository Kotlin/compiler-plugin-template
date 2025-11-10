pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
    
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}

rootProject.name = "compiler-plugin-template"

include("template-compiler-plugin")
include("template-gradle-plugin")
include("template-plugin-annotations")
