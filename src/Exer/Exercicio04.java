package Exer;

import Helper.Prompt;

public class Exercicio04 {
    public static void Executar(){
        Prompt.imprimir("Exercício 4");
        Prompt.imprimir("Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.");
        Prompt.linhaEmBranco();

        Prompt.imprimir("Escreva o primeiro número: ", false);
        var primeiroNumero = Prompt.lerDecimal();
        Prompt.imprimir("Escreva o segundo número: ", false);
        var segundoNumero = Prompt.lerDecimal();

        Prompt.imprimir("Soma: " + (primeiroNumero + segundoNumero));
        Prompt.imprimir("Subtração: " + (primeiroNumero - segundoNumero));
        Prompt.imprimir("Multiplicação: " + (primeiroNumero * segundoNumero));
        Prompt.imprimir("Divisão: " + (primeiroNumero / segundoNumero), false);
    }
}
