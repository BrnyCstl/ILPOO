public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1178);
        Livro livro2 = new Livro("1984", "George Orwell", 328);

        livro1.apresentarLivro();
        livro2.apresentarLivro();

        livro1.setTitulo("O Hobbit");
        livro1.getPaginas();

        livro1.apresentarLivro();
    }
}