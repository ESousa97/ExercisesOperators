package exercises;

import java.util.Scanner;

/**
 * Calcula a média de três notas e determina a situação do aluno.
 * <p>
 * Classificações: Aprovado (≥ 7), Recuperação (≥ 5) ou Reprovado (< 5).
 * </p>
 */
public class MediaAluno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Média: %.2f%n", media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
