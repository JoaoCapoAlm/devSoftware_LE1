public class Main {
    public static void main(String[] args) {
        MostrarMenu();

        var executar = true;
        while (executar) {
            executar = false;

            var opcao = Prompt.lerInteiro("Escolha uma opçao:");

            switch (opcao) {
                case 1:
                    Exercicio01.Executar();

                    break;
                case 2:
                    Exercicio02.Executar();
                    break;
                default:
                    Prompt.imprimir("Opção inválida!");
                    Prompt.imprimir("Escolha uma opção válida.");

                    executar = true;
                    break;
            }

            Prompt.linhaEmBranco();
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
        Prompt.imprimir("2 - Exercício 02");
        Prompt.separador();
        Prompt.linhaEmBranco();
    }

}