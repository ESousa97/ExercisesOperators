package exercises;

/**
 * Demonstra a diferença entre pré-incremento e pós-incremento.
 * <p>
 * Mostra como {@code ++variavel} (pré) e {@code variavel++} (pós)
 * afetam o valor retornado em expressões.
 * </p>
 */
public class OperadoresDeIncremento {

    public static void main(String[] args) {
        System.out.println("=== Pós-incremento (contador++) ===");
        int contador = 0;
        int resultado = contador++;
        System.out.println("Resultado (valor antes): " + resultado);
        System.out.println("Contador (após incremento): " + contador);

        System.out.println("\n=== Pré-incremento (++contador) ===");
        contador = 0;
        resultado = ++contador;
        System.out.println("Resultado (valor depois): " + resultado);
        System.out.println("Contador (após incremento): " + contador);
    }
}
