package Exer;

import Helper.Prompt;

public class Exercicio10 {
    public static void Executar() {
        Prompt.imprimir("Exercício 10");
        Prompt.imprimir("Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso.", true);
        Prompt.imprimir("Caso o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número inválido!”.", true);
        Prompt.linhaEmBranco();

        Prompt.imprimir("Digite um valor inteiro: ", false);
        var num = Prompt.lerInteiro();

        switch (num) {
            case 1:
                Prompt.imprimir("Um", true);
                break;
            case 2:
                Prompt.imprimir("Dois", true);
                break;
            case 3:
                Prompt.imprimir("Três", true);
                break;
            case 4:
                Prompt.imprimir("Quatro", true);
                break;
            case 5:
                Prompt.imprimir("Cinco", true);
                break;
            default:
                Prompt.imprimirErro("Número inválido!", true);
                break;
        }
    }
}
