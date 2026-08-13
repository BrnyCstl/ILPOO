public class main {
    public static void main(String[] args) {
        ItemEstoque produto1 = new ItemEstoque("Colgate", 20000, 2000);
        
        produto1.mostrarEstoque();

        produto1.setPreco(3000000);
        produto1.adicionarQuantidade(555);
        produto1.retirarQuantidade(100);
        produto1.getQuantidade();
        produto1.mostrarEstoque();
    }
}
