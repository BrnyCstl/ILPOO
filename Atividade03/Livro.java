public class Livro {
    String titulo;
    String autor;
    int paginas;
    int anoPublicacao;

    public Livro(String titulo, String autor, int paginas, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.anoPublicacao = anoPublicacao;
    }

    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Páginas: " + paginas + ", Ano de Publicação: " + anoPublicacao;
    }

}
