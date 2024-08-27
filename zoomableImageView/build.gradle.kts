plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("maven-publish")
}

android {
    namespace = "com.nannoo.zoomableimageview"
    compileSdk = 34

    defaultConfig {
        minSdk = 24

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    java{
        toolchain{
            languageVersion = JavaLanguageVersion.of(17)
        }
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}


publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "com.github.nannoo.developer"
            artifactId = "zoomableImageView"
            version = "1.0"
            pom{
                description = "Zoom Image Library"
            }
        }
    }
    repositories{
        mavenLocal()
    }
}

//repositories {
//    maven {
//        name = "GithubPackages"
//        url = uri("https://maven.pkg.github.com/NannOo-Developer/ZoomableImage")
//        credentials {
//            username = "NannOo"
//            password = "mno@$123"
//        }
//    }
//}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}