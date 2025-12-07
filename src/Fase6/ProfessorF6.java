package Fase6;

public class ProfessorF6 extends UsuarioF6 implements AutenticavelF6, ImprimivelF6 {
    private String especialidadeF4;
    private String registroF4;

    public ProfessorF6(String nomeF4, String login, String senha, String especialidadeF4, String registroF4) {
        super(nomeF4, login, senha);
        this.especialidadeF4 = especialidadeF4;
        this.registroF4 = registroF4;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("=== RELATÓRIO DO DOCENTE ===");
        System.out.println("Professor: " + super.getNome());
        System.out.println("Especialidade: " + this.especialidadeF4);
        System.out.println("Acesso ao Sistema: " + (super.getLogin() != null ? "ATIVO" : "INATIVO"));
        System.out.println("============================");
    }

    public String getNomeF4() {
        return super.nome;
    }

    public void setNomeF4(String nomeF4) {
        super.nome = nomeF4;
    }

    public String getEspecialidadeF4() {
        return especialidadeF4;
    }

    public void setEspecialidadeF4(String especialidadeF4) {
        this.especialidadeF4 = especialidadeF4;
    }

    public String getRegistroF4() {
        return registroF4;
    }

    public void setRegistroF4(String registroF4) {
        this.registroF4 = registroF4;
    }

    @Override
    public boolean autenticar(String login, String senha) {
        boolean dadosCorretos = this.login.equals(login) && this.senha.equals(senha);
        if (dadosCorretos) {
            System.out.println("Professor " + this.nome + " logado com sucesso!");
            return true;
        }
        return false;
    }
}
