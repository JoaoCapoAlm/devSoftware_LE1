package Exer;

import Helper.Prompt;

public class Exercicio03 {
    public static void Executar(){
        Prompt.imprimir("Exercício 3");
        Prompt.imprimir("Escreva um algoritmo que leia os valores de dois números inteiros distintos nas " +
                "variáveis A e B e informe qual deles é o maior.");
        Prompt.imprimir("Caso os números sejam iguais informar ao usuário que a sequência de números informados é inválida.");
        Prompt.linhaEmBranco();

        var primeiroNumero = Prompt.lerInteiro("Escreva o primeiro número inteiro:");
        var segundoNumero = Prompt.lerInteiro("Escreva o segundo número inteiro:");

        if(primeiroNumero > segundoNumero){
            Prompt.imprimir("O primeiro número (" + primeiroNumero + ") é maior que o segundo (" + segundoNumero + ").");
        } else if (primeiroNumero < segundoNumero) {
            Prompt.imprimir("O segundo número (" + segundoNumero  + ") é maior que o primeiro (" + primeiroNumero + ").");
        } else {
            Prompt.imprimir("Sequência de números inválida!");
        }
    }
}
