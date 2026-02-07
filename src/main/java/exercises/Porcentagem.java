package exercises;

/**
 * Calcula desconto percentual sobre o preço de um produto.
 * <p>
 * Demonstra cálculos com porcentagem utilizando
 * variáveis {@code double} e operadores aritméticos.
 * </p>
 */
public class Porcentagem {

    public static void main(String[] args) {
        double precoOriginal = 5812.97;
        double percentualDesconto = 10.0;

        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoFinal = precoOriginal - valorDesconto;

        System.out.printf("Preço original: R$ %.2f%n", precoOriginal);
        System.out.printf("Desconto de %.1f%%: R$ %.2f%n", percentualDesconto, valorDesconto);
        System.out.printf("Preço final com desconto: R$ %.2f%n", precoFinal);
    }
}
