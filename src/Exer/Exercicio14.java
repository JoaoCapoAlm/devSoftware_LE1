package Exer;

import Helper.Prompt;

public class Exercicio14 {
    public static void Executar(){
        Prompt.imprimir("Exercício 14", true);
        Prompt.imprimir("A expressão `an = a1 + (n – 1) * r` é denominada termo geral da Progressão Aritmética (PA).", true);
        Prompt.imprimir("Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo), r é a razão e a1 é o primeiro termo da Progressão Aritmética.", true);
        Prompt.imprimir("Escreva um algoritmo que encontre o n-ésimo termo de uma progressão aritmética.", true);
        Prompt.imprimir("Exemplo: a1 = 10, n = 7, r = 3. Resultado: an = 28", true);
        Prompt.linhaEmBranco();

        Prompt.imprimir("Digite os valores", true);
        var a1 = Prompt.lerInteiro("a1 = ", false);
        var n = Prompt.lerInteiro("n = ", false);
        var r = Prompt.lerInteiro("r = ", false);

        Prompt.imprimir("an = " + (a1 + (n - 1) * r), true);
    }
}
