# Local Variable Type Inference (JavaBasics_Task_148_V0.1)

## 📖 Description
This project explores the `var` keyword introduced in Java 10. While it allows the compiler to infer the data type based on the assigned value, its use is a subject of debate regarding code clarity and long-term maintenance.

## 📋 Requirements Compliance
- **Task**: Declare a greeting message using the `var` keyword.
- **Variable**: `var message = "Greeting: Hi, Java "`.
- **Variable**: `var plus = "+";`.
- **Variable**: `var str = "11";`.
- **Goal**: Understand the syntax and the trade-offs of implicit typing.

## 🚀 Architectural Stack
- Java 11+ (Required for `var`)

## 🏗️ Implementation Details
### The `var` Keyword Trade-off
While `var` reduces boilerplate code for the author, it introduces several risks according to **Clean Code** principles:
1. **Reduced Readability**: Other programmers must infer the type mentally, which slows down code reviews and debugging.
2. **Maintenance Overhead**: If a method returns a complex type, `var` hides that complexity, making it harder to spot errors during refactoring.
3. **Typo Risks**: A simple mistake in the assigned value might be silently accepted by the compiler, leading to logical bugs that are difficult to trace in large systems.

**Conclusion**: Explicit type declaration is generally preferred to ensure the code remains self-documenting and robust.

## 📋 Expected result
```text
Greeting: Hi, Java!
```

## 💻 Code Example

Project Structure:

    src/com/yurii/pavlenko/
                    └── Solution.java

Code
```java
package com.yurii.pavlenko;

/**
 * Demonstrates type inference with 'var' and highlights readability concerns.
 */
public class Solution {
    public static void main(String[] args) {
        // Using var for implicit type inference
        var plus = "+";
        var message = "Greeting: Hi, Java ";

        // The author wanted to enter the number 11 as a number for possible further calculations,
        // but made a mistake by putting double quotes.
        // The compiler defined the number 11 as a string, which may cause an error later.
        var str = "11";

        // There was a calculation error because the compiler defined the variable str as a string.
        // ERROR java: incompatible types: java.lang.String cannot be converted to int
        // int javaVersion21 = str + 10;

        // Display the value
        System.out.println(message + str + plus);

        // This line of code will not execute do to an initialization error at the line: var str = "11";
        // System.out.println(message + javaVersion21 + plus);
    }
}
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
