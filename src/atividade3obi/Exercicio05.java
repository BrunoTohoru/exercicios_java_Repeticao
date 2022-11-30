/*
Crie um programa que receba 4 notas de um aluno e, ao final, mostre qual foi a média
obtida e se o aluno está aprovado ou reprovado. Considere a média 7.
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nota, media, soma = 0;
        int i;

        for (i = 1; i < 5; i++) {
            System.out.println("Insira a " + i + "ª nota:");
            nota = s.nextDouble();
            soma += nota;
        }

        media = soma / (i - 1);
        System.out.println("A média do aluno foi: " + media);
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
