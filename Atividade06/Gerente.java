public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, int matricula, double salarioBase, double bonus) {
        super(nome, matricula, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            System.out.println("O bônus não pode ser negativo.");
        } else {
            this.bonus = bonus;
        }
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    public void realizarReuniao() {
        System.out.println("O gerente está realizando uma reunião.");
    }


    
}
