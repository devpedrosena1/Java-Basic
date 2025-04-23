package main;

import beans.Conta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conta conta = new Conta();

        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 4) {
            System.out.println("=== MENU ===");
            System.out.println("1. Consultar");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Sair");

            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Consulta de valor");
                    conta.consultar();
                    break;
                case 2:
                    System.out.println("Informe o valor a ser sacado: ");
                    float valor = sc.nextFloat();
                    conta.sacar(valor);
                    break;
                case 3:
                    System.out.println("Informe o valor a ser depositado: ");
                    float valorDepositado = sc.nextFloat();
                    conta.depositar(valorDepositado);
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();

    }
}
