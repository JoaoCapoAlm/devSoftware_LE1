package Exer;

import Helper.Prompt;

public class Exercicio19 {
    public static void Executar() {
        Prompt.imprimir("Exercício 19", true);
        Prompt.imprimir("Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu\n" +
                "volume calculado de acordo com a seguinte fórmula:", true);
        Prompt.imprimir("volume = 3.14 * raio^2 * altura;", true);
        Prompt.imprimir("Exemplo: raio = 10, altura = 15. Volume = 4710", true);
        Prompt.linhaEmBranco();

        var raio = Prompt.lerDecimal("Raio: ", false);
        var altura = Prompt.lerDecimal("Altura: ", false);

        var volume = Math.PI * Math.pow(raio, 2) * altura;
        Prompt.imprimir(String.format("Volume: %.2f", volume), true);
    }
}
