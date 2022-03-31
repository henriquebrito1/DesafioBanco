package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int op;
//        do {
//            System.out.println(" 1: Abrir conta");
//            System.out.println("2:Sacar");
//            System.out.println("3:Depositar");
//            System.out.println("4: Transferir");
//            op = input.nextInt ();
//
//        } while (op ==1||op==2||op==3||op== 4);
//    }

        {
            Conta cc = new ContaCorrente();
            cc.depositar(100);

            Conta poupanca = new ContaPoupança();
            cc.transferir(100, poupanca);
            cc.imprimirExtrato();
            poupanca.imprimirExtrato();
        }
    }
}