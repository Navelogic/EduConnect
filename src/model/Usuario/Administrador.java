package model.Usuario;

public class Administrador extends Usuario {
    private String setor;

    public Administrador(String nome, String registro, String login, String senha, String setor) {
        super(nome, registro, login, senha);
        this.setor = setor;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        boolean autenticado = super.autenticar(login, senha);
        if (autenticado) {
            System.out.println("[LOG SISTEMA] Administrador " + this.nome + " acessou o painel.");
        }
        return autenticado;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
