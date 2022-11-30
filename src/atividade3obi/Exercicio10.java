/*
Crie um programa que calcule o fatorial de um número recebido do usuário. Por exemplo:
Se o número informado for 5, o fatorial será: 5*4*3*2*1 = 120
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num, soma = 1;
        String out = "";

        System.out.println("Fatorial - Insira um número:");
        num = s.nextInt();

        while (num != 0) {
            out += num + "x";
            soma = soma * num;
            num--;
        }
        System.out.println("O fatorial será: \n" + out.substring(0, out.length() - 1) + "=" + soma);
    }
}
