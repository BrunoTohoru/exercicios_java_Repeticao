/*
Uma rainha requisitou os serviços do empresário João, que exigiu o pagamento em grãos
de trigo da seguinte maneira: os grãos de trigo estariam dispostos em um tabuleiro de xadrez (8
linhas e 8 colunas), de tal forma que a primeira casa do tabuleiro tivesse um grão, e as casas
seguintes o dobro da anterior. Construa um algoritmo que calcule quantos grãos de trigo a Rainha
deverá pagar ao empresário João.
 */
package atividade3obi;

public class Exercicio18 {

    public static void main(String[] args) {
        int i;
        double graos = 1, soma = 0;
        for (i = 2; i <= 64; i++) {
            graos = graos*2;
            System.out.println(i + " - " + graos);
            soma += graos;
        }
        System.out.println("A rainha pagará " + soma + " grãos de trigo à João.");
    }
}
