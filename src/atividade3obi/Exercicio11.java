/*
Crie um algoritmo que leia um número inteiro e mostre na tela de 1 até o número
informado. Por exemplo:
Se o número informado for 4, mostre na tela: 1 2 3 4
Se o número informado for 7, mostre na tela: 1 2 3 4 5 6 7
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1, num;
        String out = "";

        System.out.println("Insira um número inteiro e positivo:");
        num = s.nextInt();

        while (i != num) {
            out += i + " ";
            i++;
        }
        System.out.println(out + i);
    }
}
