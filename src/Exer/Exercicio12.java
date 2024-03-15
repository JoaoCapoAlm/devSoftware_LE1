package Exer;

import Helper.Prompt;

public class Exercicio12 {
    public static void Executar(){
        Prompt.imprimir("Exercício 12", true);
        Prompt.imprimir("Escreva um algoritmo que receba o número do mês e mostre o mês correspondente.", true);
        Prompt.imprimir("Valide mês inválido.", true);
        Prompt.linhaEmBranco();

        Prompt.imprimir("Digite o número do mês: ", false);
        var numMes = Prompt.lerInteiro();

        switch (numMes){
            case 1:
                Prompt.imprimir("Janeiro", true);
                break;
            case 2:
                Prompt.imprimir("Fevereiro", true);
                break;
            case 3:
                Prompt.imprimir("Março", true);
                break;
            case 4:
                Prompt.imprimir("Abril", true);
                break;
            case 5:
                Prompt.imprimir("Maio", true);
                break;
            case 6:
                Prompt.imprimir("Junho", true);
                break;
            case 7:
                Prompt.imprimir("Julho", true);
                break;
            case 8:
                Prompt.imprimir("Agosto", true);
                break;
            case 9:
                Prompt.imprimir("Setembro", true);
                break;
            case 10:
                Prompt.imprimir("Outubro", true);
                break;
            case 11:
                Prompt.imprimir("Novembro", true);
                break;
            case 12:
                Prompt.imprimir("Dezembro", true);
                break;
            default:
                Prompt.imprimir(Prompt.ANSI_RED + "Valor inválido!", true);
                break;
        }
    }
}
