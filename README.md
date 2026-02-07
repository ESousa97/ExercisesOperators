# ExercisesOperators

[![CI](https://github.com/ESousa97/ExercisesOperators/actions/workflows/ci.yml/badge.svg)](https://github.com/ESousa97/ExercisesOperators/actions/workflows/ci.yml)
[![CodeQL](https://github.com/ESousa97/ExercisesOperators/actions/workflows/codeql.yml/badge.svg)](https://github.com/ESousa97/ExercisesOperators/actions/workflows/codeql.yml)
[![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java-17+-orange.svg)](https://openjdk.org/)
[![CodeFactor](https://www.codefactor.io/repository/github/esousa97/exercisesoperators/badge)](https://www.codefactor.io/repository/github/esousa97/exercisesoperators)
[![Dependabot](https://img.shields.io/badge/Dependabot-enabled-blue.svg)](https://github.com/ESousa97/ExercisesOperators/security/dependabot)

Interactive platform to practice operators and programming logic in Java.
Organized into categories with different difficulty levels.

<div align="center">

![Interactive System Screenshot](assets/ExercisesOperators.png)

</div>

---

## Overview

**ExercisesOperators** is a console-based system that offers practical
exercises to master:

- **Arithmetic operators** (`+`, `-`, `*`, `/`, `%`)
- **Relational operators** (`==`, `!=`, `>`, `<`, `>=`, `<=`)
- **Logical operators** (`&&`, `||`, `!`)
- **Type casting** and primitive types
- **String concatenation**
- **Conditional structures** (`if`, `else if`, `else`, `switch`)

## Architecture

```
src/main/java/exercises/
├── SistemaExerciciosCompleto.java   # Interactive main system
├── AnaliseNumero.java               # Complete number analysis
├── CastingDasVariaveis.java         # Type casting
├── ComparacaoSimples.java           # Number comparison
├── Concatenacao.java                # Concatenation
├── ConversorDolarReal.java          # Currency conversion
├── ConversorTemperatura.java        # Celsius ↔ Fahrenheit
├── MediaAluno.java                  # Grade system (3 grades)
├── MediaNota.java                   # Average of two grades
├── Multiplicacao.java               # Product totals
├── OperadoresDeIncremento.java      # ++/-- pre and post
├── OperadoresLogicos.java           # &&, ||, !
├── OperadoresPrimitivos.java        # Java primitive types
└── Porcentagem.java                 # Discounts and percentage
```

The system is organized into **4 categories** via the interactive menu:

| Category                 | Exercises                                            | Level       |
| ------------------------ | ---------------------------------------------------- | ----------- |
| Basic Operators          | Average, Casting, Concatenation, Multiplication, Primitives | Basic |
| Interactive Exercises    | Comparison, School Average, Number Analysis          | Easy→Hard   |
| Converters and Calculations | Temperature, USD/BRL, Percentage                  | Intermediate |
| Special Operators        | Increment/Decrement, Logical Operators              | Intermediate |

## Prerequisites

- **JDK 17+** ([download](https://adoptium.net/))
- **Maven 3.9+** ([download](https://maven.apache.org/download.cgi))
- **Git** ([download](https://git-scm.com/))

## Quick Start

```bash
# Clone
git clone https://github.com/ESousa97/ExercisesOperators.git
cd ExercisesOperators

# Compile
mvn clean compile

# Run the interactive system
mvn -q exec:java -Dexec.mainClass="exercises.SistemaExerciciosCompleto"

# Or run an individual exercise
mvn -q exec:java -Dexec.mainClass="exercises.MediaNota"
```

## Available scripts

| Command                    | Description                         |
| -------------------------- | ----------------------------------- |
| `mvn clean compile`        | Compiles the project                |
| `mvn test`                 | Runs unit tests                     |
| `mvn verify`               | Compiles, tests, and generates coverage |
| `mvn checkstyle:check`     | Runs code style checks              |
| `mvn spotbugs:check`       | Static analysis for bugs            |
| `mvn clean package`        | Builds the runnable JAR             |
| `java -jar target/*.jar`   | Runs the built JAR                  |

## Tests

```bash
# Run all tests
mvn test

# Run with coverage
mvn verify

# Coverage report: target/site/jacoco/index.html
```

Tests cover all 13 individual exercises and validate:
- Correct arithmetic calculations
- Conditional flows (approved/recovery/failed)
- Expected formatted output
- Number analysis (parity, multiples)

## Roadmap

- [ ] Add exercises using `switch` expressions
- [ ] Add ternary operator exercises
- [ ] Add array and loop exercises
- [ ] Add advanced string exercises
- [ ] Add a quiz mode with scoring

## Contributing

Contributions are welcome! See [CONTRIBUTING.md](CONTRIBUTING.md) for details:

- Coding standards and Conventional Commits
- Pull Request workflow
- How to add new exercises

## License

This project is licensed under the [MIT License](LICENSE).

## Author

**Jose Enoque** — [@ESousa97](https://github.com/ESousa97) · [LinkedIn](https://www.linkedin.com/in/enoque-sousa-bb89aa168/)
