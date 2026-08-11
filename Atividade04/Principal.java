public class Principal {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Notebook", 2500.00, 5);
        Produto produto2 = new Produto("Smartphone", 1500.00, 10);

        produto1.setPreco(2600.00);
        produto2.setPreco(-100.00); // Tentativa de definir um preço inválido

        System.out.println(produto1);
        System.out.println(produto2);
    }
}