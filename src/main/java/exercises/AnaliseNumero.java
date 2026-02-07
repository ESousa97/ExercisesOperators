package exercises;

import java.util.Scanner;

/**
 * Analisa propriedades de um número inteiro informado pelo usuário.
 * <p>
 * Verifica paridade (par/ímpar), se é múltiplo de 3 e 5,
 * e se é maior que 100.
 * </p>
 */
public class AnaliseNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println(numero + " é múltiplo de 5 e de 3");
        } else {
            System.out.println(numero + " não é múltiplo de 5 e 3 simultaneamente.");
        }

        if (numero > 100) {
            System.out.println(numero + " é maior que 100.");
        } else {
            System.out.println(numero + " não é maior que 100.");
        }

        scanner.close();
    }
}
