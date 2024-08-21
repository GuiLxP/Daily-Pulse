plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.louiscad.complete-kotlin") version "1.1.0"
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinMultiplatform).apply(false)
}
