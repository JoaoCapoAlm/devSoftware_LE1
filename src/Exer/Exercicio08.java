package Exer;

import Helper.Prompt;

public class Exercicio08 {
    public static void Executar(){
        Prompt.imprimir("Escreva um algoritmo que leia um número e mostre uma mensagem caso este\n" +
                "número seja maior ou igual a 50, outra se ele for menor que 50.");
        Prompt.linhaEmBranco();

        Prompt.imprimir("Escreva um número: ", false);
        var num = Prompt.lerDecimal();

        Prompt.imprimir("O número " + num + " é " + (num >= 50 ? "maior" : "menor"  ) + " que 50.");
    }
}
