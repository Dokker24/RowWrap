plugins {
    id("com.android.library") version "8.2.2"
    id("org.jetbrains.kotlin.android")
    id("maven-publish")
}

android {
    namespace = "ru.den.rowwrap"
    compileSdk = 34

    publishing {
        multipleVariants {
            allVariants()
            withJavadocJar()
            withSourcesJar()
        }
    }

    defaultConfig {
        minSdk = 26
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
    buildFeatures {
        compose = true
    }

    compileOptions {

        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.1"
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

afterEvaluate {
    publishing {
        publications {
            create<MavenPublication>("mavenRelease") {
                groupId = "ru.den"
                artifactId = "rowwrap"
                version = "1.0"

                from(components["release"])
            }
            create<MavenPublication>("mavenDebug") {
                groupId = "ru.den"
                artifactId = "rowwrap"
                version = "1.0"

                from(components["debug"])
            }
        }
    }
}


dependencies {

    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.material3:material3")
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.compose.ui:ui-android:1.6.0")
    implementation("androidx.compose.foundation:foundation-layout-android:1.6.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}