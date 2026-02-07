package exercises;

/**
 * Converte uma temperatura de Celsius para Fahrenheit.
 * <p>
 * Aplica a fórmula {@code F = C × 1.8 + 32} e demonstra
 * casting do resultado para {@code int}.
 * </p>
 */
public class ConversorTemperatura {

    public static void main(String[] args) {
        double temperaturaCelsius = 39.7;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.printf("A temperatura de %.2f°C é exatamente: %.2f°F%n",
                temperaturaCelsius, temperaturaFahrenheit);

        int temperaturaInteira = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + temperaturaInteira);
    }
}
