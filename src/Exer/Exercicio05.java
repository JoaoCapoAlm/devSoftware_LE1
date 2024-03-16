package Exer;

import Helper.Prompt;

public class Exercicio05 {
    public  static void Executar(){
        Prompt.imprimir("Exercício 05", true);
        Prompt.imprimir("Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor\n" +
                "da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o valor da variável A.", true);
        Prompt.imprimir("Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados.", true);
        Prompt.linhaEmBranco();

        Prompt.imprimir("Insira os valores", true);
        Prompt.imprimir("A: ", false);
        var a = Prompt.lerLinha();
        Prompt.imprimir("B: ", false);
        var b = Prompt.lerLinha();
        var aux = "";

        Prompt.imprimir("Valores originais:", true);
        Prompt.imprimir("A: " + a, true);
        Prompt.imprimir("B: " + b, true);

        aux = a;
        a = b;
        b = aux;

        Prompt.imprimir("Valores trocados:", true);
        Prompt.imprimir("A: " + a, true);
        Prompt.imprimir("B: " + b, true);
    }
}
