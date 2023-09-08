package application;

import entities.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // entrada do tamanho do vetor.
        Produto[] vect = new Produto[n]; // vetor tipo a classe Produto.

        for(int i=0; i< vect.length; i++){
            sc.nextLine(); // para a Scanner continuar, por causa sc.nextInt().
            String nome = sc.nextLine(); // digitar o nome do produto.
            double preco = sc.nextDouble(); // digitar o preço do produto.
            vect[i] = new Produto(nome, preco); // lembrar vect[i]. Instanciar Produto.
        }

        double soma = 0.0; // iniciar soma com 0.
        for(int i=0; i< vect.length; i++){
            soma += vect[i].getPreco(); // Soma dos produtos, get para acessar a variável private.
        }

        double media = soma / vect.length; // tamanho do vetor.
        System.out.printf("A média dos produtos é: %.2f", media);

        sc.close();
    }
}
