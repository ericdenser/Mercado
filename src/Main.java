import model.Produto;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();


        System.out.println("Bem vindo ao mercado lilo");
        while (true) {
            System.out.print("Informe o produto que comprou (0 para sair): ");
            String inputNome = read.nextLine();

            if (inputNome.equals("0")) {
                break;
            }

            System.out.print("Quantidade comprada: ");
            int inputQuantidade = read.nextInt();

            if (inputQuantidade <= 0) {
                System.out.println("Digite uma quantia válida!");
                read.nextLine();
                continue;
            }

            System.out.print("Valor do produto: ");
            double inputPreco = read.nextDouble();
            read.nextLine();

            Produto produto = new Produto(inputNome, inputQuantidade, inputPreco);
            listaDeProdutos.add(produto);
            System.out.println(produto.toString());
        }
    }
}