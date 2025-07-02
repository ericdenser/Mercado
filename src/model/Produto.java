package model;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    private double subTotal;

    public Produto(String nome, int quantidade, double preco) {
        this.quantidade = quantidade;
        this.nome = nome;
        this.preco = preco;
        this.subTotal = this.quantidade * this.preco;
    }

    public String getNome() {return nome;}
    public double getPreco() {return preco;}
    public int getQuantidade() {return quantidade;}
    public double getSubTotal() {return subTotal;}


    @Override
    public String toString() {
        return String.format("""
        Item: %s | Qtd: %d | Preço Un.: R$ %.2f | Subtotal: R$ %.2f\n""",
                this.nome, this.quantidade, this.preco, this.subTotal);
    }
}
