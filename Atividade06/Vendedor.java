public class Vendedor extends Funcionario {
    private double valorVendas;
    private int porcentagemComissao;

    public Vendedor(String nome, int matricula, double salarioBase, double valorVendas, int porcentagemComissao) {
        super(nome, matricula, salarioBase);
        this.valorVendas = valorVendas;
        this.porcentagemComissao = porcentagemComissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public int getPorcentagemComissao() {
        return porcentagemComissao;
    }

    public void setPorcentagemComissao(int porcentagemComissao) {
        if (porcentagemComissao < 0 || porcentagemComissao > 100) {
            System.out.println("A porcentagem de comissão deve estar entre 0 e 100.");
        } else {
            this.porcentagemComissao = porcentagemComissao;
        }
    }

    public void setValorVendas(double valorVendas) {
        if (valorVendas < 0) {
            System.out.println("O valor das vendas não pode ser negativo.");
        } else {
            this.valorVendas = valorVendas;
        }
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (valorVendas * porcentagemComissao / 100);
    }

    public void registrarVenda(double valor) {
        valorVendas += valor;
    }

}
