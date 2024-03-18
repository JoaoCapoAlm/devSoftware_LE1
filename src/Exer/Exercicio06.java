package Exer;

import Helper.Prompt;

public class Exercicio06 {
    public static void Executar(){
        Prompt.imprimir("Exercício 06", true);
        Prompt.imprimir("Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.", true);
        Prompt.imprimir("A fórmula de conversão é: F = (9 * C + 160) / 5", true);
        Prompt.linhaEmBranco();

        var celsius = Prompt.lerDecimal("Insira a temperatura em graus Celsius: ", false);
        var fahrenheit = (9 * celsius + 160) / 5;

        Prompt.imprimir("Celsius -> Fahrenheit", true);
        Prompt.imprimir(celsius + "ºC -> " + fahrenheit + "ºF", true);
    }
}
