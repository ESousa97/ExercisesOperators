public class ConversorTemperatura {
    public static void main(String[] args) {
        double temperatura1 = 39.7;
        double temperatura2 = (temperatura1 * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é exatamente: %f Fahrenheit", temperatura1, temperatura2);

        System.out.println(mensagem);

        int temperatura2Inteira = (int) temperatura2;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperatura2Inteira);

    }
}
