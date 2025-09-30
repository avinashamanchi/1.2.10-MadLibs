# 1.2.10-MadLibs

**Author:** Avinash Amanchi Hrihaan Bhutani
**File:** AmanchiBhutaniMadLibs.java
---

## Program Approach

Our approach to this assignment focused on clear separation of concerns using two required functions: `collectInputs` and `generateStory`.

1.  **Input Collection (`collectInputs`):**
    * We used a `Scanner` object to capture user input from the console.
    * A `HashMap<String, String>` was implemented to store the collected words. The **key** is a descriptive word-type (e.g., "ADJECTIVE\_1") and the **value** is the user's provided word. This makes the code for story generation cleaner and easier to manage.
    * The function gathers **7** distinct word substitutions to meet the requirement of 5-7.

2.  **Story Generation (`generateStory`):**
    * This function takes the `HashMap` of words as its argument.
    * It uses Java's `String.format()` method to construct the final story. This method is highly efficient for string substitution, allowing me to insert the values from the `HashMap` directly into the template text in the correct order.
    * The completed story is then printed to the console.

---

## Milestones (Based on Project Development)

| Milestone | Date Completed | Description |
| :--- | :--- | :--- |
| **Setup & Main Structure** | Monday September 29 | Created the `AmanchiBhutaniMadLibs.java` file and implemented the `main` method, setting up the `Scanner` and initial class structure. |
| **Input Collection Function** | Tuesday September 30 | Developed the `collectInputs()` function. Implemented prompting for 7 word types and storing them in a `HashMap`. |
| **Story Generation Function** | Wednesday October 1 | Developed the `generateStory()` function. Created the story template and used `String.format()` to integrate the user words from the `HashMap`. |
| **Testing & Refinement** | Wednesday October 1 | Tested the program with various inputs to ensure correct substitution and handled edge cases like extra whitespace using `.trim()`. Added comprehensive code comments as required. |

---

## Screenshots of Program Functionality

### 1. Program Prompting for Inputs
![Uploading Screenshot 2025-09-30 at 11.04.55 AM.png…]()


### 2. Final Mad Lib Output
<img width="1021" height="101" alt="Screenshot 2025-09-30 at 11 05 44 AM" src="https://github.com/user-attachments/assets/e362de15-257e-4c42-ab6c-667922d93d79" />
