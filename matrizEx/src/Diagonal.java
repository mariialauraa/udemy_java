import java.util.Locale;
import java.util.Scanner;

public class Diagonal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] matriz = new int [n][n];

        for (int i=0; i < n; i++) { //acessar a matriz.
            for (int j=0; j < n; j++) {
                matriz [i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i=0; i < matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
            }

        System.out.println();

        int count = 0;

        for (int i=0; i < matriz.length; i++) { //corresponde i < n;
            for (int j=0; j < matriz[i].length; j++) { //corresponde j < n;
                if (matriz[i][j] < 0) { //se verdadeiro ->
                    count++; //somar +1.
                }
            }
        }

        System.out.print("Negative numbers = " + count);

        sc.close();
    }
}
