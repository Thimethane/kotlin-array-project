# 📱 Kotlin Arrays Project – Android Studio / Kotlin Basics

This repository contains a simple Kotlin program demonstrating how to:

- Create arrays in Kotlin
- Store first names and last names separately
- Concatenate two arrays using `mapIndexed()`
- Output all arrays (first names, last names, and full names)
- Run Kotlin code using Android Studio or IntelliJ IDEA

It is built as part of an introductory Android development assignment.

---

## 🚀 Project Overview

The project includes:

- `Main.kt` → Kotlin code that:
    - Declares two arrays (first names and last names)
    - Combines them into a third array (full names)
    - Prints each array to the console

This project can be run directly inside Android Studio’s Kotlin console or any Kotlin-compatible IDE.

---

## 🧾 Code Used in This Project

Located in: **src/Main.kt**

```kotlin
fun main() {

    val firstNames = arrayOf(
        "James", "Joseph", "Art", "Len", "Don", "Sima", "Mitsue",
        "Leo", "Sage", "Krish", "Minna", "Abe", "Kyle", "Graciela",
        "Cammi", "Matt", "Mel", "Glady", "Yukee"
    )

    val lastNames = arrayOf(
        "Bhatt", "Darakjy", "Veere", "Paprocki", "Foller", "Morasca", "Toll",
        "Dilli", "Wiezer", "Marrier", "Amigo", "Maclead", "Caldarera", "Roota",
        "Albares", "Poquette", "Garufi", "Rim", "Whobrey"
    )

    val fullNames = firstNames.mapIndexed { index, firstName ->
        "$firstName ${lastNames[index]}"
    }.toTypedArray()

    println("--- First Names ---")
    firstNames.forEach { println(it) }

    println("\n--- Last Names ---")
    lastNames.forEach { println(it) }

    println("\n--- Full Names ---")
    fullNames.forEach { println(it) }
}
```

---

## ▶️ Running the Program

### Option 1 — Android Studio
1. Open **Android Studio**
2. Create a new **Kotlin/JVM project**
3. Replace the default `Main.kt` with the file in this repo
4. Press **Run**

### Option 2 — IntelliJ IDEA
1. Open IntelliJ
2. Create a **Kotlin/JVM** project
3. Paste the code
4. Run the program

---

## 📂 Project Structure

```
kotlin-array-project
│
├── src/
│   └── Main.kt
│
└── README.md
```

---

## 🧪 Sample Output

```
--- First Names ---
James
Joseph
Art
...

--- Last Names ---
Bhatt
Darakjy
Veere
...

--- Full Names ---
James Bhatt
Joseph Darakjy
Art Veere
...
```

---

## 👨‍💻 Author
Student(Timothee RINHUYENEZA) Project – Android Development Basics  
Kotlin Beginner Practice

---

## ⭐ If you like this structure, feel free to reuse it for future Kotlin or Android Studio assignments!
