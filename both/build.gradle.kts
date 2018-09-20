import com.android.tools.r8.ir.code.And
import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(AndroidVersions.compileSdkVersion)
    defaultConfig {
        minSdkVersion(AndroidVersions.minSdkVersion)
        targetSdkVersion(AndroidVersions.targetSdkVersion)
        versionCode = AndroidVersions.versionCode
        versionName = AndroidVersions.versionName
        testInstrumentationRunner = AndroidSettings.testInstrumentationRunner
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
        getByName("debug") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(Dependencies.kotlinStdLib)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.UITest.espresso)
    androidTestImplementation(Dependencies.UITest.runner)
}