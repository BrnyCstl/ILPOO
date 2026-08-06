public class main {
    public static void main(String[] args) {
        
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes", 1000, 1605);
        Livro livro2 = new Livro("1984", "George Orwell", 300, 1948);
        Livro livro3 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200, 1954);

        Funcionario funcionario1 = new Funcionario("João", "Gerente", 5000.00);
        Funcionario funcionario2 = new Funcionario("Maria", "Analista", 4000.00);

        System.out.println(livro1);
        System.out.println(livro2);
        System.out.println(livro3);
        
        System.out.println(funcionario1);
        System.out.println(funcionario2);
    }
}
