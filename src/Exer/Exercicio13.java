package Exer;

import Helper.Prompt;

public class Exercicio13 {
    public static void Executar(){
        Prompt.imprimir("Exercício 13", true);
        Prompt.imprimir("Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de\n" +
                "operador em outra variável do tipo CARACTERE.", true);
        Prompt.imprimir("Imprima o resultado da operação de A por B se o operador aritmético for válido;", true);
        Prompt.imprimir("caso contrário deve ser impresso uma mensagem de operador não definido.", true);
        Prompt.imprimir("Tratar erro de divisão por zero.", true);
        Prompt.linhaEmBranco();

        var a = Prompt.lerDecimal("Digite um número: ", false);
        var b = Prompt.lerDecimal("Digite o segundo número: ", false);

        Prompt.imprimir("Digite o operador: ", false);
        var operador = Prompt.lerLinha();

        Prompt.imprimir("A = " + a, true);
        Prompt.imprimir("B = " + b, true);

        switch (operador) {
            case "+" -> {
                Prompt.imprimir("Operador: + (soma)", true);
                Prompt.imprimir("A + B = " + (a + b), true);
            }
            case "-" -> {
                Prompt.imprimir("Operador: - (subtração)", true);
                Prompt.imprimir("A - B = " + (a - b), true);
            }
            case "*" -> {
                Prompt.imprimir("Operador: * (multiplicação)", true);
                Prompt.imprimir("A * B = " + (a * b), true);
            }
            case "/" -> {
                Prompt.imprimir("Operador: / (divisão)", true);
                if(b == 0){
                    Prompt.imprimirErro("Operação inválida, valor do divisor é igual a 0 (zero)", true);
                } else{
                    Prompt.imprimir("A / B = " + (a / b), true);
                }
            }
            default -> Prompt.imprimirErro("Operador inválido!", true);
        }
    }
}
