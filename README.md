# RowWrap🌟

[![](https://jitpack.io/v/Dokker24/RowWrap.svg)](https://jitpack.io/#Dokker24/RowWrap)

RowWrap is a jetpack compose library to make it easy to create beautiful screens for your application.😺 The library allows you to create a Row, but if the element does not fit on the line, it is moved to the next line.😁

# Using

Add it in your root build.gradle at the end of repositories:
```kotlin
dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
```

 Add the dependency:
```kotlin
dependencies {
    implementation 'com.github.Dokker24:RowWrap:1.0.5'
	}
```

# Preview

```kotlin
RowWrap(
    modifier = Modifier.fillMaxSize()
) {
    repead(5) {
       Item()
    }
}

@Composable
fun Item() {
    Card {
      Box(
    modifier = Modifier.fillMaxSize(),
contentAligment = Aligment.Center
         ) {
          Text("Card")
     }
  }
}
```

