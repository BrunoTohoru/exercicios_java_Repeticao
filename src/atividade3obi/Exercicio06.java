/*
Crie um algoritmo que mostre todos os números inteiros múltiplos de 5 do intervalo
fechado de 1 a 200. Dica: Incremento de 5 em 5.
 */
package atividade3obi;

public class Exercicio06 {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 200) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
