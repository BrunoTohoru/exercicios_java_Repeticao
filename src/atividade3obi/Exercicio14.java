/*
Crie um programa que receba salário de funcionários de uma empresa. O programa deve
parar de receber informações quando for informado -1. Ao final, mostre:
a. O total gasto com salário com todos os funcionários;
b. A média salarial dos funcionários da empresa;
c. O maior e o menor salário.
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double salario, soma = 0, sal_menor = 999999999, sal_maior = 0;
        int cont = 1, i;

        do {
            System.out.println("Informe o " + cont + "º salário:");
            salario = s.nextDouble();
            cont++;

            if (salario > sal_maior) {
                sal_maior = salario;
            }
            if (salario < sal_menor) {
                sal_menor = salario;
            }
            soma += salario;
            System.out.println("Deseja continuar? \n(1) continuar\n(-1) parar");
            i = s.nextInt();
        } while (i != -1);
        System.out.println("O gasto total com salário é: " + soma);
        System.out.println("O menor salário é: " + sal_menor);
        System.out.println("O maior salário é: " + sal_maior);
    }
}
