public class Estagiario extends Funcionario {
    private String instituicaoEnsino;
    
    public Estagiario(String nome, int matricula, double salarioBase, String instituicaoEnsino){
        super(nome, matricula, salarioBase);
        this.instituicaoEnsino = instituicaoEnsino;
    }

    public String getInstituicaoEnsino() {
        return instituicaoEnsino;
    }

    public void setInstituicaoEnsino(String instituicaoEnsino) {
        if (instituicaoEnsino == null || instituicaoEnsino.trim().isEmpty()) {
            System.out.println("A instituição de ensino não pode ser nula ou vazia.");
        } else {
            this.instituicaoEnsino = instituicaoEnsino;
        }
    }

    public void realizarTreinamento() {
        System.out.println("O estagiário está realizando um treinamento.");
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase();
    }


}
