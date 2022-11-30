/*
Foi realizada uma pesquisa no Paraná e coletados os dados de altura e sexo (0=masculino,
1=feminino) das pessoas entrevistadas. Faça um programa que leia N dados de habitantes (até
que seja informado um número negativo para a altura) e mostre no final: a) a maior e a menor
altura encontrada; b) a média de altura das mulheres; c) a média de altura da população; d) o
percentual de homens na população.
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double altura, soma_tot = 0, soma_fem = 0, media_tot, media_fem, maior_al = 0, menor_al = 999999999, perc_mas;
        int sexo = 0, cont = 0, cont_mas = 0, cont_fem = 0, ident;
        boolean val_sexo = false;
        do {
            do {
                System.out.println("Deseja alimentar o banco de dados?\n0- Sim\n1- Não");
                ident = s.nextInt();
                if (ident == 0) {
                    System.out.println("Insira os dados do " + (cont + 1) + "º habitante:");
                    do {
                        System.out.println("Informe o sexo:\n0- Masculino\n1- Feminino");
                        sexo = s.nextInt();
                        if (sexo == 0) {
                            cont_mas++;
                            val_sexo = true;
                        } else if (sexo == 1) {
                            cont_fem++;
                            val_sexo = true;
                        } else {
                            System.out.println("Sexo inválido.");
                        }
                    } while (val_sexo = false);
                } else if (ident == 1) {
                    System.out.println("Insira uma altura negativa para sair.");
                } else {
                    System.out.println("Informe com 0 ou 1 para continuar.");
                }
            } while (ident != 0 && ident != 1);

            System.out.println("Informe a altura:");
            altura = s.nextDouble();

            if (altura > maior_al) {
                maior_al = altura;
            }
            if (altura < menor_al && altura > 0) {
                menor_al = altura;
            }
            if (sexo == 1) {
                soma_fem += altura;
            }
            soma_tot += altura;
            cont++;
        } while (altura >= 0);
        cont--;

        media_tot = soma_tot / cont;
        media_fem = soma_fem / cont_fem;
        perc_mas = 100 * cont_mas / cont;
        System.out.println("=============================================");
        System.out.println("A maior altura foi: " + maior_al);
        System.out.println("A menor altura foi: " + menor_al);
        System.out.println("---------------------------------------------");
        System.out.println("A média de altura das mulheres foi: " + media_fem);
        System.out.println("---------------------------------------------");
        System.out.println("A média de altura da população foi: " + media_tot);
        System.out.println("---------------------------------------------");
        System.out.println("O percentual de homens na população foi: " + perc_mas);
        System.out.println("=============================================");
    }
}
