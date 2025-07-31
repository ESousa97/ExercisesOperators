import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Sistema completo de exercícios em Java, organizado em categorias.
 * Permite prática interativa com operadores básicos, conversores, lógica e muito mais.
 * Cada categoria possui um menu dedicado com vários exercícios e demonstrações.
 */
public class SistemaExerciciosCompleto {
    // Scanner global para entrada do usuário durante toda a execução
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true; // Controla o loop principal do sistema

        exibirBoasVindas(); // Mensagem inicial para o usuário

        while (continuar) {
            exibirMenuPrincipal(); // Exibe opções do menu principal
            int opcao = lerOpcao(); // Lê a opção escolhida pelo usuário

            // Direciona para a funcionalidade escolhida
            switch (opcao) {
                case 1:
                    menuOperadoresBasicos();
                    break;
                case 2:
                    menuExerciciosInterativos();
                    break;
                case 3:
                    menuConversores();
                    break;
                case 4:
                    menuOperadoresEspeciais();
                    break;
                case 0: // Finaliza o sistema com mensagem de agradecimento
                    continuar = false;
                    System.out.println("\n" + "=".repeat(50));
                    System.out.println("Obrigado por usar o Sistema de Exercicios Java!");
                    System.out.println("Continue praticando programacao!");
                    System.out.println("=".repeat(50));
                    break;
                default: // Opção inválida
                    System.out.println("Opcao invalida! Tente novamente.");
            }

            // Pausa para o usuário antes de voltar ao menu principal (se não for sair)
            if (continuar && opcao >= 1 && opcao <= 4) {
                pausar();
            }
        }

        scanner.close(); // Fecha o Scanner ao final da execução
    }

    /**
     * Exibe a mensagem de boas-vindas com informações iniciais.
     */
    private static void exibirBoasVindas() {
        System.out.println("=".repeat(60));
        System.out.println("SISTEMA COMPLETO DE EXERCICIOS JAVA");
        System.out.println("Operadores, Conversores e Logica de Programacao");
        System.out.println("=".repeat(60));
        System.out.println("Bem-vindo ao sistema mais completo para praticar Java!");
        System.out.println("Aqui voce encontrara todos os exercicios organizados por categoria. Clique ENNTER para continuar...");
        pausar();
    }

    /**
     * Exibe o menu principal com as categorias disponíveis.
     */
    private static void exibirMenuPrincipal() {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("MENU PRINCIPAL");
        System.out.println("=".repeat(50));
        System.out.println("1. Operadores Basicos e Variaveis");
        System.out.println("2. Exercicios Interativos (Facil/Medio/Dificil)");
        System.out.println("3. Conversores e Calculos");
        System.out.println("4. Operadores Especiais");
        System.out.println("0. Sair do Sistema");
        System.out.println("=".repeat(50));
    }

    /**
     * Menu da categoria Operadores Básicos e Variáveis.
     * Permite escolher entre diversos exercícios relacionados a conceitos básicos.
     */
    private static void menuOperadoresBasicos() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("OPERADORES BASICOS E VARIAVEIS");
            System.out.println("=".repeat(50));
            System.out.println("1. Media de Duas Notas");
            System.out.println("2. Casting de Variaveis");
            System.out.println("3. Concatenacao de Caracteres");
            System.out.println("4. Multiplicacao de Produtos");
            System.out.println("5. Tipos Primitivos - Exercicio Completo");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.println("=".repeat(50));

            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    exercicioMediaNota();
                    break;
                case 2:
                    exercicioCasting();
                    break;
                case 3:
                    exercicioConcatenacao();
                    break;
                case 4:
                    exercicioMultiplicacao();
                    break;
                case 5:
                    exercicioTiposPrimitivos();
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

            if (!voltar && opcao >= 1 && opcao <= 5) {
                pausar();
            }
        }
    }

    /**
     * Menu da categoria Exercícios Interativos, com níveis fácil, médio e difícil.
     */
    private static void menuExerciciosInterativos() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("EXERCICIOS INTERATIVOS");
            System.out.println("=".repeat(50));
            System.out.println("1. [FACIL] Comparacao Simples");
            System.out.println("2. [MEDIO] Media do Aluno");
            System.out.println("3. [DIFICIL] Analise Completa de Numero");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.println("=".repeat(50));

            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    exercicioComparacaoSimples();
                    break;
                case 2:
                    exercicioMediaAluno();
                    break;
                case 3:
                    exercicioAnaliseNumero();
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

            if (!voltar && opcao >= 1 && opcao <= 3) {
                pausar();
            }
        }
    }

    /**
     * Menu da categoria Conversores e Cálculos diversos.
     */
    private static void menuConversores() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("CONVERSORES E CALCULOS");
            System.out.println("=".repeat(50));
            System.out.println("1. Conversor de Temperatura (Celsius -> Fahrenheit)");
            System.out.println("2. Conversor Dolar -> Real");
            System.out.println("3. Calculadora de Desconto/Porcentagem");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.println("=".repeat(50));

            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    exercicioConversorTemperatura();
                    break;
                case 2:
                    exercicioConversorDolar();
                    break;
                case 3:
                    exercicioPorcentagem();
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

            if (!voltar && opcao >= 1 && opcao <= 3) {
                pausar();
            }
        }
    }

    /**
     * Menu da categoria Operadores Especiais, como incremento e operadores lógicos.
     */
    private static void menuOperadoresEspeciais() {
        boolean voltar = false;

        while (!voltar) {
            System.out.println("\n" + "=".repeat(50));
            System.out.println("OPERADORES ESPECIAIS");
            System.out.println("=".repeat(50));
            System.out.println("1. Operadores de Incremento (++ e --)");
            System.out.println("2. Operadores Logicos (&&, ||, !)");
            System.out.println("0. Voltar ao Menu Principal");
            System.out.println("=".repeat(50));

            int opcao = lerOpcao();

            switch (opcao) {
                case 1:
                    exercicioIncremento();
                    break;
                case 2:
                    exercicioOperadoresLogicos();
                    break;
                case 0:
                    voltar = true;
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }

            if (!voltar && opcao >= 1 && opcao <= 2) {
                pausar();
            }
        }
    }

    // ==================== IMPLEMENTAÇÃO DOS EXERCÍCIOS ====================

    /**
     * 1. Calcula a média de duas notas informadas pelo usuário e mostra o status.
     */
    private static void exercicioMediaNota() {
        System.out.println("\n=== CALCULADORA DE MEDIA (DUAS NOTAS) ===");

        double nota1 = lerNota("Digite a primeira nota (0-10): ");
        double nota2 = lerNota("Digite a segunda nota (0-10): ");

        double media = (nota1 + nota2) / 2;

        System.out.println("\n--- RESULTADO ---");
        System.out.printf("Primeira nota: %.2f\n", nota1);
        System.out.printf("Segunda nota: %.2f\n", nota2);
        System.out.printf("Media final: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Status: APROVADO! Parabens!");
        } else if (media >= 5.0) {
            System.out.println("Status: RECUPERACAO! Estude mais!");
        } else {
            System.out.println("Status: REPROVADO! Precisa estudar muito!");
        }
    }

    /**
     * 2. Demonstração de casting entre tipos primitivos.
     */
    private static void exercicioCasting() {
        System.out.println("\n=== DEMONSTRACAO DE CASTING ===");

        double numeroDecimal = lerDouble("Digite um numero decimal: ");

        // Casting para int (perde parte decimal)
        int numeroInteiro = (int) numeroDecimal;

        System.out.println("\n--- RESULTADO DO CASTING ---");
        System.out.printf("Numero original (double): %.3f\n", numeroDecimal);
        System.out.printf("Apos casting para int: %d\n", numeroInteiro);
        System.out.printf("Parte perdida no casting: %.3f\n", (numeroDecimal - numeroInteiro));

        // Exemplos adicionais
        System.out.println("\n--- OUTROS EXEMPLOS DE CASTING ---");
        char letra = 'A';
        int codigoAscii = (int) letra;
        System.out.printf("Char '%c' -> ASCII: %d\n", letra, codigoAscii);

        int numero = 65;
        char letraConvertida = (char) numero;
        System.out.printf("Int %d -> Char: '%c'\n", numero, letraConvertida);
    }

    /**
     * 3. Exercício de concatenação simples de caracteres e strings.
     */
    private static void exercicioConcatenacao() {
        System.out.println("\n=== EXERCICIO DE CONCATENACAO ===");

        System.out.print("Digite uma letra: ");
        scanner.nextLine(); // Limpa buffer
        String entrada = scanner.nextLine();
        char letra = entrada.length() > 0 ? entrada.charAt(0) : 'X';

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        System.out.println("\n--- RESULTADOS DA CONCATENACAO ---");
        System.out.println("Letra: '" + letra + "'");
        System.out.println("Palavra: \"" + palavra + "\"");
        System.out.println("Concatenacao: \"" + letra + palavra + "\"");
        System.out.println("Concatenacao formatada: A letra '" + letra + "' junto com a palavra '" + palavra + "' forma: '" + letra + palavra + "'");

        // Demonstrações adicionais com strings
        System.out.println("\n--- OUTRAS CONCATENACOES ---");
        System.out.println("Letra maiuscula: " + Character.toUpperCase(letra));
        System.out.println("Palavra maiuscula: " + palavra.toUpperCase());
        System.out.println("Tamanho da palavra: " + palavra.length() + " caracteres");
    }

    /**
     * 4. Calcula o preço total da compra e aplica desconto se aplicável.
     */
    private static void exercicioMultiplicacao() {
        System.out.println("\n=== CALCULADORA DE PRODUTOS ===");

        double precoProduto = lerDouble("Digite o preco unitario do produto: R$ ");
        int quantidade = lerNumero("Digite a quantidade: ");

        double precoTotal = precoProduto * quantidade;

        System.out.println("\n--- NOTA FISCAL SIMPLIFICADA ---");
        System.out.printf("Produto: Preco unitario R$ %.2f\n", precoProduto);
        System.out.printf("Quantidade: %d unidades\n", quantidade);
        System.out.println("-".repeat(30));
        System.out.printf("TOTAL A PAGAR: R$ %.2f\n", precoTotal);

        // Aplica desconto de 10% para compras acima de 10 unidades
        if (quantidade >= 10) {
            double desconto = precoTotal * 0.1;
            double precoComDesconto = precoTotal - desconto;
            System.out.println("\nDESCONTO ESPECIAL!");
            System.out.printf("Desconto de 10%% para compras acima de 10 unidades: -R$ %.2f\n", desconto);
            System.out.printf("PRECO FINAL COM DESCONTO: R$ %.2f\n", precoComDesconto);
        }
    }

    /**
     * 5. Demonstração e uso dos tipos primitivos básicos do Java.
     */
    private static void exercicioTiposPrimitivos() {
        System.out.println("\n=== DEMONSTRACAO DE TIPOS PRIMITIVOS ===");

        System.out.print("Digite sua idade: ");
        int idade = lerNumero("");

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = lerDouble("");

        System.out.print("Digite seu peso em kg: ");
        float peso = (float) lerDouble("");

        System.out.print("Digite a primeira letra do seu nome: ");
        scanner.nextLine(); // limpar buffer
        char inicial = scanner.nextLine().charAt(0);

        System.out.print("Voce esta estudando? (true/false): ");
        boolean estudando = scanner.nextBoolean();

        // Exibe os valores e tipos com espaço em bytes
        System.out.println("\n--- ANALISE DOS TIPOS PRIMITIVOS ---");
        System.out.println("TIPO    | VARIAVEL | VALOR        | BYTES");
        System.out.println("--------|----------|--------------|------");
        System.out.printf("int     | idade    | %-12d | 4\n", idade);
        System.out.printf("double  | altura   | %-12.2f | 8\n", altura);
        System.out.printf("float   | peso     | %-12.1f | 4\n", peso);
        System.out.printf("char    | inicial  | %-12c | 2\n", inicial);
        System.out.printf("boolean | estudando| %-12s | 1\n", estudando);

        // Calcula e classifica o IMC
        double imc = peso / (altura * altura);
        System.out.println("\n--- CALCULOS ADICIONAIS ---");
        System.out.printf("Seu IMC: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificacao: Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Classificacao: Peso normal");
        } else if (imc < 30) {
            System.out.println("Classificacao: Sobrepeso");
        } else {
            System.out.println("Classificacao: Obesidade");
        }
    }

    /**
     * 6. Compara dois números e mostra análises diversas.
     */
    private static void exercicioComparacaoSimples() {
        System.out.println("\n=== [FACIL] COMPARACAO SIMPLES ===");

        boolean continuarComparacao = true;

        while (continuarComparacao) {
            int num1 = lerNumero("Digite o primeiro numero: ");
            int num2 = lerNumero("Digite o segundo numero: ");

            System.out.println("\n--- ANALISE COMPLETA ---");

            if (num1 == num2) {
                System.out.println("RESULTADO: Os numeros sao IGUAIS!");
                System.out.printf("Ambos valem: %d\n", num1);
            } else {
                System.out.println("RESULTADO: Os numeros sao DIFERENTES!");
                System.out.printf("%d != %d\n", num1, num2);

                if (num1 > num2) {
                    System.out.printf("%d e MAIOR que %d\n", num1, num2);
                    System.out.printf("Diferenca: %d\n", (num1 - num2));
                } else {
                    System.out.printf("%d e MAIOR que %d\n", num2, num1);
                    System.out.printf("Diferenca: %d\n", (num2 - num1));
                }
            }

            // Análises extras com soma, produto e divisão
            System.out.println("\n--- ANALISES EXTRAS ---");
            System.out.printf("Soma: %d + %d = %d\n", num1, num2, (num1 + num2));
            System.out.printf("Produto: %d x %d = %d\n", num1, num2, (num1 * num2));

            if (num2 != 0) {
                System.out.printf("Divisao: %d / %d = %.2f\n", num1, num2, ((double) num1 / num2));
            }

            continuarComparacao = perguntarContinuar("Deseja comparar outros numeros?");
        }
    }

    /**
     * 7. Calcula a média de três notas do aluno e exibe boletim completo.
     */
    private static void exercicioMediaAluno() {
        System.out.println("\n=== [MEDIO] SISTEMA DE NOTAS ESCOLAR ===");

        boolean continuarCalculo = true;

        while (continuarCalculo) {
            System.out.print("Digite o nome do aluno: ");
            scanner.nextLine(); // Limpa buffer
            String nomeAluno = scanner.nextLine();

            double nota1 = lerNota("Nota do 1o bimestre (0-10): ");
            double nota2 = lerNota("Nota do 2o bimestre (0-10): ");
            double nota3 = lerNota("Nota do 3o bimestre (0-10): ");

            double media = (nota1 + nota2 + nota3) / 3;

            System.out.println("\n" + "=".repeat(40));
            System.out.println("BOLETIM ESCOLAR");
            System.out.println("=".repeat(40));
            System.out.println("Aluno: " + nomeAluno);
            System.out.printf("1o Bimestre: %.2f\n", nota1);
            System.out.printf("2o Bimestre: %.2f\n", nota2);
            System.out.printf("3o Bimestre: %.2f\n", nota3);
            System.out.println("-".repeat(40));
            System.out.printf("MEDIA FINAL: %.2f\n", media);

            // Determina situação final
            String situacao;
            String observacao;

            if (media >= 7) {
                situacao = "APROVADO";
                observacao = "Parabens! Excelente desempenho!";
            } else if (media >= 5) {
                situacao = "RECUPERACAO";
                double pontosNecessarios = 7.0 - media;
                observacao = String.format("Precisa de %.2f pontos na recuperacao", pontosNecessarios);
            } else {
                situacao = "REPROVADO";
                double pontosNecessarios = 5.0 - media;
                observacao = String.format("Faltaram %.2f pontos para recuperacao", pontosNecessarios);
            }

            System.out.printf("SITUACAO: %s\n", situacao);
            System.out.println("OBSERVACAO: " + observacao);
            System.out.println("=".repeat(40));

            // Estatísticas adicionais para análise
            System.out.println("\n--- ESTATISTICAS ---");
            double maiorNota = Math.max(Math.max(nota1, nota2), nota3);
            double menorNota = Math.min(Math.min(nota1, nota2), nota3);
            System.out.printf("Maior nota: %.2f\n", maiorNota);
            System.out.printf("Menor nota: %.2f\n", menorNota);
            System.out.printf("Variacao: %.2f\n", (maiorNota - menorNota));

            continuarCalculo = perguntarContinuar("Deseja calcular a media de outro aluno?");
        }
    }

    /**
     * 8. Analisa um número inteiro detalhadamente.
     */
    private static void exercicioAnaliseNumero() {
        System.out.println("\n=== [DIFICIL] ANALISADOR AVANCADO DE NUMEROS ===");

        boolean continuarAnalise = true;

        while (continuarAnalise) {
            int numero = lerNumero("Digite um numero inteiro para analise completa: ");

            System.out.println("\n" + "=".repeat(50));
            System.out.println("RELATORIO COMPLETO DE ANALISE");
            System.out.println("=".repeat(50));
            System.out.println("Numero analisado: " + numero);
            System.out.println();

            // 1. Paridade do número
            System.out.println("1. ANALISE DE PARIDADE:");
            if (numero % 2 == 0) {
                System.out.println("   - Numero PAR");
                System.out.println("   - Divisivel por 2 sem resto");
            } else {
                System.out.println("   - Numero IMPAR");
                System.out.println("   - Deixa resto 1 quando dividido por 2");
            }

            // 2. Múltiplos de 3, 5 e 2
            System.out.println("\n2. ANALISE DE MULTIPLOS:");
            boolean multiploTres = numero % 3 == 0;
            boolean multiploCinco = numero % 5 == 0;
            boolean multiploDois = numero % 2 == 0;

            if (multiploTres && multiploCinco) {
                System.out.println("   - MULTIPLO de 3, 5 e 15!");
            } else if (multiploTres) {
                System.out.println("   - MULTIPLO de 3");
            } else if (multiploCinco) {
                System.out.println("   - MULTIPLO de 5");
            } else {
                System.out.println("   - NAO e multiplo de 3 nem de 5");
            }

            if (multiploDois) {
                System.out.println("   - MULTIPLO de 2");
            }

            // 3. Comparação com 100
            System.out.println("\n3. COMPARACAO COM 100:");
            if (numero > 100) {
                System.out.printf("   - MAIOR que 100 (diferenca: +%d)\n", (numero - 100));
            } else if (numero == 100) {
                System.out.println("   - EXATAMENTE igual a 100");
            } else {
                System.out.printf("   - MENOR que 100 (diferenca: -%d)\n", (100 - numero));
            }

            // 4. Análise de sinal
            System.out.println("\n4. ANALISE DE SINAL:");
            if (numero > 0) {
                System.out.println("   - Numero POSITIVO");
            } else if (numero < 0) {
                System.out.println("   - Numero NEGATIVO");
                System.out.printf("   - Valor absoluto: %d\n", Math.abs(numero));
            } else {
                System.out.println("   - Numero ZERO (neutro)");
            }

            // 5. Operações matemáticas (quadrado, cubo, raiz)
            System.out.println("\n5. OPERACOES MATEMATICAS:");
            long quadrado = (long) numero * numero;
            long cubo = (long) numero * numero * numero;
            System.out.printf("   - Quadrado: %d² = %d\n", numero, quadrado);
            System.out.printf("   - Cubo: %d³ = %d\n", numero, cubo);

            if (numero > 0) {
                System.out.printf("   - Raiz quadrada: √%d ≈ %.2f\n", numero, Math.sqrt(numero));
            }

            // 6. Análise de dígitos para números positivos
            if (numero > 0) {
                System.out.println("\n6. ANALISE DE DIGITOS:");
                String numeroStr = String.valueOf(numero);
                System.out.printf("   - Quantidade de digitos: %d\n", numeroStr.length());

                int soma = 0;
                for (char c : numeroStr.toCharArray()) {
                    soma += Character.getNumericValue(c);
                }
                System.out.printf("   - Soma dos digitos: %d\n", soma);
            }

            // 7. Classificação especial baseada no valor do número
            System.out.println("\n7. CLASSIFICACAO ESPECIAL:");
            if (numero == 0) {
                System.out.println("   - Elemento neutro da adicao");
            } else if (numero == 1) {
                System.out.println("   - Elemento neutro da multiplicacao");
            } else if (numero > 1 && numero <= 10) {
                System.out.println("   - Numero de um digito maior que 1");
            } else if (numero >= 10 && numero <= 99) {
                System.out.println("   - Numero de dois digitos");
            } else if (numero >= 100 && numero <= 999) {
                System.out.println("   - Numero de tres digitos");
            } else if (numero >= 1000) {
                System.out.println("   - Numero de quatro ou mais digitos");
            }

            System.out.println("=".repeat(50));

            continuarAnalise = perguntarContinuar("Deseja analisar outro numero?");
        }
    }

    /**
     * 9. Conversor interativo entre Celsius e Fahrenheit.
     */
    private static void exercicioConversorTemperatura() {
        System.out.println("\n=== CONVERSOR DE TEMPERATURA ===");

        boolean continuarConversao = true;

        while (continuarConversao) {
            System.out.println("\nEscolha o tipo de conversao:");
            System.out.println("1. Celsius -> Fahrenheit");
            System.out.println("2. Fahrenheit -> Celsius");

            int opcao = lerOpcaoRange(1, 2);

            if (opcao == 1) {
                double celsius = lerDouble("Digite a temperatura em Celsius: ");
                double fahrenheit = (celsius * 1.8) + 32;

                System.out.println("\n--- RESULTADO DA CONVERSAO ---");
                System.out.printf("%.2f°C = %.2f°F\n", celsius, fahrenheit);

                if (celsius <= 0) {
                    System.out.println("A agua congela nesta temperatura!");
                } else if (celsius >= 100) {
                    System.out.println("A agua ferve nesta temperatura!");
                } else if (celsius >= 36 && celsius <= 37.5) {
                    System.out.println("Temperatura corporal normal!");
                }

            } else {
                double fahrenheit = lerDouble("Digite a temperatura em Fahrenheit: ");
                double celsius = (fahrenheit - 32) / 1.8;

                System.out.println("\n--- RESULTADO DA CONVERSAO ---");
                System.out.printf("%.2f°F = %.2f°C\n", fahrenheit, celsius);

                if (fahrenheit <= 32) {
                    System.out.println("A agua congela nesta temperatura!");
                } else if (fahrenheit >= 212) {
                    System.out.println("A agua ferve nesta temperatura!");
                } else if (fahrenheit >= 96.8 && fahrenheit <= 99.5) {
                    System.out.println("Temperatura corporal normal!");
                }
            }

            continuarConversao = perguntarContinuar("Deseja fazer outra conversao?");
        }
    }

    /**
     * 10. Conversor entre dólar e real, com análise da cotação.
     */
    private static void exercicioConversorDolar() {
        System.out.println("\n=== CONVERSOR DOLAR <-> REAL ===");

        boolean continuarConversao = true;

        while (continuarConversao) {
            double cotacao = lerDouble("Digite a cotacao atual do dolar (ex: 5.20): R$ ");

            System.out.println("\nEscolha o tipo de conversao:");
            System.out.println("1. Dolar -> Real");
            System.out.println("2. Real -> Dolar");

            int opcao = lerOpcaoRange(1, 2);

            if (opcao == 1) {
                double dolares = lerDouble("Digite o valor em dolares: US$ ");
                double reais = dolares * cotacao;

                System.out.println("\n--- CONVERSAO DOLAR -> REAL ---");
                System.out.printf("US$ %.2f x R$ %.2f = R$ %.2f\n", dolares, cotacao, reais);

                if (reais >= 1000) {
                    System.out.println("Valor alto! Considere investimentos.");
                } else if (reais >= 100) {
                    System.out.println("Valor moderado para compras.");
                } else {
                    System.out.println("Valor baixo, bom para pequenas compras.");
                }

            } else {
                double reais = lerDouble("Digite o valor em reais: R$ ");
                double dolares = reais / cotacao;

                System.out.println("\n--- CONVERSAO REAL -> DOLAR ---");
                System.out.printf("R$ %.2f / R$ %.2f = US$ %.2f\n", reais, cotacao, dolares);

                if (dolares >= 200) {
                    System.out.println("Boa quantia em dolares!");
                } else if (dolares >= 50) {
                    System.out.println("Valor moderado em dolares.");
                } else {
                    System.out.println("Valor baixo em dolares.");
                }
            }

            System.out.println("\n--- ANALISE DA COTACAO ---");
            if (cotacao >= 6.0) {
                System.out.println("Dolar muito alto! Ruim para importacoes.");
            } else if (cotacao >= 5.0) {
                System.out.println("Dolar alto, moderado para viagens.");
            } else if (cotacao >= 4.0) {
                System.out.println("Cotacao moderada.");
            } else {
                System.out.println("Dolar baixo! Bom para viagens!");
            }

            continuarConversao = perguntarContinuar("Deseja fazer outra conversao?");
        }
    }

    /**
     * 11. Calculadora de porcentagem e desconto com três opções de cálculo.
     */
    private static void exercicioPorcentagem() {
        System.out.println("\n=== CALCULADORA DE DESCONTOS E PORCENTAGENS ===");

        boolean continuarCalculo = true;

        while (continuarCalculo) {
            System.out.println("\nEscolha o tipo de calculo:");
            System.out.println("1. Calcular desconto em produto");
            System.out.println("2. Calcular acrescimo/juros");
            System.out.println("3. Calcular porcentagem simples");

            int opcao = lerOpcaoRange(1, 3);

            switch (opcao) {
                case 1:
                    calcularDesconto();
                    break;
                case 2:
                    calcularAcrescimo();
                    break;
                case 3:
                    calcularPorcentagemSimples();
                    break;
            }

            continuarCalculo = perguntarContinuar("Deseja fazer outro calculo?");
        }
    }

    // Calcula desconto percentual e exibe resultados
    private static void calcularDesconto() {
        double precoOriginal = lerDouble("Digite o preco original: R$ ");
        double percentualDesconto = lerDouble("Digite o percentual de desconto (ex: 15 para 15%): ");

        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoFinal = precoOriginal - valorDesconto;

        System.out.println("\n--- CALCULO DE DESCONTO ---");
        System.out.printf("Preco original: R$ %.2f\n", precoOriginal);
        System.out.printf("Desconto de %.1f%%: -R$ %.2f\n", percentualDesconto, valorDesconto);
        System.out.println("-".repeat(30));
        System.out.printf("PRECO FINAL: R$ %.2f\n", precoFinal);
        System.out.printf("ECONOMIA: R$ %.2f\n", valorDesconto);

        if (percentualDesconto >= 50) {
            System.out.println("DESCONTO EXCELENTE! Aproveite!");
        } else if (percentualDesconto >= 30) {
            System.out.println("BOM DESCONTO! Vale a pena!");
        } else if (percentualDesconto >= 10) {
            System.out.println("Desconto moderado.");
        } else {
            System.out.println("Desconto baixo.");
        }
    }

    // Calcula acréscimo percentual e exibe resultados
    private static void calcularAcrescimo() {
        double valorOriginal = lerDouble("Digite o valor original: R$ ");
        double percentualAcrescimo = lerDouble("Digite o percentual de acrescimo (ex: 10 para 10%): ");

        double valorAcrescimo = valorOriginal * (percentualAcrescimo / 100);
        double valorFinal = valorOriginal + valorAcrescimo;

        System.out.println("\n--- CALCULO DE ACRESCIMO ---");
        System.out.printf("Valor original: R$ %.2f\n", valorOriginal);
        System.out.printf("Acrescimo de %.1f%%: +R$ %.2f\n", percentualAcrescimo, valorAcrescimo);
        System.out.println("-".repeat(30));
        System.out.printf("VALOR FINAL: R$ %.2f\n", valorFinal);

        if (percentualAcrescimo >= 20) {
            System.out.println("Acrescimo alto! Cuidado com juros.");
        } else if (percentualAcrescimo >= 10) {
            System.out.println("Acrescimo moderado.");
        } else {
            System.out.println("Acrescimo baixo.");
        }
    }

    // Calcula porcentagem simples de uma parte em relação ao todo
    private static void calcularPorcentagemSimples() {
        double valorTotal = lerDouble("Digite o valor total: ");
        double valorParte = lerDouble("Digite o valor da parte: ");

        double porcentagem = (valorParte / valorTotal) * 100;

        System.out.println("\n--- CALCULO DE PORCENTAGEM ---");
        System.out.printf("Valor total: %.2f\n", valorTotal);
        System.out.printf("Valor da parte: %.2f\n", valorParte);
        System.out.printf("Porcentagem: %.2f%%\n", porcentagem);

        if (porcentagem >= 75) {
            System.out.println("Representa a maior parte do total!");
        } else if (porcentagem >= 50) {
            System.out.println("Representa mais da metade!");
        } else if (porcentagem >= 25) {
            System.out.println("Representa uma parte significativa.");
        } else {
            System.out.println("Representa uma pequena parte.");
        }
    }

    /**
     * 12. Demonstração dos operadores de incremento e decremento.
     */
    private static void exercicioIncremento() {
        System.out.println("\n=== DEMONSTRACAO DE OPERADORES DE INCREMENTO ===");
        System.out.println("Este exercicio demonstra a diferenca entre pre e pos incremento/decremento.");

        int numero = lerNumero("Digite um numero inicial: ");
        int original = numero;

        System.out.println("\n--- DEMONSTRACAO COMPLETA ---");
        System.out.println("Numero inicial: " + original);
        System.out.println();

        // Pré-incremento
        numero = original;
        System.out.println("1. PRE-INCREMENTO (++numero):");
        System.out.println("   Antes: numero = " + numero);
        int resultado1 = ++numero;
        System.out.println("   Apos ++numero: numero = " + numero);
        System.out.println("   Valor retornado: " + resultado1);
        System.out.println("   EXPLICACAO: Incrementa ANTES de usar o valor");

        // Pós-incremento
        numero = original;
        System.out.println("\n2. POS-INCREMENTO (numero++):");
        System.out.println("   Antes: numero = " + numero);
        int resultado2 = numero++;
        System.out.println("   Apos numero++: numero = " + numero);
        System.out.println("   Valor retornado: " + resultado2);
        System.out.println("   EXPLICACAO: Usa o valor ANTES de incrementar");

        // Pré-decremento
        numero = original;
        System.out.println("\n3. PRE-DECREMENTO (--numero):");
        System.out.println("   Antes: numero = " + numero);
        int resultado3 = --numero;
        System.out.println("   Apos --numero: numero = " + numero);
        System.out.println("   Valor retornado: " + resultado3);
        System.out.println("   EXPLICACAO: Decrementa ANTES de usar o valor");

        // Pós-decremento
        numero = original;
        System.out.println("\n4. POS-DECREMENTO (numero--):");
        System.out.println("   Antes: numero = " + numero);
        int resultado4 = numero--;
        System.out.println("   Apos numero--: numero = " + numero);
        System.out.println("   Valor retornado: " + resultado4);
        System.out.println("   EXPLICACAO: Usa o valor ANTES de decrementar");

        // Demonstração em loop
        System.out.println("\n--- DEMONSTRACAO EM LOOP ---");
        System.out.println("Contagem crescente com pre-incremento:");
        for (int i = 0; i < 5; ++i) {
            System.out.print(i + " ");
        }

        System.out.println("\nContagem decrescente com pos-decremento:");
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Exemplo prático de contador
        System.out.println("\n--- EXEMPLO PRATICO ---");
        int contador = 0;
        System.out.println("Simulando contador de visitas:");
        System.out.println("Visitas iniciais: " + contador);
        System.out.println("Nova visita (++contador): " + (++contador));
        System.out.println("Outra visita (++contador): " + (++contador));
        System.out.println("Total de visitas: " + contador);
    }

    /**
     * 13. Demonstração e testes com operadores lógicos.
     */
    private static void exercicioOperadoresLogicos() {
        System.out.println("\n=== SISTEMA DE OPERADORES LOGICOS ===");

        boolean continuarTeste = true;

        while (continuarTeste) {
            System.out.println("\nEscolha o tipo de demonstracao:");
            System.out.println("1. Simulador de Decisoes (E, OU, NAO)");
            System.out.println("2. Sistema de Login");
            System.out.println("3. Verificador de Idade e Habilitacao");
            System.out.println("4. Demonstracao Teorica");

            int opcao = lerOpcaoRange(1, 4);

            switch (opcao) {
                case 1:
                    simuladorDecisoes();
                    break;
                case 2:
                    sistemaLogin();
                    break;
                case 3:
                    verificadorIdadeHabilitacao();
                    break;
                case 4:
                    demonstracaoTeorica();
                    break;
            }

            continuarTeste = perguntarContinuar("Deseja testar outros operadores logicos?");
        }
    }

    // Simulador de decisões usando operadores lógicos
    private static void simuladorDecisoes() {
        System.out.println("\n--- SIMULADOR DE DECISOES ---");

        boolean temDinheiro = lerBoolean("Voce tem dinheiro?");
        boolean fazSol = lerBoolean("Esta fazendo sol?");
        boolean carroDisponivel = lerBoolean("O carro esta disponivel?");
        boolean temTempo = lerBoolean("Voce tem tempo livre?");

        // Aplicação dos operadores lógicos
        boolean podeSair = temDinheiro && fazSol;
        boolean irParaShopping = temDinheiro || carroDisponivel;
        boolean ficarEmCasa = !fazSol && !carroDisponivel;
        boolean viajarFinDeSemana = temDinheiro && carroDisponivel && temTempo;
        boolean precisaTrabalhar = !temTempo || !temDinheiro;

        System.out.println("\n--- RESULTADO DAS DECISOES ---");
        System.out.println("Condicoes:");
        System.out.println("  Tem dinheiro: " + temDinheiro);
        System.out.println("  Faz sol: " + fazSol);
        System.out.println("  Carro disponivel: " + carroDisponivel);
        System.out.println("  Tem tempo: " + temTempo);
        System.out.println();

        System.out.println("Decisoes (com operadores logicos):");
        System.out.println("  Pode sair (dinheiro E sol): " + podeSair);
        System.out.println("  Ir para shopping (dinheiro OU carro): " + irParaShopping);
        System.out.println("  Ficar em casa (NAO sol E NAO carro): " + ficarEmCasa);
        System.out.println("  Viajar fim de semana (dinheiro E carro E tempo): " + viajarFinDeSemana);
        System.out.println("  Precisa trabalhar (NAO tempo OU NAO dinheiro): " + precisaTrabalhar);

        System.out.println("\n--- RECOMENDACAO ---");
        if (viajarFinDeSemana) {
            System.out.println("RECOMENDACAO: Faca uma viagem!");
        } else if (podeSair) {
            System.out.println("RECOMENDACAO: Saia para se divertir!");
        } else if (irParaShopping) {
            System.out.println("RECOMENDACAO: Va ao shopping!");
        } else if (ficarEmCasa) {
            System.out.println("RECOMENDACAO: Fique em casa e relaxe!");
        } else {
            System.out.println("RECOMENDACAO: Aproveite para descansar!");
        }
    }

    // Simula um sistema simples de login verificando usuário e senha fixos
    private static void sistemaLogin() {
        System.out.println("\n--- SISTEMA DE LOGIN ---");

        String usuarioCorreto = "admin";
        String senhaCorreta = "123456";

        System.out.print("Digite o usuario: ");
        scanner.nextLine(); // limpar buffer
        String usuario = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        boolean usuarioOk = usuario.equals(usuarioCorreto);
        boolean senhaOk = senha.equals(senhaCorreta);
        boolean loginValido = usuarioOk && senhaOk;

        System.out.println("\n--- VERIFICACAO DE LOGIN ---");
        System.out.println("Usuario correto: " + usuarioOk);
        System.out.println("Senha correta: " + senhaOk);
        System.out.println("Login valido (usuario E senha): " + loginValido);

        if (loginValido) {
            System.out.println("\nACESSO LIBERADO! Bem-vindo ao sistema!");
        } else {
            System.out.println("\nACESSO NEGADO!");
            if (!usuarioOk && !senhaOk) {
                System.out.println("Usuario e senha incorretos.");
            } else if (!usuarioOk) {
                System.out.println("Usuario incorreto.");
            } else {
                System.out.println("Senha incorreta.");
            }
        }

        System.out.println("\nDICA: Usuario correto = 'admin', Senha correta = '123456'");
    }

    // Verifica idade, habilitação e carro para autorizações simples
    private static void verificadorIdadeHabilitacao() {
        System.out.println("\n--- VERIFICADOR DE IDADE E HABILITACAO ---");

        int idade = lerNumero("Digite sua idade: ");
        boolean temHabilitacao = lerBoolean("Voce tem habilitacao?");
        boolean temCarro = lerBoolean("Voce tem carro?");

        boolean maiorIdade = idade >= 18;
        boolean podeDirigir = maiorIdade && temHabilitacao;
        boolean podeViajar = podeDirigir && temCarro;
        boolean precisaHabilitacao = maiorIdade && !temHabilitacao;
        boolean muitoJovem = idade < 16;

        System.out.println("\n--- ANALISE COMPLETA ---");
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Tem habilitacao: " + temHabilitacao);
        System.out.println("Tem carro: " + temCarro);
        System.out.println();

        System.out.println("Verificacoes:");
        System.out.println("  E maior de idade (idade >= 18): " + maiorIdade);
        System.out.println("  Pode dirigir (maior E habilitacao): " + podeDirigir);
        System.out.println("  Pode viajar (dirigir E carro): " + podeViajar);
        System.out.println("  Precisa tirar habilitacao (maior E NAO habilitacao): " + precisaHabilitacao);
        System.out.println("  Muito jovem (idade < 16): " + muitoJovem);

        System.out.println("\n--- ORIENTACAO ---");
        if (podeViajar) {
            System.out.println("Voce pode viajar dirigindo seu proprio carro!");
        } else if (podeDirigir) {
            System.out.println("Voce pode dirigir! Considere comprar um carro.");
        } else if (precisaHabilitacao) {
            System.out.println("Voce ja pode tirar a habilitacao!");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Voce pode se preparar para tirar a habilitacao aos 18.");
        } else if (muitoJovem) {
            System.out.println("Ainda muito jovem. Aguarde um pouco mais!");
        }
    }

    // Demonstrações teóricas dos operadores lógicos
    private static void demonstracaoTeorica() {
        System.out.println("\n--- DEMONSTRAÇÃO TEÓRICA DOS OPERADORES LÓGICOS ---");

        boolean t1 = true, t2 = true;
        boolean f1 = false, f2 = false;

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

        System.out.println("\n4. COMBINAÇÕES COMPLEXAS:");
        boolean a = true, b = false, c = true;
        System.out.println("   Seja: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("   (a && b) || c = " + ((a && b) || c));
        System.out.println("   a && (b || c) = " + (a && (b || c)));
        System.out.println("   !(a && b) = " + (!(a && b)));
        System.out.println("   !a || !b = " + (!a || !b));

        System.out.println("\n5. LEI DE DE MORGAN:");
        System.out.println("   !(a && b) equivale a (!a || !b)");
        System.out.println("   !(a || b) equivale a (!a && !b)");
        System.out.println("   Verificação: !(true && false) = " + (!(t1 && f1)));
        System.out.println("   Verificação: (!true || !false) = " + (!t1 || !f1));
    }

    // ==================== MÉTODOS AUXILIARES ====================

    /**
     * Lê a opção do menu, tratando erros de entrada não numérica.
     * @return opção válida lida do usuário.
     */
    private static int lerOpcao() {
        int opcao = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Escolha uma opcao: ");
                opcao = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas numeros!");
                scanner.nextLine(); // limpa buffer inválido
            }
        }

        return opcao;
    }

    /**
     * Lê uma opção garantindo que está dentro do intervalo [min, max].
     */
    private static int lerOpcaoRange(int min, int max) {
        int opcao = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Escolha uma opcao (" + min + "-" + max + "): ");
                opcao = scanner.nextInt();

                if (opcao >= min && opcao <= max) {
                    entradaValida = true;
                } else {
                    System.out.println("Opcao deve estar entre " + min + " e " + max + "!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas numeros!");
                scanner.nextLine();
            }
        }

        return opcao;
    }

    /**
     * Lê um número inteiro do usuário, tratando erro de entrada.
     */
    private static int lerNumero(String mensagem) {
        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensagem);
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas numeros inteiros!");
                scanner.nextLine();
            }
        }

        return numero;
    }

    /**
     * Lê um número decimal (double), tratando erros.
     */
    private static double lerDouble(String mensagem) {
        double numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensagem);
                numero = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas numeros!");
                scanner.nextLine();
            }
        }

        return numero;
    }

    /**
     * Lê uma nota entre 0 e 10, validando o intervalo.
     */
    private static double lerNota(String mensagem) {
        double nota = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print(mensagem);
                nota = scanner.nextDouble();

                if (nota < 0 || nota > 10) {
                    System.out.println("Erro: A nota deve estar entre 0 e 10!");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite apenas numeros!");
                scanner.nextLine();
            }
        }

        return nota;
    }

    /**
     * Lê um valor boolean do usuário, aceitando 's/n' ou 'true/false'.
     */
    private static boolean lerBoolean(String mensagem) {
        boolean valor = false;
        boolean entradaValida = false;

        while (!entradaValida) {
            System.out.print(mensagem + " (s/n ou true/false): ");
            scanner.nextLine(); // Limpa buffer anterior
            String entrada = scanner.nextLine().toLowerCase().trim();

            if (entrada.equals("s") || entrada.equals("sim") || entrada.equals("true")) {
                valor = true;
                entradaValida = true;
            } else if (entrada.equals("n") || entrada.equals("nao") || entrada.equals("não") || entrada.equals("false")) {
                valor = false;
                entradaValida = true;
            } else {
                System.out.println("Erro: Digite 's' para sim ou 'n' para nao!");
            }
        }

        return valor;
    }

    /**
     * Pergunta ao usuário se deseja continuar (sim/não).
     */
    private static boolean perguntarContinuar(String mensagem) {
        return lerBoolean(mensagem);
    }

    /**
     * Pausa a execução até o usuário pressionar ENTER.
     */
    private static void pausar() {
        scanner.nextLine(); // Limpa buffer pendente
        System.out.println("\nPressione ENTER para continuar...");
        scanner.nextLine();
    }
}
