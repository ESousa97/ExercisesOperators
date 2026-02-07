# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.1.0/),
and this project adheres to [Semantic Versioning](https://semver.org/).

## [1.0.0] - 2026-02-06

### Added
- Maven standard structure (`pom.xml`) with JDK 17
- Java package `exercises` for all classes
- Unit tests with JUnit 5 (`ExercisesTest.java`)
- Code coverage with JaCoCo
- Static analysis with Checkstyle and SpotBugs
- CI/CD with GitHub Actions (`ci.yml`, `codeql.yml`)
- Dependabot for automatic dependency updates
- Issue templates (Bug Report, Feature Request)
- Pull Request template
- Documentation: `CONTRIBUTING.md`, `CODE_OF_CONDUCT.md`, `SECURITY.md`, `CHANGELOG.md`
- `.editorconfig` for formatting consistency
- `.gitattributes` for line ending normalization
- CSpell for spell checking
- Quality badges in README

### Changed
- Migration from flat structure (`src/`) to Maven (`src/main/java/exercises/`)
- All classes now have `package exercises;`
- `SistemaExerciciosCompleto` uses `switch` expressions (Java 14+)
- Fixed typos: "shooping" -> "shopping", "ENNTER" -> "ENTER"
- Fixed missing space in `ComparacaoSimples` ("ao numero" was missing a space)
- Global `Scanner` renamed to constant `SCANNER`
- `OperadoresPrimitivos` now prints values (previously only declared them)
- `.gitignore` updated with organized sections and Maven/IDE coverage

### Removed
- `Main.java` (default IntelliJ template, never used)
- `ExercisesOperators.iml` (replaced by Maven `pom.xml`)

## [0.1.0] - 2025-04-29

### Added
- Initial version with 13 individual exercises
- Interactive system `SistemaExerciciosCompleto` with menus
- Exercises for basic operators, interactive exercises, converters and special operators
- Complete README with detailed documentation
- MIT License
