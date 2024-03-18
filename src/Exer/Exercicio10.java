package Exer;

import Helper.Prompt;

public class Exercicio10 {
    public static void Executar() {
        Prompt.imprimir("Exercício 10", true);
        Prompt.imprimir("Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso.", true);
        Prompt.imprimir("Caso o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número inválido!”.", true);
        Prompt.linhaEmBranco();

        var num = Prompt.lerInteiro("Digite um valor inteiro: ", false);

        switch (num) {
            case 1 -> Prompt.imprimir("Um", true);
            case 2 -> Prompt.imprimir("Dois", true);
            case 3 -> Prompt.imprimir("Três", true);
            case 4 -> Prompt.imprimir("Quatro", true);
            case 5 -> Prompt.imprimir("Cinco", true);
            default -> Prompt.imprimirErro("Número inválido!", true);
        }
    }
}
