package exer;

import Helper.Prompt;

public class Exercicio01 {
    public static void Executar(){
        Prompt.imprimir("Exercício 01");
        Prompt.imprimir("Escreva um algoritmo que leia um número digitado pelo usuário e mostre a mensagem " +
                "“Número maior do que 10!”, caso este número seja maior, ou “Número menor ou igual a 10!”, " +
                "caso este número seja menor ou igual.");

        Prompt.linhaEmBranco();
        System.out.print("Escreva um número: ");
        var numero = Prompt.lerDecimal();
        if(numero > 10){
            Prompt.imprimir("Número maior do que 10!");
        } else {
            Prompt.imprimir("Número menor ou igual a 10!");
        }
    }
}
