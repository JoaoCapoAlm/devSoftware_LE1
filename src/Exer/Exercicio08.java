package Exer;

import Helper.Prompt;

public class Exercicio08 {
    public static void Executar(){
        Prompt.imprimir("Exercício 8", true);
        Prompt.imprimir("Escreva um algoritmo que leia um número e mostre uma mensagem caso este\n" +
                "número seja maior ou igual a 50, outra se ele for menor que 50.", true);
        Prompt.linhaEmBranco();

        var num = Prompt.lerDecimal("Escreva um número: ", false);

        Prompt.imprimir("O número " + num + " é " + (num >= 50 ? "maior" : "menor"  ) + " que 50.", true);
    }
}
