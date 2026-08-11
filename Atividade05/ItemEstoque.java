public class ItemEstoque {
    private String nome;
    private int quantidade;
    private double preco;

    public ItemEstoque(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public void setNome(String nome){
        if (nome == ""){
            System.out.println("O nome do produto não pode ser vazio");
        }else{this.nome = nome;}
    }

    public String getNome(){
        return nome;
    }

    public void setQuantidade(int quantidade){
        if (quantidade < 0){
            System.out.println("A quantidade de produtos não pode ser negativa");
        }else{this.quantidade = quantidade;}
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setPreco(double preco){
        if (preco < 0){
            System.out.println("O preço do produto não pode ser negativo");
        }else{this.preco = preco;}
    }

    public double getPreco(){
        return preco;
    }

    public void adicionarQuantidade(int quantidade){
        if (quantidade <= 0){
            System.out.println("A quantidade adicionada precisa ser inteira");
        }else{this.quantidade += quantidade;}
    }

    public void retirarQuantidade(int quantidade){
        if (this.quantidade <= 0){
            System.out.println("Não há produtos para serem retirados do estoque");
        }else if(quantidade - this.quantidade < 0 ){
            System.out.println("Não há como retirar" + quantidade + "pois só tem " + this.quantidade + " no estoque");
        }else{this.quantidade -= quantidade;}
    }

    public void mostrarEstoque(){
        System.out.println("Nome: " + nome + " Quantidade: " + quantidade + " Preço: " + preco);
    }
}
