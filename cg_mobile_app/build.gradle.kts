// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0" apply false
    id("org.jetbrains.kotlin.android") version "1.9.0" apply false
    id("com.google.gms.google-services") version "4.4.2" apply false
}
buildscript {
    repositories {
        google()
        mavenCentral()  // Add this to ensure mavenCentral is included for classpath dependencies
    }
    dependencies {
        classpath ("com.google.ar.sceneform:plugin:1.15.0")
    }
}