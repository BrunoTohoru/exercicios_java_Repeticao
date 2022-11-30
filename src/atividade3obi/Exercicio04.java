/*
Crie um programa para receber 5 números inteiros. Para cada número informado mostre
se ele é positivo, negativo ou zero.
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, i;
        String out = "", outp = "", outn = "";

        for (i = 0; i < 5; i++) {
            System.out.println("Insira o " + (i + 1) + "º número:");
            num = s.nextInt();
            out += num + ", ";
            if (num > 0) {
                System.out.println(num + " é positivo.");
                outp += num + ", ";
            } else if (num < 0) {
                System.out.println(num + " é negativo.");
                outn += num + ", ";
            } else {
                System.out.println("Zero");
            }
        }
        System.out.println("Os números inseridos foram: \n" + out.substring(0, out.length() - 2));
        if (outp.length() > 2) {
            System.out.println("Os números positivos foram: \n" + outp.substring(0, outp.length() - 2));
        }
        if (outn.length() > 2) {
            System.out.println("Os números negativos foram: \n" + outn.substring(0, outn.length() - 2));
        }
    }
}
