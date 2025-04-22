# ➕ Sum of Digits (Java Console App)

This simple Java program calculates the **sum of all digits** in a number entered by the user.  
For example, if the user enters `456`, the program will compute and display `4 + 5 + 6 = 15`.

---

## 💡 What This Program Does

- Prompts the user to enter an integer number
- Uses a loop to extract each digit of the number
- Adds all digits together
- Displays the final sum

---

## 📌 Sample Input and Output

Enter a whole number 987 The sum of the number is: 24


---

## 🧠 Logic Breakdown

### ➤ How It Works

1. Get the last digit using `num % 10`
2. Add that digit to `sum`
3. Remove the last digit using `num / 10`
4. Repeat until the number becomes `0`

### ➤ Code Snippet:
```java
while (num != 0) {
    sum = sum + num % 10;
    num = num / 10;
}
🛠 Requirements
Java 8 or higher

Java IDE like Eclipse, IntelliJ, or just a command line interface

🚀 How to Run (In Eclipse)
Create a Java project and a class named SumOfDigits inside a package called day6

Paste the code into the class file

Run the program

Enter a whole number when prompted, and see the sum of its digits

📂 Project Structure

src/
└── day6/
    └── SumOfDigits.java
💡 Possible Enhancements
Handle negative numbers

Add input validation to check for non-integer inputs

Add functionality to repeat the process without restarting the program

👤 Author
This beginner-level Java project helps you understand:

Using loops to break down numbers

Working with mathematical operations like modulus and division

Taking user input via Scanner

