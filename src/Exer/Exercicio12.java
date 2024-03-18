package Exer;

import Helper.Prompt;

public class Exercicio12 {
    public static void Executar(){
        Prompt.imprimir("Exercício 12", true);
        Prompt.imprimir("Escreva um algoritmo que receba o número do mês e mostre o mês correspondente.", true);
        Prompt.imprimir("Valide mês inválido.", true);
        Prompt.linhaEmBranco();

        switch (Prompt.lerInteiro("Digite o número do mês: ", false)){
            case 1 -> Prompt.imprimir("Janeiro", true);
            case 2 -> Prompt.imprimir("Fevereiro", true);
            case 3 -> Prompt.imprimir("Março", true);
            case 4 -> Prompt.imprimir("Abril", true);
            case 5 -> Prompt.imprimir("Maio", true);
            case 6 -> Prompt.imprimir("Junho", true);
            case 7 -> Prompt.imprimir("Julho", true);
            case 8 -> Prompt.imprimir("Agosto", true);
            case 9 -> Prompt.imprimir("Setembro", true);
            case 10 -> Prompt.imprimir("Outubro", true);
            case 11 -> Prompt.imprimir("Novembro", true);
            case 12 -> Prompt.imprimir("Dezembro", true);
            default -> Prompt.imprimirErro("Valor inválido!", true);
        }
    }
}
