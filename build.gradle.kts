// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
}

ext {
    mapkitApiKey = getMapkitApiKey()
}

if (rootProject.file("local.properties").exists()) {
    properties.load(rootProject.file("local.properties").newDataInputStream())
}

buildConfigField "String", "MAPS_API_KEY", "${properties.getProperty("MAPS_API_KEY", "")}"