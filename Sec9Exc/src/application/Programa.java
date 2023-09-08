package application;

import entities.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {      
    

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.println("Bem vindo ao Banco MLR");
        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        char resposta = sc.next().charAt(0);
        if(resposta == 'y'){
            System.out.print("Enter initial deposit value: $");
            double initialDeposit = sc.nextDouble();
            conta = new Conta(number, holder, initialDeposit);
        } else {
            conta = new Conta(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a deposit value: $");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);
        System.out.println("Uppdate account date:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Enter a withdraw value: $");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);
        System.out.println("Uppdate account date:");
        System.out.println(conta);

        sc.close();
    }
}
