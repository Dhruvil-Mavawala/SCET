plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.scet"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.scet"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    implementation(libs.firebase.database)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("com.airbnb.android:lottie:6.5.1")
    implementation ("com.google.android.material:material:1.2.1")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation("com.google.firebase:firebase-storage:21.0.0")
    implementation("com.firebaseui:firebase-ui-database:8.0.0")
    implementation ("com.github.dhaval2404:imagepicker:2.1")
    implementation ("com.google.android.gms:play-services-auth:21.2.0")
    implementation("com.google.firebase:firebase-analytics:21.2.0")
    implementation("com.google.firebase:firebase-bom:33.3.0")
    implementation ("com.orhanobut:dialogplus:1.11@aar")
}