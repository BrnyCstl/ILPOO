public class main{
    public static void main(String[] args) {
        ReservaHotel reserva1 = new ReservaHotel("João", 101, 3, 150.0);
        ReservaHotel reserva2 = new ReservaHotel("Maria", 202, 5, 200.0);

        System.out.println(reserva1);
        System.out.println(reserva2);

        System.out.printf("\nValor da primeira reserva: %.2f", reserva1.calcularHospedagem());
        System.out.printf("\nValor da segunda reserva com 20 por cento de desconto: %.2f", reserva2.calcularHospedagem(20.0));

        System.out.printf("\nValor da primeira reserva com 10 por cento de desconto e taxa de serviço de 50: %.2f", reserva1.calcularHospedagem(10.0, 50.0));

        System.out.printf("\nValor da segunda reserva com 15 por cento de desconto e taxa de serviço de 30: %.2f", reserva2.calcularHospedagem(15.0, 30.0));
    }
}