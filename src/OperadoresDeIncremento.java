public class OperadoresDeIncremento {
    public static void main(String[] args) {
        int contador = 0;
        int resultado = contador++;
        System.out.println(resultado);
        contador++;

        contador = 0;
        resultado = ++contador;
        System.out.println(resultado);
        contador++;
    }
}
