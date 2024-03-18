package Exer;

import Helper.Prompt;

public class Exercicio04 {
    public static void Executar(){
        Prompt.imprimir("Exercício 4", true);
        Prompt.imprimir("Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.", true);
        Prompt.linhaEmBranco();

        var primeiroNumero = Prompt.lerDecimal("Escreva o primeiro número: ", false);
        var segundoNumero = Prompt.lerDecimal("Escreva o segundo número: ", false);

        Prompt.imprimir("Soma: " + (primeiroNumero + segundoNumero), true);
        Prompt.imprimir("Subtração: " + (primeiroNumero - segundoNumero), true);
        Prompt.imprimir("Multiplicação: " + (primeiroNumero * segundoNumero), true);
        Prompt.imprimir("Divisão: " + (primeiroNumero / segundoNumero), true);
    }
}
