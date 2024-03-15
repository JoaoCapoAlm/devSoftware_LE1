public class Exercicio06 {
    public static void Executar(){
        Prompt.imprimir("Exercício 06");
        Prompt.imprimir("Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.");
        Prompt.imprimir("A fórmula de conversão é: F = (9 * C + 160) / 5");
        Prompt.linhaEmBranco();

        Prompt.imprimir("Insira a temperatura em graus Celsius: ", false);
        var celsius = Prompt.lerDecimal();
        var fahrenheit = (9 * celsius + 160) / 5;

        Prompt.imprimir("Celsius -> Fahrenheit");
        Prompt.imprimir(celsius + "ºC -> " + fahrenheit + "ºF");
    }
}
