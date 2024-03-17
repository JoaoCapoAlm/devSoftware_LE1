package Exer;

import Helper.Prompt;

import java.util.Arrays;

public class Exercicio11 {
    public static void Executar(){
        Prompt.imprimir("Exercício 11", true);
        Prompt.imprimir("Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em ordem crescente.", true);

        int[] arrayNum = new int[3];
        for (var i = 0; i < 3; i++){
            arrayNum[i] = Prompt.lerInteiro("Escreva um número: ");
        }

        Arrays.sort(arrayNum);

        Prompt.imprimirArray(arrayNum, true);
    }
}
