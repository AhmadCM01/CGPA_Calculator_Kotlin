# Student CGPA Calculator (Kotlin)

A professional, modular Command Line Interface (CLI) application built with Kotlin to help students calculate their Semester Grade Point Average (SGPA/CGPA) based on a 5.0 scale.

## 🚀 Overview
This project was developed as a school assignment to demonstrate proficiency in Kotlin, including data classes, modular logic separation, and user input handling.

## 📁 Project Structure
The project is organized into three main files to follow the "Single Responsibility Principle":

* **`Course.kt`**: A data model that holds the structure for each course (Name, Units, Grade).
* **`CGPACalculator.kt`**: The logic engine that performs the mathematical calculations and assigns academic remarks.
* **`Main.kt`**: The entry point of the app that manages the user interface and terminal input.

## 📊 Grading Scale
The app uses the standard 5.0 CGPA scale:
| Grade | Points |
| :--- | :--- |
| **A** | 5.0 |
| **B** | 4.0 |
| **C** | 3.0 |
| **D** | 2.0 |
| **E** | 1.0 |
| **F** | 0.0 |

## 🛠️ How to Run
1.  **Clone the Repository**:
    ```bash
    git clone [https://github.com/AhmadCM01/CGPA_Calculator_Kotlin.git](https://github.com/AhmadCM01/CGPA_Calculator_Kotlin.git)
    ```
2.  **Open in IDE**: Open the project in **IntelliJ IDEA**.
3.  **Configure JDK**: Ensure your Project SDK is set to **JDK 21** (Adoptium Temurin).
4.  **Execute**: Open `Main.kt` and click the **Green Play Triangle** next to the `main` function.

## 📝 Features
* **Dynamic Input**: Ask for any number of courses.
* **Input Protection**: Includes basic `try-catch` blocks to prevent crashes on invalid numbers.
* **Automatic Remarks**: Provides feedback based on the calculated score (e.g., First Class, Second Class Upper).
* **Formatted Output**: CGPA is rounded to 2 decimal places for accuracy.

---
**Developed by:** [Ahmad Umar]  
**Date:** 3rd March 2026
