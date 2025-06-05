// 6. Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
// Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
// Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.

public class Porcentagem {
    public static void main(String[] args) {
        double precoOriginal = 5812.97;
        double percentualDesconto = 10.0;

        double valorDesconto = precoOriginal * (percentualDesconto / 100);
        double precoFinal = precoOriginal - valorDesconto;

        System.out.println("Preço original: R$ " + precoOriginal);
        System.out.println("Desconto de " + percentualDesconto + "%: R$ " + valorDesconto);
        System.out.println("Preço final com desconto: R$ " + precoFinal);
    }
}

