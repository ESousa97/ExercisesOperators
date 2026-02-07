package exercises;

/**
 * Calcula a média aritmética de duas notas decimais.
 * <p>
 * Demonstra o uso de variáveis {@code double} e o operador
 * de divisão para cálculos com números de ponto flutuante.
 * </p>
 */
public class MediaNota {

    public static void main(String[] args) {
        double nota1 = 9.7;
        double nota2 = 8.5;

        double media = (nota1 + nota2) / 2;

        System.out.println("A média das duas notas é: " + media);
    }
}
