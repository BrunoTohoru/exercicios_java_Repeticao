/*
Crie um programa que fique lendo números até que o usuário digite 0 (condição de parada).
Mostre:
a) a média aritmética dos valores recebidos (com exceção do 0)
b) quantos números foram digitados (com exceção do 0)
c) a quantidade de valores positivos e negativos
d) o percentual de valores positivos e negativos
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double num, soma = 0, media, perc_pos, perc_neg, qtd_pos = 0, qtd_neg = 0;
        int qtd = 1;
        String out = "", out_neg = "", out_pos = "";
        System.out.println("Soma de números, caso deseje parar, digite 0.");
        do {
            System.out.println("Insira o " + qtd + "º número:");
            num = s.nextDouble();
            soma += num;
            out += num + ", ";
            if (num > 0) {
                qtd_pos++;
                out_pos += num + ", ";
            } else if (num < 0) {
                qtd_neg++;
                out_neg += num + ", ";
            }
            qtd++;
        } while (num != 0);
        qtd -= 2;
        media = soma / qtd;
        perc_pos = (qtd_pos / qtd) * 100;
        perc_neg = (qtd_neg / qtd) * 100;
        System.out.println("================================================");
        System.out.println("Foram inseridos " + qtd + " números, eles foram:\n" + out.substring(0, out.length() - 7));
        System.out.println("================================================");
        System.out.println("A média dos valores é:\n" + media);
        System.out.println("================================================");
        System.out.println("Foram inseridos " + qtd_pos + " números positivos.");
        System.out.println("\nOs valores positivos foram:\n" + out_pos.substring(0, out_pos.length() - 2));
        System.out.println("\nO percentual de valores positivos é:\n" + perc_pos);
        System.out.println("================================================");
        System.out.println("Foram inseridos " + qtd_neg + " números negativos.");
        System.out.println("Os valores negativos foram:\n" + out_neg.substring(0, out_neg.length() - 2));
        System.out.println("\nO percentual de valores negativos é:\n" + perc_neg);
    }
}
