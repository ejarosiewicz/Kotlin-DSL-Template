import com.android.tools.r8.ir.code.And
import org.jetbrains.kotlin.config.KotlinCompilerVersion

plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    compileSdkVersion(AndroidVersions.compileSdkVersion)
    defaultConfig {
        applicationId = "com.ejarosiewicz.premiumm"
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
    implementation(Dependencies.kotlinStdLib)
    testImplementation(Dependencies.Test.jUnit)
    androidTestImplementation(Dependencies.UITest.espresso)
    androidTestImplementation(Dependencies.UITest.runner)
    compile(Dependencies.Compile.kotlinStdLibJdk)
}