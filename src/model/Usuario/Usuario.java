package model.Usuario;

import model.Autenticavel;

public abstract class Usuario implements Autenticavel {

    protected String nome;
    protected String registro;
    protected String login;
    protected String senha;

    public Usuario(String nome, String registro, String login, String senha) {
        this.nome = nome;
        this.registro = registro;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        return this.login != null &&
                this.senha != null &&
                this.login.equals(login) &&
                this.senha.equals(senha);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
