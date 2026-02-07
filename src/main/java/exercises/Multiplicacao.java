package exercises;

/**
 * Calcula o valor total de uma compra multiplicando preço pela quantidade.
 * <p>
 * Demonstra a multiplicação entre {@code double} e {@code int}
 * para cálculos comerciais simples.
 * </p>
 */
public class Multiplicacao {

    public static void main(String[] args) {
        double precoProduto = 9.5;
        int quantidadeProduto = 7;

        double precoFinal = precoProduto * quantidadeProduto;
        System.out.println("O preço total dos produtos é: R$ " + precoFinal);
    }
}
