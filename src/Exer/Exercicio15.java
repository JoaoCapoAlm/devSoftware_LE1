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
        Prompt.imprimir("x1 = ", false);
        var x1 = Prompt.lerInteiro();
        Prompt.imprimir("y1 = ", false);
        var y1 = Prompt.lerInteiro();
        Prompt.imprimir("x2 = ", false);
        var x2 = Prompt.lerInteiro();
        Prompt.imprimir("y2 = ", false);
        var y2 = Prompt.lerInteiro();

        var distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        var f = new DecimalFormat("0.##");
        Prompt.imprimir("d = " + f.format(distancia), true);
    }
}
