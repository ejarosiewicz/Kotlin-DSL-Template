import app.AppSettings
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
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.2.61")
    implementation("com.android.support:appcompat-v7:28.0.0-rc02")
    implementation("com.android.support.constraint:constraint-layout:1.1.3")
    implementation("com.android.support:design:28.0.0-rc02")
    testImplementation("junit:junit:4.12")
    androidTestImplementation("com.android.support.test:runner:1.0.2")
    androidTestImplementation("com.android.support.test.espresso:espresso-core:3.0.2")
}
