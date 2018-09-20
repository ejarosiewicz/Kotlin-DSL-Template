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
        google()
        maven("https://maven.google.com")
        jcenter()
    }
}

tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}