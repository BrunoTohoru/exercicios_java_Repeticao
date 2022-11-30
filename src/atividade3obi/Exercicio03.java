/*
Crie um programa que mostre os números ímpares de 0 a 50.
 */
package atividade3obi;

public class Exercicio03 {

    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
