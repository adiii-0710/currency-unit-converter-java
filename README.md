# Currency & Unit Converter

A simple Java-based console application that converts currencies and measurement units using **switch statements, methods, wrapper classes, and exception handling**.

## 📌 Features

- Convert INR to USD
- Convert Kilometers to Miles
- Convert Kilograms to Pounds
- Menu-driven console interface
- Safe input handling using `try-catch`
- Uses Java wrapper classes for parsing input
- Uses a reusable `convert()` method
- Continuous conversion until the user chooses Exit

## 🛠️ Technologies Used

- Java
- `Scanner`
- Switch statements
- Methods
- Wrapper Classes
- Exception Handling

## 🔄 Available Conversions

| Option | Conversion | Formula |
|---|---|---|
| 1 | INR → USD | INR ÷ 83 |
| 2 | KM → Miles | KM × 0.621 |
| 3 | KG → Pounds | KG × 2.205 |

> **Note:** The INR → USD conversion rate is fixed at `83` in this project and is intended for demonstration purposes.

## 📂 Project Structure

```text
currency-unit-converter-java/
│
├── CurrencyUnitConverter.java
└── README.md
▶️ How to Run
1. Clone the repository
git clone https://github.com/YOUR-USERNAME/currency-unit-converter-java.git
2. Navigate to the project folder
cd currency-unit-converter-java
3. Compile the Java program
javac CurrencyUnitConverter.java
4. Run the program
java CurrencyUnitConverter
```

```
💻 Sample Output
===== Currency & Unit Converter =====
1. INR-USD
2. KM-Miles
3. KG-Pounds
4. Exit
Choice: 1

Enter value: 830

830.00 INR = 10.00 USD
```

```
Another example:

===== Currency & Unit Converter =====
1. INR-USD
2. KM-Miles
3. KG-Pounds
4. Exit
Choice: 2

Enter value: 10

10.00 km = 6.21 miles

```


📚 Concepts Demonstrated
```
1. Switch Statement

The application uses switch statements to handle the menu and conversion types.
```
```
2. Method

A reusable convert() method performs the actual conversion.

public static double convert(double value, char type)
```

```
3. Wrapper Classes

Integer.parseInt() and Double.parseDouble() are used to safely convert user input from String to numeric values.
```

```
4. Exception Handling

NumberFormatException is handled using try-catch blocks to prevent the program from crashing when invalid input is entered.
```

```
5. Looping

A while(true) loop keeps the converter running until the user selects the Exit option.
```

```
🎯 Purpose

This project was created as an individual Java coding assignment to practice:

Operators
Switch statements
Methods
Wrapper classes
Exception handling
User input validation
```

