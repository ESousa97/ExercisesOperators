// 5. Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável.
// Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o resultado formatado.

public class ConversorDolarReal {
    public static void main(String[] args) {
        double valorEmDolares = 224.5;
        double cotacaoDolar = 4.94;
        double valorFinalEmReais = valorEmDolares * cotacaoDolar;

        System.out.printf("USD %.2f convertidos fica: R$ %.2f%n",
                valorEmDolares, valorFinalEmReais);
    }
}
