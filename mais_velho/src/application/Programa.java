package application;

import entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar? ");
        int n = sc.nextInt();

        Pessoas[] vect = new Pessoas[n];

        for (int i = 0; i < vect.length; i++) { //receber o nome e idade
            sc.nextLine();
            System.out.println("Dados da " + (i + 1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            vect[i] = new Pessoas(nome, idade); //vetor da classe Pessoas
        }

        int maiorIdade = 0;
        int posicaoMaior = 0;

        for (int i = 1; i < vect.length; i++) {  //descobrir a maior idade
            if (vect[i].getIdade() > maiorIdade) {
                maiorIdade = vect[i].getIdade();
                posicaoMaior = i;
            }
        }

        System.out.printf("PESSOA MAIS VELHA: %s\n", vect[posicaoMaior].getNome());


        sc.close();
    }
}
