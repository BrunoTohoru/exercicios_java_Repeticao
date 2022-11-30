/*
Crie um programa que mostre os 10 primeiros números pares a partir de 5.
 */
package atividade3obi;

public class Exercicio07 {

    public static void main(String[] args) {
        int i = 0, num = 5;

        while (i < 10) {
            if (num % 2 == 0) {
                System.out.println(num);
                i++;
            }
            num++;
        }
    }
}
