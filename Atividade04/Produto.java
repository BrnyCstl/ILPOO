public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
        this.preco = preco;
        } else {System.out.println("Preço inválido. O preço deve ser maior que zero.");}
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {System.out.println("Quantidade inválida. A quantidade não pode ser negativa.");}

    }

    @Override
    public String toString() {
        return "nome: " + nome + ", preco: " + preco + ", quantidade: " + quantidade;
    }


}
