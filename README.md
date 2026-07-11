# Simple Calculator (Java)

A simple command-line calculator built in Java that performs basic arithmetic operations — addition, subtraction, multiplication, and division.

## Features

- ➕ Addition
- ➖ Subtraction
- ✖️ Multiplication
- ➗ Division (with divide-by-zero handling)
- Simple, interactive console-based interface
- Input validation for invalid entries

## Demo

```
=== Simple Calculator ===
Enter first number: 10
Enter operator (+, -, *, /): +
Enter second number: 5

Result: 10.0 + 5.0 = 15.0
```

## Prerequisites

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/) 8 or higher installed
- Verify installation:
  ```bash
  java -version
  javac -version
  ```

## Getting Started

### 1. Clone the repository

```bash
git clone https://github.com/choudharyanushka2323-sudo/simple-calculator.git
cd simple-calculator
```

### 2. Compile the program

```bash
javac Calculator.java
```

### 3. Run the program

```bash
java Calculator
```

## Project Structure

```
simple-calculator/
├── Calculator.java   # Main program file
└── README.md         # Project documentation
```

## How It Works

1. The program prompts the user to enter a number.
2. The user selects an operator (`+`, `-`, `*`, `/`).
3. The user enters a second number.
4. The calculator performs the operation and displays the result.
5. Errors (like dividing by zero or invalid input) are handled gracefully.

## Example Operations

| Operation | Symbol | Example       |
|-----------|--------|---------------|
| Addition  | `+`    | `5 + 3 = 8`   |
| Subtraction | `-`  | `5 - 3 = 2`   |
| Multiplication | `*` | `5 * 3 = 15` |
| Division  | `/`    | `5 / 3 = 1.67`|

## Future Improvements

- [ ] Add support for more operations (modulus, exponents, square root)
- [ ] Build a GUI version using Java Swing or JavaFX
- [ ] Add a history/log of past calculations
- [ ] Unit tests for core calculation logic

## Contributing

Contributions are welcome! Feel free to fork this repository, make changes, and submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

## Author

** Anushka Choudhary **
- GitHub: 
