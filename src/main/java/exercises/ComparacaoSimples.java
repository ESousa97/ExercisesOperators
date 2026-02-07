package exercises;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Compara dois números inteiros informados pelo usuário.
 * <p>
 * Verifica se os números são iguais ou diferentes utilizando
 * operadores relacionais.
 * </p>
 */
public class ComparacaoSimples {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("O número " + num1 + " é igual ao número " + num2);
        } else {
            System.out.println("O número " + num1 + " é diferente do número " + num2);
        }

        scanner.close();
    }
}
