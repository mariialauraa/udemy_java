import java.util.Locale;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        System.out.println("Entrar com o produto: ");
        System.out.print("Nome: ");
        String name = sc.nextLine();
        System.out.print("Preço: ");
        double price = sc.nextDouble();
        //System.out.print("Quantidade em estoque: ");
        //int qtd = sc.nextInt();

        Produto produto = new Produto(name, price);

        produto.setName("Computador");
        System.out.println();
        System.out.print("Nome atualizado: " + produto.getName());
        produto.setPrice(1200.00);
        System.out.println();
        System.out.print("Preço atualizado $ " + produto.getPrice());


        System.out.println();
        //System.out.println("Nome do produto " + produto.name + ", " + produto.qtd + " unds, Total: $ " + produto.totalEstoque());
        System.out.println("Nome de produto: " + produto);


        System.out.println();
        System.out.print("Entre com o número de produtos a ser add no estoque: ");
        int qtde = sc.nextInt();
        produto.addProd(qtde);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println();
        System.out.print("Entre com o número de produtos a ser retirado do estoque: ");
        qtde = sc.nextInt();
        produto.removeProd(qtde);

        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}
