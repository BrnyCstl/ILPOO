public class Aluno {
    String nome;
    String curso;
    int idade; 

    //construtor
    public Aluno(String nome, String curso, int idade) {
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    public void apresentarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Idade: " + idade);
    }

    public boolean verificarMaiorIdade() {
        return idade >= 18;
    }
}
