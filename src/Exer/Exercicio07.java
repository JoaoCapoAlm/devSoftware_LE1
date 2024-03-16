package Exer;

import Helper.Prompt;

public class Exercicio07 {
    public static void Executar(){
        Prompt.imprimir("Exercício 7", true);
        Prompt.imprimir("Escreva um algoritmo que leia um número e diga, através de uma mensagem, se\n" +
                "este número está no intervalo entre 100 e 200.", true);
        Prompt.imprimir("Caso o número esteja fora do intervalo o usuário também deverá ser informado.", true);
        Prompt.linhaEmBranco();

        Prompt.imprimir("Digite um número: ", false);
        var num = Prompt.lerDecimal();

        if(num >= 100 && num <= 200){
            Prompt.imprimir("O número " + num + " está no intervalo de 100 à 200.", true);
        } else {
            Prompt.imprimir("O número " + num + " não está no intervalo de 100 à 200.", true);
        }
    }
}
