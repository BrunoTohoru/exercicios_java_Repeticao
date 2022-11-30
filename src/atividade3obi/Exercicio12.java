/*
Crie um programa que fique lendo números e mostrando o dobro até que o usuário
informe -1.
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num;
        int i = 0;

        do {
            System.out.println("Insira um número: ");
            num = s.nextDouble();
            System.out.println("O dobro do número é " + (num * 2));
            System.out.println("Deseja continuar? \n1 - continuar\n-1 - parar");
            i = s.nextInt();
        } while (i != -1);
        System.out.println("O programa finalizou.");
    }
}
