package aplicattions;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtos;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produtos produto = new Produtos();
        System.out.println("Produtos: ");
        System.out.print("Nome: ");
        produto.name = sc.nextLine();
        System.out.print("Preço: ");
        produto.price = sc.nextDouble();
        System.out.print("Digite a quantidade: ");
        produto.quantity = sc.nextInt();

        System.out.print("Dados do produto: " + produto);
        System.out.println();

        System.out.print("Digite a quantidade de produtos que vão ser adicionados: ");
        int quantity = sc.nextInt();
        produto.addProdutos(quantity);
        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        System.out.println("Digite a quantidade de produtos que vão ser removidos: ");
        quantity = sc.nextInt();
        produto.removeProdutos(quantity);
        System.out.println();
        System.out.println("Dados atualizados: " + produto);

        sc.close();
    }
}
