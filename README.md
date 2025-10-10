# 1.2.10-MadLibs

## Purpose

This program is a classic Mad Libs game implemented in Java. It prompts the user to enter various types of words (nouns, verbs, adjectives, etc.) and then substitutes those words into a pre-written story. The goal is to create a funny or nonsensical story based on the user's input. The program separates user input collection from story generation for a clean and modular design.

## Setup

To set up and run this project, you need a Java Development Kit (JDK) installed on your system.

1.  **Clone or download the repository:**
    ```bash
    git clone <repository-url>
    cd <repository-directory>
    ```
2.  **Compile the Java file:**
    Open a terminal or command prompt and navigate to the directory containing `AmanchiBhutaniMadLibs.java`. Then, compile the source code:
    ```bash
    javac AmanchiBhutaniMadLibs.java
    ```

## Usage

After successful compilation, run the program from the terminal with the following command:
```bash
java AmanchiBhutaniMadLibs
```
The program will prompt you to enter a series of words one by one. After you provide all the requested words, the final Mad Libs story will be generated and displayed in the console.

---

## Screenshots of Program Functionality

### 1. Program Prompting for Inputs
<img width="500" height="144" alt="Screenshot 2025-10-07 at 10 53 36 AM" src="https://github.com/user-attachments/assets/0fb02c48-745e-4e9b-b8a1-746fb08b65dd" />

### 2. Final Mad Lib Output
<img width="1161" height="65" alt="Screenshot 2025-10-07 at 10 53 48 AM" src="https://github.com/user-attachments/assets/8d5dfa1a-db9d-48f8-9684-f41db43a2f08" />

---

## Project Development

| Milestone | Date Completed | Description |
| :--- | :--- | :--- |
| **Setup & Structure** | Monday October 6 | Created the `AmanchiBhutaniMadLibs.java` file and implemented the `main` method, including welcome messages and a `Scanner` for input. |
| **Input Collection Function** | Monday October 6 | Developed the `getWord()` function to prompt for different word types and return each response. |
| **Story Generation Function** | Tuesday October 7 | Built the `createStory()` function, which concatenates all user words into a complete Mad Lib template. |
| **Testing & Refinement** | Tuesday October 7 | Tested with multiple input combinations, refined formatting and spacing, and added inline comments for clarity. |

---
**Authors:** Avinash Amanchi, Hrihaan Bhutani