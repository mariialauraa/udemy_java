package application;

import entities.Pessoas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        Pessoas[] vect = new Pessoas[n];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vect[i] = new Pessoas(nome, idade, altura);
        }

        double somaAltura = 0.0;
        for (int i = 0; i < vect.length; i++) {
            somaAltura += vect[i].getAltura();
        }

        double mediaAltura = somaAltura / vect.length;
        System.out.println();
        System.out.printf("Altura média: %.2f", mediaAltura);

        //Pessoas menores 16 anos
        int cont = 0;
        for (int i = 0; i < vect.length; i++) {
            if (vect[i].getIdade() < 16) {
                cont++;
            }
        }

        //>16 porcentagem
        double percentualMenores = (cont * 100.0 / vect.length);
        System.out.println();
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores); //%% para aparecer o %

        //>16 nomes
        for(int i=0; i<n; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.printf("%s\n", vect[i].getNome());
            }
        }

        sc.close();

    }
}


