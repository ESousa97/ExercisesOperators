package exercises;

import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Sistema completo e interativo de exercícios em Java.
 * <p>
 * Organizado em categorias: operadores básicos, exercícios interativos,
 * conversores e operadores especiais. Oferece prática guiada com
 * diferentes níveis de dificuldade.
 * </p>
 */
public class SistemaExerciciosCompleto {

    private static final Scanner SCANNER = new Scanner(System.in, StandardCharsets.UTF_8);

    public static void main(String[] args) {
        boolean continuar = true;

        exibirBoasVindas();

        while (continuar) {
            exibirMenuPrincipal();
            int opcao = lerOpcao();

            switch (opcao) {
                case 1 -> menuOperadoresBasicos();
                case 2 -> menuExerciciosInterativos();
                case 3 -> menuConversores();
                case 4 -> menuOperadoresEspeciais();
                case 0 -> {
                    continuar = false;
                    System.out.println("\n" + "=".repeat(50));
                    System.out.println("Obrigado por usar o Sistema de Exercícios Java!");
                    System.out.println("Continue praticando programação!");
                    System.out.println("=".repeat(50));
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }

            if (continuar && opcao >= 1 && opcao <= 4) {
                pausar();
            }
        }

        SCANNER.close();
    }

    private static void exibirBoasVindas() {
        System.out.println("=".repeat(60));
        System.out.println("SISTEMA COMPLETO DE EXERCÍCIOS JAVA");
        System.out.println("Operadores, Conversores e Lógica de Programação");
        System.out.println("=".repeat(60));
        System.out.println("Bem-vindo ao sistema mais completo para praticar Java!");
        System.out.println("Aqui você encontrará todos os exercícios organizados por categoria.");
        System.out.println("Pressione ENTER para continuar...");
        pausar();
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("MENU PRINCIPAL");
        System.out.println("=".repeat(50));
        System.out.println("1. Operadores Básicos e Variáveis");
        System.out.println("2. Exercícios Interativos (Fácil/Médio/Difícil)");
        System.out.println("3. Conversores e Cálculos");
        System.out.println("4. Operadores Especiais");
        System.out.println("0. Sair do Sistema");
        System.out.println("=".repeat(50));
    }

    private static void menuOperadoresBasicos() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("OPERADORES BÁSICOS E VARIÁVEIS");
            System.out.println("=".repeat(50));
            System.out.println("1. Média de Duas Notas");
            System.out.println("2. Casting de Variáveis");
            System.out.println("3. Concatenação de Caracteres");
            System.out.println("4. Multiplicação de Produtos");
            System.out.println("5. Tipos Primitivos - Exercício Completo");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.println("=".repeat(50));

            int opcao = lerOpcao();

            switch (opcao) {
                case 1 -> exercicioMediaNota();
                case 2 -> exercicioCasting();
                case 3 -> exercicioConcatenacao();
                case 4 -> exercicioMultiplicacao();
                case 5 -> exercicioTiposPrimitivos();
                case 0 -> voltar = true;
                default -> System.out.println("Opção inválida!");
            }

            if (!voltar && opcao >= 1 && opcao <= 5) {
                pausar();
            }
        }
    }

    private static void menuExerciciosInterativos() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("EXERCÍCIOS INTERATIVOS");
            System.out.println("=".repeat(50));
            System.out.println("1. [FÁCIL] Comparação Simples");
            System.out.println("2. [MÉDIO] Média do Aluno");
            System.out.println("3. [DIFÍCIL] Análise Completa de Número");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.println("=".repeat(50));

            int opcao = lerOpcao();

            switch (opcao) {
                case 1 -> exercicioComparacaoSimples();
                case 2 -> exercicioMediaAluno();
                case 3 -> exercicioAnaliseNumero();
                case 0 -> voltar = true;
                default -> System.out.println("Opção inválida!");
            }

            if (!voltar && opcao >= 1 && opcao <= 3) {
                pausar();
            }
        }
    }

    private static void menuConversores() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("CONVERSORES E CÁLCULOS");
            System.out.println("=".repeat(50));
            System.out.println("1. Conversor de Temperatura (Celsius -> Fahrenheit)");
            System.out.println("2. Conversor Dólar -> Real");
            System.out.println("3. Calculadora de Desconto/Porcentagem");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.println("=".repeat(50));

            int opcao = lerOpcao();

            switch (opcao) {
                case 1 -> exercicioConversorTemperatura();
                case 2 -> exercicioConversorDolar();
                case 3 -> exercicioPorcentagem();
                case 0 -> voltar = true;
                default -> System.out.println("Opção inválida!");
            }

            if (!voltar && opcao >= 1 && opcao <= 3) {
                pausar();
            }
        }
    }

    private static void menuOperadoresEspeciais() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("OPERADORES ESPECIAIS");
            System.out.println("=".repeat(50));
            System.out.println("1. Operadores de Incremento (++ e --)");
            System.out.println("2. Operadores Lógicos (&&, ||, !)");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.println("=".repeat(50));

            int opcao = lerOpcao();

            switch (opcao) {
                case 1 -> exercicioIncremento();
                case 2 -> exercicioOperadoresLogicos();
                case 0 -> voltar = true;
                default -> System.out.println("Opção inválida!");
            }

            if (!voltar && opcao >= 1 && opcao <= 2) {
                pausar();
            }
        }
    }

    // ==================== EXERCÍCIOS ====================

    private static void exercicioMediaNota() {
        System.out.println("\n=== CALCULADORA DE MÉDIA (DUAS NOTAS) ===");

        double nota1 = lerNota("Digite a primeira nota (0-10): ");
        double nota2 = lerNota("Digite a segunda nota (0-10): ");

        double media = (nota1 + nota2) / 2;

        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Primeira nota: %.2f%n", nota1);
        System.out.printf("Segunda nota: %.2f%n", nota2);
        System.out.printf("Média final: %.2f%n", media);

        if (media >= 7.0) {
            System.out.println("Status: APROVADO! Parabéns!");
        } else if (media >= 5.0) {
            System.out.println("Status: RECUPERAÇÃO! Estude mais!");
        } else {
            System.out.println("Status: REPROVADO! Precisa estudar muito!");
        }
    }

    private static void exercicioCasting() {
        System.out.println("\n=== DEMONSTRAÇÃO DE CASTING ===");

        double numeroDecimal = lerDouble("Digite um número decimal: ");
        int numeroInteiro = (int) numeroDecimal;

        System.out.println("\n--- RESULTADO DO CASTING ---");
        System.out.printf("Número original (double): %.3f%n", numeroDecimal);
        System.out.printf("Após casting para int: %d%n", numeroInteiro);
        System.out.printf("Parte perdida no casting: %.3f%n", (numeroDecimal - numeroInteiro));

        System.out.println("\n--- OUTROS EXEMPLOS DE CASTING ---");
        char letra = 'A';
        int codigoAscii = letra;
        System.out.printf("Char '%c' -> ASCII: %d%n", letra, codigoAscii);

        int numero = 65;
        char letraConvertida = (char) numero;
        System.out.printf("Int %d -> Char: '%c'%n", numero, letraConvertida);
    }

    private static void exercicioConcatenacao() {
        System.out.println("\n=== EXERCÍCIO DE CONCATENAÇÃO ===");

        System.out.print("Digite uma letra: ");
        SCANNER.nextLine();
        String entrada = SCANNER.nextLine();
        char letra = entrada.isEmpty() ? 'X' : entrada.charAt(0);

        System.out.print("Digite uma palavra: ");
        String palavra = SCANNER.nextLine();

        System.out.println("\n--- RESULTADOS DA CONCATENAÇÃO ---");
        System.out.println("Letra: '" + letra + "'");
        System.out.println("Palavra: \"" + palavra + "\"");
        System.out.println("Concatenação: \"" + letra + palavra + "\"");

        System.out.println("\n--- OUTRAS INFORMAÇÕES ---");
        System.out.println("Letra maiúscula: " + Character.toUpperCase(letra));
        System.out.println("Palavra maiúscula: " + palavra.toUpperCase());
        System.out.println("Tamanho da palavra: " + palavra.length() + " caracteres");
    }

    private static void exercicioMultiplicacao() {
        System.out.println("\n=== CALCULADORA DE PRODUTOS ===");

        double precoProduto = lerDouble("Digite o preço unitário do produto: R$ ");
        int quantidade = lerNumero("Digite a quantidade: ");

        double precoTotal = precoProduto * quantidade;

        System.out.println("\n--- NOTA FISCAL SIMPLIFICADA ---");
        System.out.printf("Produto: Preço unitário R$ %.2f%n", precoProduto);
        System.out.printf("Quantidade: %d unidades%n", quantidade);
        System.out.println("-".repeat(30));
        System.out.printf("TOTAL A PAGAR: R$ %.2f%n", precoTotal);

        if (quantidade >= 10) {
            double desconto = precoTotal * 0.1;
            double precoComDesconto = precoTotal - desconto;
            System.out.println("\nDESCONTO ESPECIAL!");
            System.out.printf("Desconto de 10%% para compras acima de 10 unidades: -R$ %.2f%n", desconto);
            System.out.printf("PREÇO FINAL COM DESCONTO: R$ %.2f%n", precoComDesconto);
        }
    }

    private static void exercicioTiposPrimitivos() {
        System.out.println("\n=== DEMONSTRAÇÃO DE TIPOS PRIMITIVOS ===");

        int idade = lerNumero("Digite sua idade: ");
        double altura = lerDouble("Digite sua altura em metros (ex: 1.75): ");
        float peso = (float) lerDouble("Digite seu peso em kg: ");

        System.out.print("Digite a primeira letra do seu nome: ");
        SCANNER.nextLine();
        char inicial = SCANNER.nextLine().charAt(0);

        System.out.print("Você está estudando? (true/false): ");
        boolean estudando = SCANNER.nextBoolean();

        System.out.println("\n--- ANÁLISE DOS TIPOS PRIMITIVOS ---");
        System.out.println("TIPO    | VARIÁVEL   | VALOR        | BYTES");
        System.out.println("--------|------------|--------------|------");
        System.out.printf("int     | idade      | %-12d | 4%n", idade);
        System.out.printf("double  | altura     | %-12.2f | 8%n", altura);
        System.out.printf("float   | peso       | %-12.1f | 4%n", peso);
        System.out.printf("char    | inicial    | %-12c | 2%n", inicial);
        System.out.printf("boolean | estudando  | %-12s | 1%n", estudando);

        double imc = peso / (altura * altura);
        System.out.println("\n--- CÁLCULOS ADICIONAIS ---");
        System.out.printf("Seu IMC: %.2f%n", imc);

        String classificacao;
        if (imc < 18.5) {
            classificacao = "Abaixo do peso";
        } else if (imc < 25) {
            classificacao = "Peso normal";
        } else if (imc < 30) {
            classificacao = "Sobrepeso";
        } else {
            classificacao = "Obesidade";
        }
        System.out.println("Classificação: " + classificacao);
    }

    private static void exercicioComparacaoSimples() {
        System.out.println("\n=== [FÁCIL] COMPARAÇÃO SIMPLES ===");

        boolean continuarComparacao = true;

        while (continuarComparacao) {
            int num1 = lerNumero("Digite o primeiro número: ");
            int num2 = lerNumero("Digite o segundo número: ");

            System.out.println("\n--- ANÁLISE COMPLETA ---");

            if (num1 == num2) {
                System.out.println("RESULTADO: Os números são IGUAIS!");
                System.out.printf("Ambos valem: %d%n", num1);
            } else {
                System.out.println("RESULTADO: Os números são DIFERENTES!");
                System.out.printf("%d != %d%n", num1, num2);

                if (num1 > num2) {
                    System.out.printf("%d é MAIOR que %d%n", num1, num2);
                    System.out.printf("Diferença: %d%n", (num1 - num2));
                } else {
                    System.out.printf("%d é MAIOR que %d%n", num2, num1);
                    System.out.printf("Diferença: %d%n", (num2 - num1));
                }
            }

            System.out.println("\n--- ANÁLISES EXTRAS ---");
            System.out.printf("Soma: %d + %d = %d%n", num1, num2, (num1 + num2));
            System.out.printf("Produto: %d × %d = %d%n", num1, num2, (num1 * num2));

            if (num2 != 0) {
                System.out.printf("Divisão: %d / %d = %.2f%n", num1, num2, ((double) num1 / num2));
            }

            continuarComparacao = perguntarContinuar("Deseja comparar outros números?");
        }
    }

    private static void exercicioMediaAluno() {
        System.out.println("\n=== [MÉDIO] SISTEMA DE NOTAS ESCOLAR ===");

        boolean continuarCalculo = true;

        while (continuarCalculo) {
            System.out.print("Digite o nome do aluno: ");
            SCANNER.nextLine();
            String nomeAluno = SCANNER.nextLine();

            double nota1 = lerNota("Nota do 1º bimestre (0-10): ");
            double nota2 = lerNota("Nota do 2º bimestre (0-10): ");
            double nota3 = lerNota("Nota do 3º bimestre (0-10): ");

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("\n" + "=".repeat(40));
            System.out.println("BOLETIM ESCOLAR");
            System.out.println("=".repeat(40));
            System.out.println("Aluno: " + nomeAluno);
            System.out.printf("1º Bimestre: %.2f%n", nota1);
            System.out.printf("2º Bimestre: %.2f%n", nota2);
            System.out.printf("3º Bimestre: %.2f%n", nota3);
            System.out.println("-".repeat(40));
            System.out.printf("MÉDIA FINAL: %.2f%n", media);

            String situacao;
            String observacao;

            if (media >= 7) {
                situacao = "APROVADO";
                observacao = "Parabéns! Excelente desempenho!";
            } else if (media >= 5) {
                situacao = "RECUPERAÇÃO";
                double pontosNecessarios = 7.0 - media;
                observacao = String.format("Precisa de %.2f pontos na recuperação", pontosNecessarios);
            } else {
                situacao = "REPROVADO";
                double pontosNecessarios = 5.0 - media;
                observacao = String.format("Faltaram %.2f pontos para recuperação", pontosNecessarios);
            }

            System.out.printf("SITUAÇÃO: %s%n", situacao);
            System.out.println("OBSERVAÇÃO: " + observacao);
            System.out.println("=".repeat(40));

            double maiorNota = Math.max(Math.max(nota1, nota2), nota3);
            double menorNota = Math.min(Math.min(nota1, nota2), nota3);
            System.out.println("\n--- ESTATÍSTICAS ---");
            System.out.printf("Maior nota: %.2f%n", maiorNota);
            System.out.printf("Menor nota: %.2f%n", menorNota);
            System.out.printf("Variação: %.2f%n", (maiorNota - menorNota));

            continuarCalculo = perguntarContinuar("Deseja calcular a média de outro aluno?");
        }
    }

    private static void exercicioAnaliseNumero() {
        System.out.println("\n=== [DIFÍCIL] ANALISADOR AVANÇADO DE NÚMEROS ===");

        boolean continuarAnalise = true;

        while (continuarAnalise) {
            int numero = lerNumero("Digite um número inteiro para análise completa: ");

            System.out.println("\n" + "=".repeat(50));
            System.out.println("RELATÓRIO COMPLETO DE ANÁLISE");
            System.out.println("=".repeat(50));
            System.out.println("Número analisado: " + numero);

            System.out.println("\n1. ANÁLISE DE PARIDADE:");
            if (numero % 2 == 0) {
                System.out.println("   - Número PAR");
            } else {
                System.out.println("   - Número ÍMPAR");
            }

            System.out.println("\n2. ANÁLISE DE MÚLTIPLOS:");
            boolean multiploTres = numero % 3 == 0;
            boolean multiploCinco = numero % 5 == 0;

            if (multiploTres && multiploCinco) {
                System.out.println("   - MÚLTIPLO de 3, 5 e 15!");
            } else if (multiploTres) {
                System.out.println("   - MÚLTIPLO de 3");
            } else if (multiploCinco) {
                System.out.println("   - MÚLTIPLO de 5");
            } else {
                System.out.println("   - NÃO é múltiplo de 3 nem de 5");
            }

            System.out.println("\n3. COMPARAÇÃO COM 100:");
            if (numero > 100) {
                System.out.printf("   - MAIOR que 100 (diferença: +%d)%n", (numero - 100));
            } else if (numero == 100) {
                System.out.println("   - EXATAMENTE igual a 100");
            } else {
                System.out.printf("   - MENOR que 100 (diferença: -%d)%n", (100 - numero));
            }

            System.out.println("\n4. ANÁLISE DE SINAL:");
            if (numero > 0) {
                System.out.println("   - Número POSITIVO");
            } else if (numero < 0) {
                System.out.println("   - Número NEGATIVO");
                System.out.printf("   - Valor absoluto: %d%n", Math.abs(numero));
            } else {
                System.out.println("   - Número ZERO (neutro)");
            }

            System.out.println("\n5. OPERAÇÕES MATEMÁTICAS:");
            long quadrado = (long) numero * numero;
            long cubo = (long) numero * numero * numero;
            System.out.printf("   - Quadrado: %d² = %d%n", numero, quadrado);
            System.out.printf("   - Cubo: %d³ = %d%n", numero, cubo);

            if (numero > 0) {
                System.out.printf("   - Raiz quadrada: √%d ≈ %.2f%n", numero, Math.sqrt(numero));
            }

            System.out.println("=".repeat(50));

            continuarAnalise = perguntarContinuar("Deseja analisar outro número?");
        }
    }

    private static void exercicioConversorTemperatura() {
        System.out.println("\n=== CONVERSOR DE TEMPERATURA ===");

        boolean continuarConversao = true;

        while (continuarConversao) {
            System.out.println("\nEscolha o tipo de conversão:");
            System.out.println("1. Celsius -> Fahrenheit");
            System.out.println("2. Fahrenheit -> Celsius");

            int opcao = lerOpcaoRange(1, 2);

            if (opcao == 1) {
                double celsius = lerDouble("Digite a temperatura em Celsius: ");
                double fahrenheit = (celsius * 1.8) + 32;

                System.out.println("\n--- RESULTADO DA CONVERSÃO ---");
                System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);

            } else {
                double fahrenheit = lerDouble("Digite a temperatura em Fahrenheit: ");
                double celsius = (fahrenheit - 32) / 1.8;

                System.out.println("\n--- RESULTADO DA CONVERSÃO ---");
                System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
            }

            continuarConversao = perguntarContinuar("Deseja fazer outra conversão?");
        }
    }

    private static void exercicioConversorDolar() {
        System.out.println("\n=== CONVERSOR DÓLAR <-> REAL ===");

        boolean continuarConversao = true;

        while (continuarConversao) {
            double cotacao = lerDouble("Digite a cotação atual do dólar: R$ ");

            System.out.println("\nEscolha o tipo de conversão:");
            System.out.println("1. Dólar -> Real");
            System.out.println("2. Real -> Dólar");

            int opcao = lerOpcaoRange(1, 2);

            if (opcao == 1) {
                double dolares = lerDouble("Digite o valor em dólares: US$ ");
                double reais = dolares * cotacao;

                System.out.println("\n--- CONVERSÃO DÓLAR -> REAL ---");
                System.out.printf("US$ %.2f × R$ %.2f = R$ %.2f%n", dolares, cotacao, reais);

            } else {
                double reais = lerDouble("Digite o valor em reais: R$ ");
                double dolares = reais / cotacao;

                System.out.println("\n--- CONVERSÃO REAL -> DÓLAR ---");
                System.out.printf("R$ %.2f ÷ R$ %.2f = US$ %.2f%n", reais, cotacao, dolares);
            }

            continuarConversao = perguntarContinuar("Deseja fazer outra conversão?");
        }
    }

    private static void exercicioPorcentagem() {
        System.out.println("\n=== CALCULADORA DE DESCONTOS E PORCENTAGENS ===");

        boolean continuarCalculo = true;

        while (continuarCalculo) {
            System.out.println("\nEscolha o tipo de cálculo:");
            System.out.println("1. Calcular desconto em produto");
            System.out.println("2. Calcular acréscimo/juros");
            System.out.println("3. Calcular porcentagem simples");

            int opcao = lerOpcaoRange(1, 3);

            switch (opcao) {
                case 1 -> calcularDesconto();
                case 2 -> calcularAcrescimo();
                case 3 -> calcularPorcentagemSimples();
                default -> System.out.println("Opção inválida!");
            }

            continuarCalculo = perguntarContinuar("Deseja fazer outro cálculo?");
        }
    }

    private static void calcularDesconto() {
        double precoOriginal = lerDouble("Digite o preço original: R$ ");
        double percentualDesconto = lerDouble("Digite o percentual de desconto (ex: 15 para 15%): ");

        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoFinal = precoOriginal - valorDesconto;

        System.out.println("\n--- CÁLCULO DE DESCONTO ---");
        System.out.printf("Preço original: R$ %.2f%n", precoOriginal);
        System.out.printf("Desconto de %.1f%%: -R$ %.2f%n", percentualDesconto, valorDesconto);
        System.out.println("-".repeat(30));
        System.out.printf("PREÇO FINAL: R$ %.2f%n", precoFinal);
        System.out.printf("ECONOMIA: R$ %.2f%n", valorDesconto);
    }

    private static void calcularAcrescimo() {
        double valorOriginal = lerDouble("Digite o valor original: R$ ");
        double percentualAcrescimo = lerDouble("Digite o percentual de acréscimo (ex: 10 para 10%): ");

        double valorAcrescimo = valorOriginal * (percentualAcrescimo / 100);
        double valorFinal = valorOriginal + valorAcrescimo;

        System.out.println("\n--- CÁLCULO DE ACRÉSCIMO ---");
        System.out.printf("Valor original: R$ %.2f%n", valorOriginal);
        System.out.printf("Acréscimo de %.1f%%: +R$ %.2f%n", percentualAcrescimo, valorAcrescimo);
        System.out.println("-".repeat(30));
        System.out.printf("VALOR FINAL: R$ %.2f%n", valorFinal);
    }

    private static void calcularPorcentagemSimples() {
        double valorTotal = lerDouble("Digite o valor total: ");
        double valorParte = lerDouble("Digite o valor da parte: ");

        double porcentagem = (valorParte / valorTotal) * 100;

        System.out.println("\n--- CÁLCULO DE PORCENTAGEM ---");
        System.out.printf("Valor total: %.2f%n", valorTotal);
        System.out.printf("Valor da parte: %.2f%n", valorParte);
        System.out.printf("Porcentagem: %.2f%%%n", porcentagem);
    }

    private static void exercicioIncremento() {
        System.out.println("\n=== DEMONSTRAÇÃO DE OPERADORES DE INCREMENTO ===");

        int numero = lerNumero("Digite um número inicial: ");
        int original = numero;

        System.out.println("\n--- DEMONSTRAÇÃO COMPLETA ---");
        System.out.println("Número inicial: " + original);

        numero = original;
        System.out.println("\n1. PRÉ-INCREMENTO (++numero):");
        System.out.println("   Antes: numero = " + numero);
        int resultado1 = ++numero;
        System.out.println("   Após ++numero: numero = " + numero);
        System.out.println("   Valor retornado: " + resultado1);

        numero = original;
        System.out.println("\n2. PÓS-INCREMENTO (numero++):");
        System.out.println("   Antes: numero = " + numero);
        int resultado2 = numero++;
        System.out.println("   Após numero++: numero = " + numero);
        System.out.println("   Valor retornado: " + resultado2);

        numero = original;
        System.out.println("\n3. PRÉ-DECREMENTO (--numero):");
        System.out.println("   Antes: numero = " + numero);
        int resultado3 = --numero;
        System.out.println("   Após --numero: numero = " + numero);
        System.out.println("   Valor retornado: " + resultado3);

        numero = original;
        System.out.println("\n4. PÓS-DECREMENTO (numero--):");
        System.out.println("   Antes: numero = " + numero);
        int resultado4 = numero--;
        System.out.println("   Após numero--: numero = " + numero);
        System.out.println("   Valor retornado: " + resultado4);
    }

    private static void exercicioOperadoresLogicos() {
        System.out.println("\n=== SISTEMA DE OPERADORES LÓGICOS ===");

        boolean continuarTeste = true;

        while (continuarTeste) {
            System.out.println("\nEscolha o tipo de demonstração:");
            System.out.println("1. Simulador de Decisões (E, OU, NÃO)");
            System.out.println("2. Demonstração Teórica");

            int opcao = lerOpcaoRange(1, 2);

            switch (opcao) {
                case 1 -> simuladorDecisoes();
                case 2 -> demonstracaoTeorica();
                default -> System.out.println("Opção inválida!");
            }

            continuarTeste = perguntarContinuar("Deseja testar outros operadores lógicos?");
        }
    }

    private static void simuladorDecisoes() {
        System.out.println("\n--- SIMULADOR DE DECISÕES ---");

        boolean temDinheiro = lerBoolean("Você tem dinheiro?");
        boolean fazSol = lerBoolean("Está fazendo sol?");
        boolean carroDisponivel = lerBoolean("O carro está disponível?");

        boolean podeSair = temDinheiro && fazSol;
        boolean irParaShopping = temDinheiro || carroDisponivel;
        boolean ficarEmCasa = !fazSol && !carroDisponivel;

        System.out.println("\n--- RESULTADO DAS DECISÕES ---");
        System.out.println("Condições:");
        System.out.println("  Tem dinheiro: " + temDinheiro);
        System.out.println("  Faz sol: " + fazSol);
        System.out.println("  Carro disponível: " + carroDisponivel);
        System.out.println();
        System.out.println("Decisões (com operadores lógicos):");
        System.out.println("  Pode sair (dinheiro E sol): " + podeSair);
        System.out.println("  Ir para shopping (dinheiro OU carro): " + irParaShopping);
        System.out.println("  Ficar em casa (NÃO sol E NÃO carro): " + ficarEmCasa);
    }

    private static void demonstracaoTeorica() {
        System.out.println("\n--- DEMONSTRAÇÃO TEÓRICA DOS OPERADORES LÓGICOS ---");

        boolean t1 = true;
        boolean t2 = true;
        boolean f1 = false;
        boolean f2 = false;

        System.out.println("\n1. OPERADOR E (&&) - Ambos devem ser verdadeiros:");
        System.out.println("   true  && true  = " + (t1 && t2));
        System.out.println("   true  && false = " + (t1 && f1));
        System.out.println("   false && true  = " + (f1 && t1));
        System.out.println("   false && false = " + (f1 && f2));

        System.out.println("\n2. OPERADOR OU (||) - Pelo menos um deve ser verdadeiro:");
        System.out.println("   true  || true  = " + (t1 || t2));
        System.out.println("   true  || false = " + (t1 || f1));
        System.out.println("   false || true  = " + (f1 || t1));
        System.out.println("   false || false = " + (f1 || f2));

        System.out.println("\n3. OPERADOR NÃO (!) - Inverte o valor:");
        System.out.println("   !true  = " + (!t1));
        System.out.println("   !false = " + (!f1));
    }

    // ==================== MÉTODOS AUXILIARES ====================

    private static int lerOpcao() {
        int opcao = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Escolha uma opção: ");
                opcao = SCANNER.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números!");
                SCANNER.nextLine();
            }
        }

        return opcao;
    }

    private static int lerOpcaoRange(int min, int max) {
        int opcao = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Escolha uma opção (" + min + "-" + max + "): ");
                opcao = SCANNER.nextInt();

                if (opcao >= min && opcao <= max) {
                    entradaValida = true;
                } else {
                    System.out.println("Opção deve estar entre " + min + " e " + max + "!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números!");
                SCANNER.nextLine();
            }
        }

        return opcao;
    }

    private static int lerNumero(String mensagem) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensagem);
                numero = SCANNER.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números inteiros!");
                SCANNER.nextLine();
            }
        }

        return numero;
    }

    private static double lerDouble(String mensagem) {
        double numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensagem);
                numero = SCANNER.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números!");
                SCANNER.nextLine();
            }
        }

        return numero;
    }

    private static double lerNota(String mensagem) {
        double nota = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensagem);
                nota = SCANNER.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Erro: A nota deve estar entre 0 e 10!");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas números!");
                SCANNER.nextLine();
            }
        }

        return nota;
    }

    private static boolean lerBoolean(String mensagem) {
        boolean valor = false;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print(mensagem + " (s/n): ");
            SCANNER.nextLine();
            String entrada = SCANNER.nextLine().toLowerCase().trim();

            if (entrada.equals("s") || entrada.equals("sim") || entrada.equals("true")) {
                valor = true;
                entradaValida = true;
            } else if (entrada.equals("n") || entrada.equals("nao") || entrada.equals("não") || entrada.equals("false")) {
                valor = false;
                entradaValida = true;
            } else {
                System.out.println("Erro: Digite 's' para sim ou 'n' para não!");
            }
        }

        return valor;
    }

    private static boolean perguntarContinuar(String mensagem) {
        return lerBoolean(mensagem);
    }

    private static void pausar() {
        SCANNER.nextLine();
        System.out.println("\nPressione ENTER para continuar...");
        SCANNER.nextLine();
    }
}
