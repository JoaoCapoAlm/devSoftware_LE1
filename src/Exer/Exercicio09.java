package Exer;

import Helper.Prompt;

public class Exercicio09 {
    public static void Executar(){
        Prompt.imprimir("Exercício 9", true);
        Prompt.imprimir("Leia dois números nas variáveis A e B e identifique se os valores são iguais ou diferentes", true);
        Prompt.imprimir("Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.", true);
        Prompt.imprimir("Caso sejam diferentes, informe que são diferentes e qual número é o maior.", true);
        Prompt.linhaEmBranco();

        Prompt.imprimir("Digite o valor da variável A: ", false);
        var a = Prompt.lerDecimal();

        Prompt.imprimir("Digite o valor da variável B: ", false);
        var b = Prompt.lerDecimal();

        if(a > b){
            Prompt.imprimir("A variável A (" + a + ") é maior que a variável B (" + b + ").", true);
        } else if (a < b) {
            Prompt.imprimir("A variável B (" + b + ") é maior que a variável A (" + a + ").", true);
        } else {
            Prompt.imprimir("As váriaveis tem o mesmo valor (" + a + ").", true);
        }
    }
}
