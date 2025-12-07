package Fase6;

import java.util.ArrayList;
import java.util.List;

public class AlunoF6 extends UsuarioF6 implements AutenticavelF6, ImprimivelF6 {
    private String matriculaF4;
    private CursoF6 cursoF4;
    private List<AvaliacaoF6> avaliacoesF4;

    public AlunoF6(String nomeF4, String login, String senha, String matriculaF4, CursoF6 cursoF4) {
        super(nomeF4, login, senha);
        this.matriculaF4 = matriculaF4;
        this.cursoF4 = cursoF4;
        this.avaliacoesF4 = new ArrayList<>();
    }

    public void realizarAvaliacao(AvaliacaoF6 avaliacao) {
        this.avaliacoesF4.add(avaliacao);
    }

    public double calcularMedia() {
        if (avaliacoesF4.isEmpty()) return 0.0;

        double soma = 0;
        for (AvaliacaoF6 a : avaliacoesF4) {
            soma += a.getNotaF4();
        }
        return soma / avaliacoesF4.size();
    }

    public void exibirBoletim() {
        System.out.println("Boletim de: " + super.nome);
        for (AvaliacaoF6 a : avaliacoesF4) {
            System.out.println("- " + a.getDescricaoF4() + ": " + a.getNotaF4());
        }
        System.out.println("Média Final: " + String.format("%.2f", calcularMedia()));
        System.out.println("-------------------------");
    }

    @Override
    public boolean autenticar(String login, String senha) {
        boolean dadosCorretos = this.login.equals(login) && this.senha.equals(senha);
        if (dadosCorretos) {
            System.out.println("Aluno " + this.nome + " logado com sucesso!");
            return true;
        }
        return false;
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("=== RELATÓRIO DO ALUNO ===");
        System.out.println("Nome: " + super.getNome()); // Usando o getter herdado
        System.out.println("Matrícula: " + this.getMatriculaF4());
        System.out.println("Curso: " + (this.getCursoF4() != null ? this.getCursoF4().getNomeF4() : "Não matriculado"));
        System.out.println("Média Atual: " + String.format("%.2f", this.calcularMedia()));
        System.out.println("Status: " + (this.calcularMedia() >= 7.0 ? "APROVADO" : "EM RECUPERAÇÃO"));
        System.out.println("==========================");
    }

    public String getNomeF4() {
        return super.nome;
    }

    public void setNomeF4(String nomeF4) {
        super.nome = nomeF4;
    }

    public String getMatriculaF4() {
        return matriculaF4;
    }

    public void setMatriculaF4(String matriculaF4) {
        this.matriculaF4 = matriculaF4;
    }

    public CursoF6 getCursoF4() {
        return cursoF4;
    }

    public void setCursoF4(CursoF6 cursoF4) {
        this.cursoF4 = cursoF4;
    }

    public List<AvaliacaoF6> getAvaliacoesF4() {
        return avaliacoesF4;
    }

    public void setAvaliacoesF4(List<AvaliacaoF6> avaliacoesF4) {
        this.avaliacoesF4 = avaliacoesF4;
    }
}
