import model.Produto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();


        System.out.println("Bem vindo ao mercado lilo");
        while (true) {
            System.out.print("Informe o produto que comprou (0 para ir ao carrinho): ");
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

        double valorCarrinho = 0;

        System.out.println("\n========CARRINHO========");

        if (listaDeProdutos.isEmpty()) {
            System.out.println("Parece que você não comprou nenhum produto :(");
            return;
        }

        for (Produto p: listaDeProdutos) {
            System.out.print(p);
            valorCarrinho += p.getSubTotal();
        }
        System.out.printf("Valor total a pagar: R$%.2f", valorCarrinho);
        System.out.println("\n========================");
        System.out.println("""
                \nFelizmente estamos oferecendo aos primeiros clientes todos os produtos de graca!
                Fique ligado para novas atualizacoes e obrigado por experimentar!
                """);
        return;
    }
}