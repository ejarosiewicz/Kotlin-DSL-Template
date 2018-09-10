buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:3.1.4")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.61")
    }
}

allprojects {
    repositories {
        maven("https://maven.google.com")
        jcenter()
        google()
    }
}

//tasks.register("clean", Delete::class.java) {
//    delete(rootProject.buildDir)
//}