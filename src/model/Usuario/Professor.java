package model.Usuario;

public class Professor extends Usuario {
    private String especialidade;

    public Professor(){}

    public Professor(String nome, String registro, String especialidade){
        super(nome, registro);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
