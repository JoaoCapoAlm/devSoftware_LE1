package Exer;

import Helper.Prompt;

public class Exercicio02 {
    public static void Executar(){
        Prompt.imprimir("Exercício 2");
        Prompt.imprimir("Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o " +
                "resultado da sua soma. ");
        Prompt.linhaEmBranco();

        var num1 = Prompt.lerDecimal("Digite o primeiro valor: ", false);
        var num2 = Prompt.lerDecimal("Digite o segundo valor: ", false);

        Prompt.imprimir("Soma: " + (num1 + num2));
    }
}
