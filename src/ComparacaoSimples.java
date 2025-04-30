import java.util.Scanner;

public class ComparacaoSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        if (num1 == num2) {
            System.out.println("O número " + num1 + " é igual ao número" + num2);
        } else {
            System.out.println("O número " + num1 + " é diferente do número " + num2);
        }

        scanner.close();
    }
}
