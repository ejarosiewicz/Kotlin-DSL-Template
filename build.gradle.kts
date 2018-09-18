buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(GlobalDependencies.buildGradleTools)
        classpath(GlobalDependencies.kotlinGradlePlugin)
    }
}

allprojects {
    repositories {
        maven("https://maven.google.com")
        jcenter()
        google()
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}