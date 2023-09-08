import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Aluno aluno = new Aluno();

        aluno.nome = sc.nextLine();
        aluno.prova1 = sc.nextDouble();
        aluno.prova2 = sc.nextDouble();
        aluno.prova3 = sc.nextDouble();


        System.out.println();
        System.out.printf("Notal final: %.2f%n", aluno.media());

        if (aluno.media() > 60.0){
            System.out.println();
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("Faltou: %.2f pontos%n", aluno.reprovouPor());
        }

        sc.close();
    }
}
