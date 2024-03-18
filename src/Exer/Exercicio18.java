package Exer;

import Helper.Prompt;

public class Exercicio18 {
    public static void Executar(){
        Prompt.imprimir("Exercício 18", true);
        Prompt.imprimir("Elabore um algoritmo que receba três notas de um aluno e retorne a sua média harmônica.", true);
        Prompt.imprimir("Média harmônica = 3/((1/nota1) + (1/nota2) + (1/nota3))", true);
        Prompt.imprimir("Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8", true);
        Prompt.imprimir("Média: 7.37", true);
        Prompt.linhaEmBranco();

        Prompt.imprimir("Insira o valor das notas abaixo");
        var nota1 = Prompt.lerDecimal("Nota 1: ", false);
        var nota2 = Prompt.lerDecimal("Nota 2: ", false);
        var nota3 = Prompt.lerDecimal("Nota 3: ", false);

        var media = 3/((1/nota1) + (1/nota2) + (1/nota3));

        Prompt.imprimir(String.format("Média harmónica: %.2f", media), true);
    }
}
