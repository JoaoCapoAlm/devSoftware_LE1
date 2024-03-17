import Exer.*;
import Helper.Prompt;

public class Main {
    public static void main(String[] args) {
        MostrarMenu();

        var executar = true;
        while (executar) {
            Prompt.imprimir("Escolha uma opçao: ", false);
            var opcao = Prompt.lerInteiro();

            switch (opcao) {
                case 1:
                    Exercicio01.Executar();
                    break;
                case 2:
                    Exercicio02.Executar();
                    break;
                case 3:
                    Exercicio03.Executar();
                    break;
                case 4:
                    Exercicio04.Executar();
                    break;
                case 5:
                    Exercicio05.Executar();
                    break;
                case 6:
                    Exercicio06.Executar();
                    break;
                case 7:
                    Exercicio07.Executar();
                    break;
                case 8:
                    Exercicio08.Executar();
                    break;
                case 9:
                    Exercicio09.Executar();
                    break;
                case 10:
                    Exercicio10.Executar();
                    break;
                case 11:
                    Exercicio11.Executar();
                    break;
                case 12:
                    Exercicio12.Executar();
                    break;
                case 13:
                    Exercicio13.Executar();
                    break;
                case 14:
                    Exercicio14.Executar();
                    break;
                case 15:
                    Exercicio15.Executar();
                    break;
                default:
                    Prompt.imprimirErro("Opção inválida!", true);
                    break;
            }

            Prompt.separador();
            Prompt.linhaEmBranco();

            var voltarMenu = true;
            while (voltarMenu) {
                var optVoltarMenu = Prompt.lerLinha("Deseja voltar ao menu? (S)im ou (N)ão?");
                if (optVoltarMenu.equalsIgnoreCase("S")) {
                    voltarMenu = false;
                    MostrarMenu();
                } else if (optVoltarMenu.equalsIgnoreCase("N")) {
                    executar = false;
                    voltarMenu = false;
                } else {
                    Prompt.imprimirErro("Opção inválida!", true);
                }
            }
        }

        Prompt.pressionarEnter();
    }

    public static void MostrarMenu() {
        Prompt.separador();
        Prompt.imprimir("Menu", true);
        Prompt.imprimir("1 - Exercício 01 - Número maior ou menor/igual a 10", true);
        Prompt.imprimir("2 - Exercício 02 - Soma de dois números", true);
        Prompt.imprimir("3 - Exercício 03 - Sequência de números", true);
        Prompt.imprimir("4 - Exercício 04 - Calculo", true);
        Prompt.imprimir("5 - Exercício 05 - Troca de valores", true);
        Prompt.imprimir("6 - Exercício 06 - Conversão de temperatura", true);
        Prompt.imprimir("7 - Exercício 07 - Número no intervalo de 100 a 200", true);
        Prompt.imprimir("8 - Exercício 08 - Maior/menor/igual que 50", true);
        Prompt.imprimir("9 - Exercício 09 - Maior/menor/igual entre si", true);
        Prompt.imprimir("10 - Exercício 10 - Número por extenso", true);
        Prompt.imprimir("11 - Exercício 11 - Ordenação de números", true);
        Prompt.imprimir("12 - Exercício 12 - Conversão número mês para texto", true);
        Prompt.imprimir("13 - Exercício 13 - Calculadora simples", true);
        Prompt.imprimir("14 - Exercício 14 - Progressão Aritmética (PA)", true);
        Prompt.imprimir("15 - Exercício 15 - Distância entre dois pontos", true);
        Prompt.separador();
        Prompt.linhaEmBranco();
    }
}