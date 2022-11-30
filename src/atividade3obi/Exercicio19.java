/*
Crie um sistema de login. O usuário deve ser “java” e a senha “123”. Conte o número de
tentativas erradas. Caso a pessoa informar as credenciais corretas, mostre a mensagem “Logado
com sucesso”, caso a pessoa errar 3 vezes, saia do sistema.
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio19 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int erro = 0;
        String login, senha;
        boolean val = false, erros = false;

        do {
            System.out.println("Insira o login:");
            login = s.nextLine();
            System.out.println("Insira a senha:");
            senha = s.nextLine();

            if (login.equalsIgnoreCase("java") && senha.equalsIgnoreCase("123")) {
                System.out.println("Logado com sucesso");
                val = true;
            } else {
                System.out.println("----------------------------");
                erro++;
            }
            if (erro == 3) {
                System.out.println("Número de tentativas excedidas");
                erros = true;
            }
        } while (val == false & erros == false);
    }
}
