/*
Modifique o exercício anterior para fazer um CAIXA ELETRÔNICO. Após logado, o
usuário deve informar o valor que ele deseja sacar. Na sequência, mostre a quantidade mínima
de notas que serão dadas ao usuário (possíveis notas: 100, 50, 20, 10, 5 e 2).
Validações:
a) O sistema deve limitar o saque a R$1500.
b) Verificar se o valor informado para saque é válido ou não, por exemplo, R$11 não é possível
sacar, pois não tem nota de R$1.
 */
package atividade3obi;

import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int erro = 0, nota_2, nota_5, nota_10, nota_20, nota_50, nota_100, valida, aux, valor;
        String login, senha;
        boolean val = false, erros = false, val_2 = false;

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

        do {
            if (val == true) {
                System.out.println("Insira o valor que deseja sacar:");
                valor = s.nextInt();
                aux = valor;
                if (valor > 1500) {
                    System.out.println("Valor acima do permitido.\nPara sacar acima de R$1500,00 se dirija \nao caixa de atendimento presencial.");
                    System.out.println("------------------------------------------\nDeseja continuar?\n1- Sim\n2- Não");
                    valida = s.nextInt();
                    if (valida == 1) {
                        System.out.println("Insira um valor abaixo de R$1500,00.");
                    } else if (valida == 2) {
                        val_2 = true;
                    }
                } else if (valor <= 1500 && valor > 0) {
                    nota_100 = valor / 100;
                    valor = valor - nota_100 * 100;
                    nota_50 = valor / 50;
                    valor = valor - nota_50 * 50;
                    nota_20 = valor / 20;
                    valor = valor - nota_20 * 20;
                    nota_10 = valor / 10;
                    valor = valor - nota_10 * 10;
                    nota_5 = valor / 5;
                    valor = valor - nota_5 * 5;
                    nota_2 = valor / 2;
                    valor = valor - nota_2 * 2;

                    if (valor != 0) {
                        System.out.println("A máquina só liberará notas, não é possível sacar moedas, por favor insira um outro valor.");
                    } else if (valor == 0) {
                        System.out.println("O valor inserido foi:" + aux);
                        System.out.println("Confirmar as cédulas abaixo:\n" + nota_100 + " notas de 100\n" + nota_50 + " notas de 50\n" + nota_20 + " notas de 20\n" + nota_10 + " notas de 10\n" + nota_5 + " notas de 5\n" + nota_2 + " notas de 2\n");
                        System.out.println("Deseja confirmar o saque?\n1- Sim\n2- Não");
                        valida = s.nextInt();
                        if(valida==1){
                            System.out.println("Saque realizado com sucesso.");
                            val_2 = true;
                        }else if(valida == 2){
                            System.out.println("A operação reiniciará.");
                        }
                    }
                } else {
                    System.out.println("Valor inválido.");
                }

            } else {
                System.out.println("Sua conta foi bloqueada, procure seu gerente.");
                val_2 = true;
            }
        } while (val_2 == false);
    }
}
