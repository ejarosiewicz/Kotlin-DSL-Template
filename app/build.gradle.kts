import app.AppSettings
import app.ApppDependencies
import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
   id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(AndroidVersions.compileSdkVersion)
    defaultConfig {
        applicationId = AppSettings.applicationId
        minSdkVersion(AndroidVersions.minSdkVersion)
        targetSdkVersion(AndroidVersions.targetSdkVersion)
        versionCode = AndroidVersions.versionCode
        versionName = AndroidVersions.versionName
        testInstrumentationRunner = AndroidSettings.testInstrumentationRunner
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.kotlinStdLib)
    implementation(ApppDependencies.appCompat)
    implementation(ApppDependencies.constraintLayout)
    implementation(ApppDependencies.design)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.UITest.espresso)
    androidTestImplementation(Dependencies.UITest.runner)
}
