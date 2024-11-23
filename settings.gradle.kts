pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
        mavenLocal()
    }
}

plugins {
    id("com.javiersc.hubdle.declarative.settings") version "0.1.1-dev.1"
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        mavenLocal()
    }
}

include(":library-a")
