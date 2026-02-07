# Changelog

Todas as alterações notáveis neste projeto serão documentadas neste arquivo.

O formato é baseado em [Keep a Changelog](https://keepachangelog.com/pt-BR/1.1.0/),
e este projeto adere ao [Versionamento Semântico](https://semver.org/lang/pt-BR/).

## [1.0.0] - 2026-02-06

### Adicionado
- Estrutura Maven padrão (`pom.xml`) com JDK 17
- Pacote Java `exercises` para todas as classes
- Testes unitários com JUnit 5 (`ExercisesTest.java`)
- Cobertura de código com JaCoCo
- Análise estática com Checkstyle e SpotBugs
- CI/CD com GitHub Actions (`ci.yml`, `codeql.yml`)
- Dependabot para atualização automática de dependências
- Templates de Issue (Bug Report, Feature Request)
- Template de Pull Request
- Documentação: `CONTRIBUTING.md`, `CODE_OF_CONDUCT.md`, `SECURITY.md`, `CHANGELOG.md`
- `.editorconfig` para consistência de formatação
- `.gitattributes` para normalização de line endings
- CSpell para verificação ortográfica
- Badges de qualidade no README

### Alterado
- Migração de estrutura flat (`src/`) para Maven (`src/main/java/exercises/`)
- Todas as classes agora possuem `package exercises;`
- `SistemaExerciciosCompleto` usa `switch` expressions (Java 14+)
- Corrigidos typos: "shooping" → "shopping", "ENNTER" → "ENTER"
- Corrigido espaço ausente em `ComparacaoSimples` ("ao número" faltava espaço)
- `Scanner` global renomeada para constante `SCANNER`
- `OperadoresPrimitivos` agora imprime valores (antes apenas declarava)
- `.gitignore` atualizado com seções organizadas e cobertura de Maven/IDE

### Removido
- `Main.java` (template padrão do IntelliJ, nunca utilizado)
- `ExercisesOperators.iml` (substituído pelo Maven `pom.xml`)

## [0.1.0] - 2025-04-29

### Adicionado
- Versão inicial com 13 exercícios individuais
- Sistema interativo `SistemaExerciciosCompleto` com menus
- Exercícios de operadores básicos, interativos, conversores e especiais
- README completo com documentação detalhada
- Licença MIT
