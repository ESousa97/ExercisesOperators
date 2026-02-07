package exercises;

/**
 * Demonstra os tipos de dados primitivos do Java.
 * <p>
 * Exemplifica a declaração e uso de {@code boolean}, {@code int},
 * {@code char}, {@code byte}, {@code long}, {@code float} e {@code double}.
 * </p>
 */
public class OperadoresPrimitivos {

    public static void main(String[] args) {
        // Exercício 1: Tipos variados
        boolean aprovado = true;
        int idade = 25;
        char inicial = 'J';
        byte temperatura = -5;
        long populacao = 2_147_000_000L;
        float preco = 19.99f;
        double salario = 5500.75;
        byte codigo = 127;

        System.out.println("=== Exercício 1 ===");
        System.out.println("aprovado (boolean): " + aprovado);
        System.out.println("idade (int): " + idade);
        System.out.println("inicial (char): " + inicial);
        System.out.println("temperatura (byte): " + temperatura);
        System.out.println("populacao (long): " + populacao);
        System.out.println("preco (float): " + preco);
        System.out.println("salario (double): " + salario);
        System.out.println("codigo (byte): " + codigo);

        // Exercício 2: Mais exemplos
        double resultado = 3.141592653589793;
        char letraNome = 'J';
        boolean aprovado2 = true;
        long populacao2 = 7_900_000_000L;
        float notaAluno = 9.5f;
        int idadePessoa = 24;
        char codigoASCII = 'j';

        System.out.println("\n=== Exercício 2 ===");
        System.out.println("resultado (double/PI): " + resultado);
        System.out.println("letraNome (char): " + letraNome);
        System.out.println("aprovado2 (boolean): " + aprovado2);
        System.out.println("populacao2 (long): " + populacao2);
        System.out.println("notaAluno (float): " + notaAluno);
        System.out.println("idadePessoa (int): " + idadePessoa);
        System.out.println("codigoASCII (char): " + codigoASCII + " = " + (int) codigoASCII);
    }
}
