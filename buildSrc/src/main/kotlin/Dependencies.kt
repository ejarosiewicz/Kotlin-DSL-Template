object Dependencies {

    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinStdLib}"

    object Test {
        const val jUnit = "junit:junit:${Versions.jUnit}"
    }

    object UITest {
        const val espresso = "com.android.support.test.espresso:espresso-core:${Versions.espresso}"
        const val runner = "com.android.support.test:runner:${Versions.runner}"
    }

    object Compile {
        const val kotlinStdLibJdk = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlinStdLibJdk}"
    }

    object Versions {
        const val kotlinStdLib = "1.2.60"
        const val jUnit = "4.12"
        const val espresso = "3.0.2"
        const val runner = "1.0.2"
        const val kotlinStdLibJdk = "1.2.60"
    }
}