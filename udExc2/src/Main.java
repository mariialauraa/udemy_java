import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Funcionario funcionario = new Funcionario();

        System.out.print("Nome: ");
        funcionario.name = sc.nextLine();

        System.out.print("Salario Bruto: ");
        funcionario.salarioB = sc.nextDouble();

        System.out.print("Taxa: ");
        funcionario.taxa = sc.nextDouble();

        System.out.printf("Funcionario: " +  funcionario.name + ", $ %.2f", funcionario.salarioL());

        System.out.println();
        System.out.print("Quanto de aumento: ");
        double porcentagem = sc.nextDouble();
        funcionario.aumSalario(porcentagem);

        System.out.println();
        System.out.print("Dados atualizados: " + funcionario);

        sc.close();
    }
}
