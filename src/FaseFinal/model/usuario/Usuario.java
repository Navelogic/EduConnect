package FaseFinal.model.usuario;

public abstract class Usuario {
    protected String nome;
    protected String login;
    protected String senha;

    public Usuario(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public String getNome() { return nome; }
    public String getLogin() { return login; }
    public boolean validarSenha(String senha) { return this.senha.equals(senha); }
}