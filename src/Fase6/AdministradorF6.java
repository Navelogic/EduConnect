package Fase6;

public class AdministradorF6 extends UsuarioF6 implements AutenticavelF6 {

    public AdministradorF6(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    @Override
    public boolean autenticar(String login, String senha) {
        boolean dadosCorretos = this.login.equals(login) && this.senha.equals(senha);
        if (dadosCorretos) {
            System.out.println("Adm " + this.nome + " logado com sucesso!");
            return true;
        }
        return false;
    }

    public void criarNovoCurso() {
        System.out.println("ADMIN: Criando novo curso no sistema...");
    }
}
