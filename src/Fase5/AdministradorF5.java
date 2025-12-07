package Fase5;

public class AdministradorF5 extends UsuarioF5 implements AutenticavelF5{

    public AdministradorF5(String nome, String login, String senha) {
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
