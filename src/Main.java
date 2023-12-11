import entities.Produto;
import java.util.Locale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("Digite os dados do produto");
        System.out.print("Nome: ");
        produto.setName(scanner.nextLine());
        System.out.print("Preço: ");
        produto.setPreco(scanner.nextDouble());
        System.out.print("Quantidade em estoque: ");
        produto.setQuantidade(scanner.nextInt());
        System.out.println("Informações do produto: " + produto);

        System.out.println("Digite a quantidade pra adicionar no estoque ");
        int quantidade = scanner.nextInt();
        produto.addProduto(quantidade);
        System.out.println();
        System.out.println("Informações do produto: " + produto);

        System.out.println("Digite a quantidade para remover do estoque ");
        quantidade = scanner.nextInt();
        produto.removerProduto(quantidade);
        System.out.println("Informações do produto: " + produto);

        scanner.close();



    }
}