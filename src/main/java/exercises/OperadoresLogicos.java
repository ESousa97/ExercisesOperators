package exercises;

/**
 * Demonstra o uso dos operadores lógicos AND, OR e NOT.
 * <p>
 * Simula decisões baseadas em múltiplas condições booleanas
 * combinadas com {@code &&}, {@code ||} e {@code !}.
 * </p>
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean temDinheiro = true;
        boolean fazSol = false;
        boolean carroDisponivel = true;

        boolean podeSair = temDinheiro && fazSol;
        boolean irParaShopping = temDinheiro || carroDisponivel;
        boolean ficarEmCasa = !fazSol && !carroDisponivel;

        System.out.println("Pode sair (dinheiro E sol): " + podeSair);
        System.out.println("Ir para o shopping (dinheiro OU carro): " + irParaShopping);
        System.out.println("Ficar em casa (NÃO sol E NÃO carro): " + ficarEmCasa);
    }
}
