package Exer;

import Helper.Prompt;

public class Exercicio20 {
    public static void Executar(){
        Prompt.imprimir("Exercício 20", true);
        Prompt.imprimir("""
            Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em uma viagem,\s
            utilizando um automóvel que faz 12km por litro e considerando que são fornecidos o tempo em\s
            hora e a velocidade média da viagem.""", true);
        Prompt.linhaEmBranco();

        var tempo = Prompt.lerDecimal("Tempo da viagem (hora): ", false);
        var velocidadeMedia = Prompt.lerDecimal("Velocidade média (km/h): ", false);

        var distanciaPercorrida = velocidadeMedia * tempo;
        Prompt.imprimir(String.format("Combustível gasto: %.2f l", distanciaPercorrida / 12), true);
    }
}
