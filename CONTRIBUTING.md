# Contributing to ExercisesOperators

Thanks for your interest in contributing! This guide explains how to
participate in the project.

## Conventional Commits

We use [Conventional Commits](https://www.conventionalcommits.org/). Every
commit must follow this format:

```
<type>(optional scope): short description

[optional body]

[optional footer]
```

### Commit types

| Type       | Description                                   |
| ---------- | --------------------------------------------- |
| `feat`     | New feature                                   |
| `fix`      | Bug fix                                       |
| `docs`     | Documentation change                          |
| `style`    | Formatting (no logic changes)                 |
| `refactor` | Refactoring                                   |
| `test`     | Adding or fixing tests                        |
| `chore`    | Maintenance tasks                             |
| `ci`       | CI/CD changes                                 |
| `deps`     | Dependency updates                            |

### Examples

```
feat: add ternary operator exercise
fix: correct average calculation for zero grades
docs: update README with new exercises
test: add tests for ConversorTemperatura
```

## Contribution flow

1. **Fork** the repository
2. **Clone** your fork locally
3. **Create a branch** from `main`:
   ```bash
   git checkout -b feat/your-feature
   ```
4. **Make your changes** following the project standards
5. **Build and test**:
   ```bash
   mvn clean verify
   ```
6. **Commit** your changes using Conventional Commits
7. **Push** to your fork
8. **Open a Pull Request** using the provided template

## Code standards

- Class names in `PascalCase`
- Variable and method names in `camelCase`
- Constants in `UPPER_SNAKE_CASE`
- All classes must include Javadoc
- Every new exercise must include tests
- Use standard Java formatting (4-space indentation)

## Prerequisites

- JDK 17+
- Maven 3.9+
- Git

## Run locally

```bash
# Compile
mvn clean compile

# Run tests
mvn test

# Run interactive system
mvn exec:java -Dexec.mainClass="exercises.SistemaExerciciosCompleto"

# Check style
mvn checkstyle:check

# Generate coverage report
mvn verify
# Report at: target/site/jacoco/index.html
```

## How to add a new exercise

1. Create a class in `src/main/java/exercises/` with `package exercises;`
2. Add Javadoc to the class
3. Add a menu option in `SistemaExerciciosCompleto.java`
4. Create tests in `src/test/java/exercises/ExercisesTest.java`
5. Update documentation (README and CHANGELOG)

## Reporting bugs

Use the [Bug Report template](https://github.com/ESousa97/ExercisesOperators/issues/new?template=bug_report.md)
with as much detail as possible.

## Questions?

Open an [Issue](https://github.com/ESousa97/ExercisesOperators/issues) or reach out to the maintainer.
