public class Exercicio05 {
    public  static void Executar(){
        Prompt.imprimir("Exercício 05");
        Prompt.imprimir("Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o valor\n" +
                "da variável A passe a ser o valor da variável B e o valor da variável B passe a ser o valor da variável A.");
        Prompt.imprimir("Apresentar uma mensagem com o valor original de cada variável e outra com os valores trocados.");
        Prompt.linhaEmBranco();

        Prompt.imprimir("Insira os valores");
        Prompt.imprimir("A: ", false);
        var a = Prompt.lerLinha();
        Prompt.imprimir("B: ", false);
        var b = Prompt.lerLinha();
        var aux = "";

        Prompt.imprimir("Valores originais:");
        Prompt.imprimir("A: " + a);
        Prompt.imprimir("B: " + b);

        aux = a;
        a = b;
        b = aux;

        Prompt.imprimir("Valores trocados:");
        Prompt.imprimir("A: " + a);
        Prompt.imprimir("B: " + b);
    }
}
