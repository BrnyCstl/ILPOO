public class Paciente{
    private String nome;
    private int idade;
    private String cpf;

    Medico medico;

    public Paciente(String nome, String cpf, int idade){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public void setNome(String nome){
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode ser vazio");
        } else {this.nome = nome;}
    }

    public void setIdade(int idade){
        if (idade <= 0){
            throw new IllegalArgumentException("A idade não pode ser negativa ou zero");
        } else {this.idade = idade;}
    }

    public void setCpf(String cpf){
        if (cpf == null || cpf.trim().isEmpty()){
            throw new IllegalArgumentException("O CPF não pode ser vazio");
        } else {this.cpf = cpf;}
    }

    public String getNome(){
        return nome;
    }

    public int getIdade(){
        return idade;
    }

    public String getCpf(){
        return cpf;
    }

    public void apresentarPaciente(){
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf);
    }

    public void realizarConsulta(Medico medico){
        System.out.println("Realizando Consulta");
        System.out.println("Nome do paciente: " + nome + "\nNome do médico: " + medico.getNome() + "\nEspecialidade: " + medico.getEspecialidade());
    }
    
}