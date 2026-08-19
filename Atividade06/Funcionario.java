public class Funcionario {
    private String nome;
    private int matricula;
    private double salarioBase;

    public Funcionario(String nome, int matricula, double salarioBase) {
        this.nome = nome;
        this.matricula = matricula;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("O nome não pode ser nulo ou vazio.");
        } else {
            this.nome = nome;
        }
    }

    public void setMatricula(int matricula) {
        if (matricula <= 0) {
            System.out.println("A matrícula não pode ser nula ou menor que zero.");
        } else {
            this.matricula = matricula;
        }
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            System.out.println("O salário base não pode ser negativo.");
        } else {
            this.salarioBase = salarioBase;
        }
    }

    public double calcularSalario() {
        return salarioBase;
    }
    
    public String apresentarDados() {
        return "Nome: " + nome + ", Matrícula: " + matricula + ", Salário Base: " + salarioBase;
    }
}