/*
Crie um programa que receba 5 números do usuário e mostre o dobro de cada número.
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num;
        String out1 = "", out2 = "";
        for (int i = 1; i <= 5; i++) {
            System.out.println("Insira o " + i + "º número:");
            num = s.nextDouble();
            out1 += num + ", ";
            num = num * 2;
            out2 += num + ", ";
        }
        System.out.println("Os números inseridos foram: \n" + out1.substring(0, out1.length() - 2));
        System.out.println("O dobro deles será: \n" + out2.substring(0, out2.length() - 2));
    }
}
