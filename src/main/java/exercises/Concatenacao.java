package exercises;

/**
 * Demonstra a concatenação de variáveis {@code char} e {@code String}.
 * <p>
 * Mostra como combinar diferentes tipos em uma mensagem
 * utilizando o operador {@code +}.
 * </p>
 */
public class Concatenacao {

    public static void main(String[] args) {
        char letra = 'a';
        String texto = " Texto de uma String";

        System.out.println("Isso é uma concatenação da letra: "
                + "'" + letra + "'" + " com o" + texto);
    }
}
