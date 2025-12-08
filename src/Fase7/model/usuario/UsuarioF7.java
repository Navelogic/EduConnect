package Fase7.model.usuario;

public abstract class UsuarioF7 {
    protected String nome;
    protected String login;
    protected String senha;

    public UsuarioF7(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public String getLogin() { return login; }
    public boolean validarSenha(String senha) { return this.senha.equals(senha); }
}
