package exercises;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Testes unitários para os exercícios individuais.
 * <p>
 * Como os exercícios usam {@code System.out} e {@code Scanner},
 * os testes capturam a saída padrão e simulam entrada para validar
 * o comportamento correto.
 * </p>
 */
class ExercisesTest {

    private String captureOutput(Runnable program) {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos, true, StandardCharsets.UTF_8));
        try {
            program.run();
        } finally {
            System.setOut(originalOut);
        }
        return baos.toString(StandardCharsets.UTF_8);
    }

    private String captureOutputWithInput(String input, Runnable program) {
        PrintStream originalOut = System.out;
        InputStream originalIn = System.in;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos, true, StandardCharsets.UTF_8));
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        try {
            program.run();
        } finally {
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
        return baos.toString(StandardCharsets.UTF_8);
    }

    // ==================== MediaNota ====================

    @Test
    @DisplayName("MediaNota: calcula média corretamente")
    void mediaNotaDeveCalcularMedia() {
        String output = captureOutput(() -> MediaNota.main(new String[]{}));
        assertTrue(output.contains("9.1"), "Deve conter a média 9.1");
    }

    // ==================== CastingDasVariaveis ====================

    @Test
    @DisplayName("CastingDasVariaveis: casting de double para int")
    void castingDeveConverterParaInt() {
        String output = captureOutput(() -> CastingDasVariaveis.main(new String[]{}));
        assertTrue(output.contains("8"), "Deve conter o resultado do casting (8)");
    }

    // ==================== Concatenacao ====================

    @Test
    @DisplayName("Concatenacao: concatena char e String")
    void concatenacaoDeveCombinarTipos() {
        String output = captureOutput(() -> Concatenacao.main(new String[]{}));
        assertTrue(output.contains("concatenação"), "Deve conter a palavra concatenação");
        assertTrue(output.contains("'a'"), "Deve conter a letra 'a'");
    }

    // ==================== ConversorDolarReal ====================

    @Test
    @DisplayName("ConversorDolarReal: converte dólar para real")
    void conversorDolarDeveCalcularConversao() {
        String output = captureOutput(() -> ConversorDolarReal.main(new String[]{}));
        assertTrue(output.contains("USD"), "Deve conter 'USD'");
        assertTrue(output.contains("R$"), "Deve conter 'R$'");
    }

    // ==================== ConversorTemperatura ====================

    @Test
    @DisplayName("ConversorTemperatura: converte Celsius para Fahrenheit")
    void conversorTemperaturaDeveCalcular() {
        String output = captureOutput(() -> ConversorTemperatura.main(new String[]{}));
        assertTrue(output.contains("°C"), "Deve conter graus Celsius");
        assertTrue(output.contains("°F"), "Deve conter graus Fahrenheit");
    }

    // ==================== Multiplicacao ====================

    @Test
    @DisplayName("Multiplicacao: calcula preço total")
    void multiplicacaoDeveCalcularTotal() {
        String output = captureOutput(() -> Multiplicacao.main(new String[]{}));
        assertTrue(output.contains("R$"), "Deve conter R$ no resultado");
    }

    // ==================== OperadoresDeIncremento ====================

    @Test
    @DisplayName("OperadoresDeIncremento: demonstra pré e pós incremento")
    void incrementoDeveExibirResultados() {
        String output = captureOutput(() -> OperadoresDeIncremento.main(new String[]{}));
        assertTrue(output.contains("Pós-incremento"), "Deve conter Pós-incremento");
        assertTrue(output.contains("Pré-incremento"), "Deve conter Pré-incremento");
    }

    // ==================== OperadoresLogicos ====================

    @Test
    @DisplayName("OperadoresLogicos: avalia expressões lógicas")
    void logicosDeveAvaliarExpressoes() {
        String output = captureOutput(() -> OperadoresLogicos.main(new String[]{}));
        assertTrue(output.contains("false"), "Deve conter resultado false");
        assertTrue(output.contains("true"), "Deve conter resultado true");
    }

    // ==================== OperadoresPrimitivos ====================

    @Test
    @DisplayName("OperadoresPrimitivos: declara tipos primitivos")
    void primitivosDeveExibirTipos() {
        String output = captureOutput(() -> OperadoresPrimitivos.main(new String[]{}));
        assertTrue(output.contains("boolean"), "Deve conter tipo boolean");
        assertTrue(output.contains("int"), "Deve conter tipo int");
        assertTrue(output.contains("double"), "Deve conter tipo double");
    }

    // ==================== Porcentagem ====================

    @Test
    @DisplayName("Porcentagem: calcula desconto percentual")
    void porcentagemDeveCalcularDesconto() {
        String output = captureOutput(() -> Porcentagem.main(new String[]{}));
        assertTrue(output.contains("Desconto"), "Deve conter palavra Desconto");
        assertTrue(output.contains("R$"), "Deve conter R$");
    }

    // ==================== AnaliseNumero (com input) ====================

    @Test
    @DisplayName("AnaliseNumero: número par múltiplo de 3 e 5")
    void analiseNumeroDevAnalisarPar() {
        String output = captureOutputWithInput("30\n",
                () -> AnaliseNumero.main(new String[]{}));
        assertTrue(output.contains("PAR"), "30 deve ser PAR");
        assertTrue(output.contains("múltiplo de 5 e de 3"), "30 deve ser múltiplo de 3 e 5");
        assertTrue(output.contains("não é maior que 100"), "30 não é maior que 100");
    }

    @Test
    @DisplayName("AnaliseNumero: número ímpar")
    void analiseNumeroDeveAnalisarImpar() {
        String output = captureOutputWithInput("7\n",
                () -> AnaliseNumero.main(new String[]{}));
        assertTrue(output.contains("ÍMPAR"), "7 deve ser ÍMPAR");
    }

    // ==================== ComparacaoSimples (com input) ====================

    @Test
    @DisplayName("ComparacaoSimples: números iguais")
    void comparacaoSimplesNumerosIguais() {
        String output = captureOutputWithInput("5\n5\n",
                () -> ComparacaoSimples.main(new String[]{}));
        assertTrue(output.contains("igual"), "5 e 5 devem ser iguais");
    }

    @Test
    @DisplayName("ComparacaoSimples: números diferentes")
    void comparacaoSimplesNumerosDiferentes() {
        String output = captureOutputWithInput("3\n7\n",
                () -> ComparacaoSimples.main(new String[]{}));
        assertTrue(output.contains("diferente"), "3 e 7 devem ser diferentes");
    }

    // ==================== MediaAluno (com input) ====================

    @Test
    @DisplayName("MediaAluno: aprovado com média >= 7")
    void mediaAlunoDeveAprovar() {
        String output = captureOutputWithInput("8.0\n7.0\n9.0\n",
                () -> MediaAluno.main(new String[]{}));
        assertTrue(output.contains("Aprovado"), "Média 8.0 deve aprovar");
    }

    @Test
    @DisplayName("MediaAluno: reprovado com média < 5")
    void mediaAlunoDeveReprovar() {
        String output = captureOutputWithInput("2.0\n3.0\n4.0\n",
                () -> MediaAluno.main(new String[]{}));
        assertTrue(output.contains("Reprovado"), "Média 3.0 deve reprovar");
    }

    @Test
    @DisplayName("MediaAluno: recuperação com média entre 5 e 7")
    void mediaAlunoDeveRecuperacao() {
        String output = captureOutputWithInput("5.0\n6.0\n5.0\n",
                () -> MediaAluno.main(new String[]{}));
        assertTrue(output.contains("Recuperação"), "Média ~5.33 deve ir para recuperação");
    }
}
