public class ReservaHotel {
    private String nomeUsuario;
    private int numeroQuarto;
    private int quanDiarias;
    private double valorDiaria;
    
    public ReservaHotel( String nomeUsuario, int numeroQuarto, int quanDiarias, double valorDiaria) {
        this.nomeUsuario = nomeUsuario;
        this.numeroQuarto = numeroQuarto;
        this.quanDiarias = quanDiarias;
        this.valorDiaria = valorDiaria;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public int getQuanDiarias() {
        return quanDiarias;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }



    public void setNomeUsuario(String nomeUsuario) {
        if (nomeUsuario == null || nomeUsuario.isEmpty()) {
            System.out.println("O nome do usuário não pode ser nulo ou vazio.");
        } else {
            this.nomeUsuario = nomeUsuario;
        }
    }

    public void setNumeroQuarto(int numeroQuarto) {
        if (numeroQuarto <= 0) {
            System.out.println("O número do quarto deve ser maior que zero.");
        } else {
            this.numeroQuarto = numeroQuarto;
        }
    }

    public void setQuanDiarias(int quanDiarias) {
        if (quanDiarias <= 0) {
            System.out.println("A quantidade de diárias deve ser maior que zero.");
        } else {
            this.quanDiarias = quanDiarias;
        }
    }

    public void setValorDiaria(double valorDiaria) {
        if (valorDiaria <= 0) {
            System.out.println("O valor da diária deve ser maior que zero.");
        } else {
            this.valorDiaria = valorDiaria;
        }
    }

    @Override
    public String toString() {
        return "Reserva do Hotel: " + "\nnome: " + nomeUsuario + "\nnúmero do quarto: " + numeroQuarto + "\nquantidade de diárias: " + quanDiarias + "\nvalor da diária: " + valorDiaria;
    }

    public double calcularHospedagem() {
        return quanDiarias * valorDiaria;
    }

    public double calcularHospedagem(double percentualDesconto) {
        if (percentualDesconto < 0 || percentualDesconto > 100) {
            System.out.println("O percentual de desconto deve estar entre 0 e 100.");
            return calcularHospedagem();
        }else {
            double valorTotal = calcularHospedagem();
            return valorTotal - (valorTotal * (percentualDesconto / 100));
        }
    }

    public double calcularHospedagem(double percentualDesconto, double taxaServico) {
        if (taxaServico < 0) {
            System.out.println("A taxa de serviço não pode ser negativa.");
            return calcularHospedagem(percentualDesconto);
        }else {
            double valorTotal = calcularHospedagem(percentualDesconto);
            return valorTotal + taxaServico;
        }
    }


}
