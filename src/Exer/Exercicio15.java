package Exer;

import Helper.Prompt;

import java.text.DecimalFormat;

public class Exercicio15 {
    public static void Executar(){
        Prompt.imprimir("Exercício 15", true);
        Prompt.imprimir("Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2, y2), calcule e retorne a distância entre eles.", true);
        Prompt.imprimir("A fórmula que efetua tal cálculo é: d = raiz(((x2 - x1) ^2) + ((y2 - y1) ^2))", true);
        Prompt.imprimir("Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03", true);
        Prompt.linhaEmBranco();

        Prompt.imprimir("Digite a posição dos pontos", true);
        var x1 = Prompt.lerInteiro("x1 = ", false);
        var y1 = Prompt.lerInteiro("y1 = ", false);
        var x2 = Prompt.lerInteiro("x2 = ", false);
        var y2 = Prompt.lerInteiro("y2 = ", false);

        var distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        var formater = new DecimalFormat("0.##");
        Prompt.imprimir("d = " + formater.format(distancia), true);
    }
}
