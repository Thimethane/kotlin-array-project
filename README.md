# Kotlin Array Project – Android Studio

This project is a beginner-friendly Android application built in **Kotlin**, demonstrating **array creation, manipulation, and concatenation**. The app displays **first names**, **last names**, and **full names** in a simple UI using a **TextView inside a ScrollView**. It is designed for beginners learning Kotlin fundamentals within Android Studio.

---

## Project Overview

The application performs the following:

- Creates an array of **first names**
- Creates an array of **last names**
- Concatenates both arrays into a **full names array**
- Displays all three arrays on the app screen

---

## Requirements

- **Android Studio Flamingo or later**  
  Download: [https://developer.android.com/studio](https://developer.android.com/studio)

- **Android Virtual Device (AVD)** or real device  
  Recommended: **Google Pixel 7 Pro Emulator**  
  - API Level: 33 or 34  
  - Ensure the emulator is running before launching the app

- **Kotlin Plugin** (bundled with Android Studio)

---

## How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/Thimethane/kotlin-array-project.git
cd kotlin-array-project
```

2. Open the project in Android Studio  
3. Allow Gradle to sync automatically  
4. Launch the **Pixel 7 Pro emulator** (or another device)  
5. Click **Run (▶)** in Android Studio  
6. The app will display the arrays:

```
--- First Names ---
James
Joseph
Art
Len
Don
Sima
Mitsue
Leo
Sage
Krish
Minna
Abe
Kyle
Graciela
Cammi
Matt
Mel
Glady
Yukee

--- Last Names ---
Bhatt
Darakjy
Veere
Paprocki
Foller
Morasca
Toll
Dilli
Wiezer
Marrier
Amigo
Maclead
Caldarera
Roota
Albares
Poquette
Garufi
Rim
Whobrey

--- Full Names ---
James Bhatt
Joseph Darakjy
Art Veere
Len Paprocki
Don Foller
Sima Morasca
Mitsue Toll
Leo Dilli
Sage Wiezer
Krish Marrier
Minna Amigo
Abe Maclead
Kyle Caldarera
Graciela Roota
Cammi Albares
Matt Poquette
Mel Garufi
Glady Rim
Yukee Whobrey
```

---

## Project Structure

```
kotlin-array-project/
├── app/
│   ├── src/main/java/com/example/kotlin_array_project/MainActivity.kt
│   └── src/main/res/layout/activity_main.xml
├── AndroidManifest.xml
└── README.md
```

---

## Kotlin Code Example

```kotlin
fun main() {
    val firstNames = arrayOf("James", "Joseph", "Art", "Len", "Don", "Sima", "Mitsue",
        "Leo", "Sage", "Krish", "Minna", "Abe", "Kyle", "Graciela", "Cammi", "Matt", "Mel", "Glady", "Yukee")

    val lastNames = arrayOf("Bhatt", "Darakjy", "Veere", "Paprocki", "Foller", "Morasca", "Toll",
        "Dilli", "Wiezer", "Marrier", "Amigo", "Maclead", "Caldarera", "Roota", "Albares", "Poquette", "Garufi", "Rim", "Whobrey")

    val fullNames = firstNames.mapIndexed { index, firstName ->
        "$firstName ${lastNames[index]}"
    }.toTypedArray()

    println("--- First Names Array ---")
    firstNames.forEach { println(it) }

    println("\n--- Last Names Array ---")
    lastNames.forEach { println(it) }

    println("\n--- Full Names Array ---")
    fullNames.forEach { println(it) }
}
```

---

## Kotlin Collections Overview

### List
- Ordered collection, allows duplicates
```kotlin
val names = listOf("Alice", "Bob", "Alice") // Immutable
val mutableNames = mutableListOf("Alice", "Bob") // Mutable
```

### Set
- Unordered collection, no duplicates
```kotlin
val uniqueNumbers = setOf(1, 2, 2, 3) // Immutable
val mutableSet = mutableSetOf("A", "B") // Mutable
```

### Map
- Key-value pairs
```kotlin
val inventory = mapOf("apple" to 10, "banana" to 5) // Immutable
val mutableMap = mutableMapOf("user" to "Alex") // Mutable
```

---

## Author

**Timothee RINGUYENEZA**  
Kotlin & Android Development Student  
GitHub Repository: [https://github.com/Thimethane/kotlin-array-project](https://github.com/Thimethane/kotlin-array-project)
```

