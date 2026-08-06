public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
     this.nome = nome;
     this.cargo = cargo;
     this.salario = salario;
    }

    public String toString() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Salário: " + salario;
    }
}

