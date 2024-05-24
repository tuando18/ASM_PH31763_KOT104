plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.dovantuan.asm_ph31763_kot104"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.dovantuan.asm_ph31763_kot104"
        minSdk = 31
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activity)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation("com.google.android.material:material:1.12.0")

    // thư viện chuyển màn hình
    implementation("androidx.navigation:navigation-compose:2.7.7")

    implementation ("com.github.skydoves:landscapist-glide:1.5.2")
    // or
    implementation ("com.github.skydoves:landscapist-coil:1.5.2")
    // or
    implementation ("com.github.skydoves:landscapist-fresco:1.5.2")

    implementation ("io.coil-kt:coil-compose:1.3.1")

    implementation ("androidx.compose.ui:ui:1.4.0")
//    implementation "androidx.compose.material:material:1.4.0"
//    implementation "androidx.compose.material3:material3:1.0.0"
//    implementation "androidx.activity:activity-compose:1.4.0"
//    implementation "com.github.skydoves:landscapist-coil:1.5.2"

}