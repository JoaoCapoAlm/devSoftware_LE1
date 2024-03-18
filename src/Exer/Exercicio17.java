package Exer;

import Helper.Prompt;

public class Exercicio17 {
    public static void Executar(){
        Prompt.imprimir("Exercício 17", true);
        Prompt.imprimir("Elabore um algoritmo que receba três notas de um aluno, os pesos referentes a\n" +
                "cada nota e retorne a sua média ponderada.", true);
        Prompt.imprimir("Veja o cálculo da média ponderada:", true);
        Prompt.imprimir("mp = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3)", true);
        Prompt.imprimir("Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2", true);
        Prompt.imprimir("Média ponderada = 8.25");
        Prompt.linhaEmBranco();

        Prompt.imprimir("Insira os valores a baixo", true);
        var nota1 = Prompt.lerDecimal("Nota 1: ", false);
        var peso1 = Prompt.lerDecimal("Peso da nota 1: ", false);
        var nota2 = Prompt.lerDecimal("Nota 2: ", false);
        var peso2 = Prompt.lerDecimal("Peso da nota 2: ", false);
        var nota3 = Prompt.lerDecimal("Nota 3: ", false);
        var peso3 = Prompt.lerDecimal("Peso da nota 3: ", false);

        var media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        Prompt.imprimir("Média ponderada: " + String.format("%.2f", media), true);
    }
}
