object GlobalDependencies {

    const val buildGradleTools = "com.android.tools.build:gradle:${Version.buildGradleTools}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlinGradlePlugin}"

    object Version {
        const val buildGradleTools = "3.1.4"
        const val kotlinGradlePlugin = "1.2.61"
    }
}