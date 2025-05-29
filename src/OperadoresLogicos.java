public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean temDinheiro = true;
        boolean fazSol = false;
        boolean carroDisponivel = true;

        boolean podeSair = temDinheiro && fazSol;
        boolean irParaShopping = temDinheiro || carroDisponivel;
        boolean ficarEmCasa = !fazSol && !carroDisponivel;

        System.out.println("Pode sair: " + podeSair);
        System.out.println("Ir para o shooping: " + irParaShopping); 
        System.out.println("Ficar em casa: " + ficarEmCasa);
    }
}
