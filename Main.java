public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Kicks", "Nissan", 0);
        veiculo.acelerar(50);
        veiculo.mostrarDados();
        veiculo.freiar(90);
        veiculo.mostrarDados();
    }

}
