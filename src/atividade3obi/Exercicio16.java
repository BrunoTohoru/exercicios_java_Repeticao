/*
Crie um programa que leia uma quantidade desconhecida de números e conte quantos deles
estão nos seguintes intervalos: [0-25], [26-50], [51-75] e [76-100]. A entrada de dados deve
terminar quando for lido um número negativo.
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num;
        int qtd = 1, qtd_1 = 0, qtd_2 = 0, qtd_3 = 0, qtd_4 = 0;
        String out = "", out_1 = "", out_2 = "", out_3 = "", out_4 = "";
        System.out.println("Insira números de 0 a 100, caso deseje parar, digite um número negativo.");
        do {
            System.out.println("Insira o " + qtd + "º número:");
            num = s.nextDouble();
            if (num >= 0 && num <= 25) {
                qtd_1++;
                out_1 += num + ", ";
            } else if (num > 25 && num <= 50) {
                qtd_2++;
                out_2 += num + ", ";
            } else if (num > 50 && num <= 75) {
                qtd_3++;
                out_3 += num + ", ";
            } else if (num > 75 && num <= 100) {
                qtd_4++;
                out_4 += num + ", ";
            } else if (num < 0) {
                System.out.println("finalizado");
            } else {
                System.out.println("Número inválido.");
                qtd--;
                out += "inválido ->";
            }
            out += num + ", ";
            qtd++;
        } while (num >= 0);
        qtd -= 2;

        if (out_1.equalsIgnoreCase("")){
            out_1 = "Nenhum valor inserido...";
        }if (out_2.equalsIgnoreCase("")){
            out_2 = "Nenhum valor inserido...";
        }if (out_3.equalsIgnoreCase("")){
            out_3 = "Nenhum valor inserido...";
        }if (out_4.equalsIgnoreCase("")){
            out_4 = "Nenhum valor inserido...";
        }
        
        System.out.println("================================================");
        System.out.println("Foram inseridos " + qtd + " números entre 0 a 100\nOs números inseridos foram:\n" + out.substring(0, out.length() - 2));
        System.out.println("------------------------------------------------");
        System.out.println(qtd_1 + " foram de 0 a 25, sendo eles:\n" + out_1.substring(0, out_1.length() - 2));
        System.out.println("------------------------------------------------");
        System.out.println(qtd_2 + " foram de 26 a 50, sendo eles:\n" + out_2.substring(0, out_2.length() - 2));
        System.out.println("------------------------------------------------");
        System.out.println(qtd_3 + " foram de 51 a 75, sendo eles:\n" + out_3.substring(0, out_3.length() - 2));
        System.out.println("------------------------------------------------");
        System.out.println(qtd_4 + " foram de 76 a 100, sendo eles:\n" + out_4.substring(0, out_4.length() - 2));
        System.out.println("================================================");
    }
}
