package exer;

import Helper.Prompt;

public class Exercicio02 {
    public static void Executar(){
        Prompt.imprimir("Exercício 2");
        Prompt.imprimir("Escreva um algoritmo que leia dois números digitados pelo usuário e exiba o " +
                "resultado da sua soma. ");
        Prompt.linhaEmBranco();

        System.out.print("Digite o primeiro valor: ");
        var num1 = Prompt.lerDecimal();

        System.out.print("Digite o segundo valor: ");
        var num2 = Prompt.lerDecimal();

        Prompt.imprimir("Soma: " + (num1 + num2));
    }
}
