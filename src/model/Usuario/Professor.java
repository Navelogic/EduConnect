package model.Usuario;

public class Professor extends Usuario {
    private String especialidade;

    public Professor(String nome, String registro, String login, String senha, String especialidade) {
        super(nome, registro, login, senha);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
