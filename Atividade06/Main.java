public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("João", 123, 5000.0, 1000.0);
        Vendedor vendedor = new Vendedor("Maria", 456, 3000.0, 20000.0, 10);
        Estagiario estagiario = new Estagiario("Pedro", 789, 1500.0, "Universidade XYZ");

        System.out.println(gerente.apresentarDados());
        System.out.println(vendedor.apresentarDados());
        System.out.println(estagiario.apresentarDados());

        System.out.printf("Salário do gerente: %.2f%n", gerente.calcularSalario());
        System.out.printf("Salário do vendedor: %.2f%n", vendedor.calcularSalario());
        System.out.printf("Salário do estagiário: %.2f%n", estagiario.calcularSalario());

        gerente.realizarReuniao();
        vendedor.registrarVenda(5000.0);
        estagiario.realizarTreinamento();

    }
}
