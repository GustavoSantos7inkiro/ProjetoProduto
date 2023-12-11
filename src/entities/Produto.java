package entities;

public class Produto {

    private String name;
    private double preco;
    private int quantidade;


    public double valorTotalEstoque() {
        return getPreco() * getQuantidade();
    }
    public void addProduto(int quantidade) {
        this.setQuantidade(this.getQuantidade() + quantidade);
    }
    public void removerProduto(int quantidade) {
        this.setQuantidade(this.getQuantidade() - quantidade);
    }

    public String toString() {
        return getName()
                + ", $ "
                + String.format("%.2f", getPreco())
                + ","
                + getQuantidade()
                + " unidades, total: $"
                + String.format("%.2f", valorTotalEstoque());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}