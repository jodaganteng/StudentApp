plugins {
    id(com.android.application)
    id(kotlin - android)
    id(kotlin - kapt)
}

android {
    compileSdk 34

    defaultConfig {
        applicationId "com.example.studentapp"
        minSdk 21
        targetSdk 34
        versionCode 1
        versionName "1.0"
    }

    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android-optimize.txt'), 'proguard-rules.pro'
        }
    }
    compileOptions {
        sourceCompatibility JavaVersion.VERSION_1_8
                targetCompatibility JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = '1.8'
    }
    buildFeatures {
        viewBinding true
    }
}

dependencies {
    implementation (androidx.core:core-ktx:1.10.1)
    implementation (androidx.appcompat:appcompat:1.6.1)
    implementation (com.google.android.material:material:1.9.0)
    implementation (androidx.constraintlayout:constraintlayout:2.1.4)
    implementation (androidx.recyclerview:recyclerview:1.3.0)
    implementation (androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.1)
    implementation (androidx.lifecycle:lifecycle-livedata-ktx:2.6.1)
    implementation (org.jetbrains.kotlinx:kotlinx-coroutines-android:
    implementation(libs.androidx.appcompat)1.6.4)
    implementation(libs.androidx.recyclerview)
}