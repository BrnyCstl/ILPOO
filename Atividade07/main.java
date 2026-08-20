public class main {
    public static void main(String[] args) {

        Medico medico1 = new Medico("Marcos", "cardiologista", 123456);
        Paciente paciente1 = new Paciente("Jefferson", "40028922", 102);

        paciente1.apresentarPaciente();
        medico1.apresentarMedico();
        System.out.println("======================================================");
        paciente1.realizarConsulta(medico1);
        System.out.println("======================================================");
        paciente1.apresentarPaciente();
        medico1.apresentarMedico();

    }
}
