// 4. Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total
// multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.

public class Multiplicacao {
    public static void main(String[] args) {
        double precoProduto = 9.5;
        int quantidadeProduto = 7;

        double precoFinal = precoProduto * quantidadeProduto;
        System.out.println("O preço total dos produtos é: " + precoFinal);
    }
}
