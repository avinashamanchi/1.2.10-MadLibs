# 1.2.10-MadLibs

**Authors:** Avinash Amanchi, Hrihaan Bhutani
---

## Program Approach

Our approach to this assignment focused on creating a clear, functional structure that separates user input collection from story generation. The program uses two main methods: `getWord()` and `createStory()`.

1. **Input Collection (`getWord`):**  
   - Utilizes a `Scanner` object to prompt the user for different word types such as nouns, verbs, and adjectives.  
   - The function takes a `String` parameter (the type of word to collect) and returns the user’s input.  
   - This approach keeps the code modular and makes it easy to add more word types or prompts later if needed.

2. **Story Generation (`createStory`):**  
   - This function takes in seven user-provided words as parameters.  
   - It constructs the final Mad Lib story using string concatenation.  
   - The story combines both creativity and grammatical correctness while ensuring that all user inputs are properly substituted into the template.  
   - The final story is then printed to the console in a formatted way.

---

## Project Development

| Milestone | Date Completed | Description |
| :--- | :--- | :--- |
| **Setup & Structure** | Monday October 6 | Created the `AmanchiBhutaniMadLibs.java` file and implemented the `main` method, including welcome messages and a `Scanner` for input. |
| **Input Collection Function** | Monday October 6 | Developed the `getWord()` function to prompt for different word types and return each response. |
| **Story Generation Function** | Tuesday October 7 | Built the `createStory()` function, which concatenates all user words into a complete Mad Lib template. |
| **Testing & Refinement** | Tuesday October 7 | Tested with multiple input combinations, refined formatting and spacing, and added inline comments for clarity. |

---

## Screenshots of Program Functionality

### 1. Program Prompting for Inputs
<img width="500" height="144" alt="Screenshot 2025-10-07 at 10 53 36 AM" src="https://github.com/user-attachments/assets/0fb02c48-745e-4e9b-b8a1-746fb08b65dd" />

### 2. Final Mad Lib Output
<img width="1161" height="65" alt="Screenshot 2025-10-07 at 10 53 48 AM" src="https://github.com/user-attachments/assets/8d5dfa1a-db9d-48f8-9684-f41db43a2f08" />

