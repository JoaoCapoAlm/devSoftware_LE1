package Exer;

import Helper.Prompt;

import static java.lang.String.format;

public class Exercicio16 {
    public static void Executar() {
        Prompt.imprimir("Exercício 16", true);
        Prompt.imprimir("Elabore um algoritmo que receba três notas de um aluno e retorne a sua média aritmética", true);
        Prompt.imprimir("Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83", true);
        Prompt.linhaEmBranco();

        Prompt.imprimir("Insira os valores das notas", true);
        Prompt.imprimir("Nota 1: ", false);
        var nota1 = Prompt.lerDecimal();

        Prompt.imprimir("Nota 2: ", false);
        var nota2 = Prompt.lerDecimal();

        Prompt.imprimir("Nota 3: ", false);
        var nota3 = Prompt.lerDecimal();

        Prompt.imprimir("Média: " + format("%.2f", (nota1 + nota2 + nota3)/3), true);
    }
}
