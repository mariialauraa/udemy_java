import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        System.out.println("Digite os valores do vetor A: ");
        for (int i=0; i < a.length; i++){
           a[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        for (int i=0; i < b.length; i++){
           b[i] = sc.nextInt();
        }

        int[] c = new int[n];
        for (int i=0; i < c.length; i++){
           c[i] = a[i] + b[i]; //soma do vetor a+b.
        }

        System.out.println("VETOR RESULTANTE: ");
        for (int i=0; i < c.length; i++){
            System.out.printf("%d\n", c[i]); //imprimir valor do vetor c.
        }

        sc.close();
    }
}
