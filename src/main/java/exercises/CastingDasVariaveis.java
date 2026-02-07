package exercises;

/**
 * Demonstra o casting (conversão explícita) de tipos em Java.
 * <p>
 * Converte um valor {@code double} para {@code int}, mostrando
 * a perda da parte decimal no processo.
 * </p>
 */
public class CastingDasVariaveis {

    public static void main(String[] args) {
        double idade1 = 8.2;
        int idade2 = 11;

        int idade3 = (int) idade1;
        System.out.println("Valor double original: " + idade1);
        System.out.println("Após casting para int: " + idade3);
        System.out.println("Variável int existente: " + idade2);
    }
}
