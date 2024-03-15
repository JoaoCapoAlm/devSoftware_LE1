package Exer;

import Helper.Prompt;

import static Helper.Prompt.ANSI_RED;

public class Exercicio10 {
    public static void Executar() {
        Prompt.imprimir("Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso.");
        Prompt.imprimir("Caso o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número inválido!”.");
        Prompt.linhaEmBranco();

        Prompt.imprimir("Digite um valor inteiro: ", false);
        var num = Prompt.lerInteiro();

        switch (num) {
            case 1:
                Prompt.imprimir("Um");
                break;
            case 2:
                Prompt.imprimir("Dois");
                break;
            case 3:
                Prompt.imprimir("Três");
                break;
            case 4:
                Prompt.imprimir("Quatro");
                break;
            case 5:
                Prompt.imprimir("Cinco");
                break;
            default:
                Prompt.imprimir(ANSI_RED + "Número inválido!");
                break;
        }
    }
}
