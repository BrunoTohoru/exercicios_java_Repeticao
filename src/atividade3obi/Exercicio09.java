/*
Crie um programa que receba 10 números Double e, ao final, mostre a soma dos números.
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num, soma = 0;
        int i = 1;
        String out = "";

        while (i <= 10) {
            System.out.println("Insira o " + i + "º número: ");
            num = s.nextDouble();
            soma += num;
            out += num + ", ";
            i++;
        }
        System.out.println("Os número inseridos foram: \n" + out.substring(0, out.length() - 2));
        System.out.println("A soma deles é: " + soma);
    }
}
