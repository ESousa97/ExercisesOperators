package exercises;

/**
 * Converte um valor em dólares para reais com base em uma cotação fixa.
 * <p>
 * Utiliza variáveis {@code double} e formatação com {@code printf}
 * para exibir o resultado da conversão monetária.
 * </p>
 */
public class ConversorDolarReal {

    public static void main(String[] args) {
        double valorEmDolares = 224.5;
        double cotacaoDolar = 4.94;
        double valorFinalEmReais = valorEmDolares * cotacaoDolar;

        System.out.printf("USD %.2f convertidos fica: R$ %.2f%n",
                valorEmDolares, valorFinalEmReais);
    }
}
