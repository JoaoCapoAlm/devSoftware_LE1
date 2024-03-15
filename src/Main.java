import Helper.Prompt;
import Exer.*;

public class Main {
    public static void main(String[] args) {
        MostrarMenu();

        var executar = true;
        while (executar) {
            executar = false;

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
                default:
                    Prompt.imprimir("Opção inválida!");

                    executar = true;
                    break;
            }

            Prompt.separador();
            Prompt.linhaEmBranco();

            var voltarMenu = true;
            while (voltarMenu) {
                var optVoltarMenu = Prompt.lerLinha("Deseja voltar ao menu? (S)im ou (N)ão?");
                if (optVoltarMenu.equalsIgnoreCase("S")) {
                    executar = true;
                    voltarMenu = false;
                    MostrarMenu();
                } else if (optVoltarMenu.equalsIgnoreCase("N")) {
                    executar = false;
                    voltarMenu = false;
                } else {
                    Prompt.imprimir("Opção inválida!");
                }
            }

        }

        Prompt.pressionarEnter();
    }

    public static void MostrarMenu() {
        Prompt.separador();
        Prompt.imprimir("Menu");
        Prompt.imprimir("1 - Exercício 01 - Número maior ou menor/igual a 10");
        Prompt.imprimir("2 - Exercício 02 - Soma de dois números");
        Prompt.imprimir("3 - Exercício 03 - Sequência de números");
        Prompt.imprimir("4 - Exercício 04 - Calculo");
        Prompt.imprimir("5 - Exercício 05 - Troca de valores");
        Prompt.imprimir("6 - Exercício 06 - Conversão de temperatura");
        Prompt.imprimir("7 - Exercício 07 - Número no intervalo de 100 a 200");
        Prompt.imprimir("8 - Exercício 08 - Maior/menor/igual que 50");
        Prompt.imprimir("9 - Exercício 09 - Maior/menor/igual entre si");
        Prompt.separador();
        Prompt.linhaEmBranco();
    }

}