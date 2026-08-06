package Atividade02;

public class Veiculo {
    String modelo;
    String marca;
    int velocidadeAtual;


    public Veiculo(String modelo, String marca, int velocidadeAtual) {
        this.modelo = modelo;
        this.marca = marca;
        this.velocidadeAtual = velocidadeAtual;
    }

    public void acelerar(int incremento) {
        velocidadeAtual += incremento;
    }

    public void freiar(int decremento) {
        velocidadeAtual -= decremento;
        if (velocidadeAtual < 0) {
            velocidadeAtual = 0;
        }
    }

    public void mostrarDados() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Velocidade Atual: " + velocidadeAtual + " km/h");
    }
}