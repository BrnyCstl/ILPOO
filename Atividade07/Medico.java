public class Medico{
    private String nome;
    private String especialidade;
    private int crm;

    public Medico (String nome, String especialidade, int crm){
        this.nome = nome;
        this.especialidade = especialidade;
        this.crm = crm;
    }

    public void setNome (String nome){
        if (nome == null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("O nome não pode ser vazio");
        } else {this.nome = nome;}
    }

    public void setEspecialidade (String especialidade){
        if (especialidade == null || especialidade.trim().isEmpty()){
            throw new IllegalArgumentException("A especialidade deve ser informada");
        } else{this.especialidade = especialidade;}
    }

    public void setCrm (int crm){
        if (crm <= 0){
            throw new IllegalArgumentException("CRM não pode ser negativo ou zero");
        } else{this.crm = crm;}
    }

    public String getNome(){
        return nome;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public int getCrm(){
        return crm;
    }

    public void apresentarMedico(){
        System.out.println("Nome: " + nome + "\nEspecialidade: " + especialidade + "\nCRM: " + crm);
    }
}
