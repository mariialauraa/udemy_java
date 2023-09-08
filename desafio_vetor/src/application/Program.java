package application;

import entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10]; //cria vetores de 0 a 9.

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        for (int i=1; i <= n; i++){ //ler os dados: i já começa com 1 por isso <= pra ler ate o n.
            System.out.println();
            System.out.println("Rent #" + i + ":");
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt(); //usuario informa.

            Rent rent = new Rent(name,email); //instanciando um objeto.

            vect[roomNumber] = rent; //atribuindo a referencia dele para o vetor na posicao roomNumber.
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println(i + ": " + vect[i]);
            }
        }

        sc.close();
    }
}
