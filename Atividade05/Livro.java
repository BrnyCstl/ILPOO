public class Livro {
    private String titulo;
    private String autor;
    private int Paginas;

    public Livro(String titulo, String autor, int Paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.Paginas = Paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == "") {
            System.out.println("O título não pode ser vazio.");
        } else {this.titulo = titulo;}
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == "") {
            System.out.println("O autor não pode ser vazio.");
        } else {this.autor = autor;}
    }

    public int getPaginas() {        
        return Paginas;
    }

    public void setPaginas(int Paginas) {
        if (Paginas < 0) {
            System.out.println("O número de páginas não pode ser negativo.");
        }else {this.Paginas = Paginas;}
    }

    public void apresentarLivro() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Páginas: " + Paginas);
    } 


}