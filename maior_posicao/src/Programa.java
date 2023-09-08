import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];

        for (int i=0; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        double maior = vetor[0];
        int posicaoMaior = 0;

        for (int i=1; i < vetor.length; i++){ //percorrendo posiçao do vetor
            if (vetor[i] > maior) { //maior vetor
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.print("\nMAIOR VALOR = " + maior + "\n");
        System.out.print("POSICAO DO MAIOR VALOR = " + posicaoMaior);

        sc.close();
    }
}
