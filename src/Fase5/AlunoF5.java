package Fase5;

import java.util.ArrayList;
import java.util.List;

public class AlunoF5 extends UsuarioF5 implements AutenticavelF5 {
    private String matriculaF4;
    private CursoF5 cursoF4;
    private List<AvaliacaoF5> avaliacoesF4;

    public AlunoF5(String nomeF4, String login, String senha, String matriculaF4, CursoF5 cursoF4) {
        super(nomeF4, login, senha);
        this.matriculaF4 = matriculaF4;
        this.cursoF4 = cursoF4;
        this.avaliacoesF4 = new ArrayList<>();
    }

    public void realizarAvaliacao(AvaliacaoF5 avaliacao) {
        this.avaliacoesF4.add(avaliacao);
    }

    public double calcularMedia() {
        if (avaliacoesF4.isEmpty()) return 0.0;

        double soma = 0;
        for (AvaliacaoF5 a : avaliacoesF4) {
            soma += a.getNotaF4();
        }
        return soma / avaliacoesF4.size();
    }

    public void exibirBoletim() {
        System.out.println("Boletim de: " + super.nome);
        for (AvaliacaoF5 a : avaliacoesF4) {
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

    public CursoF5 getCursoF4() {
        return cursoF4;
    }

    public void setCursoF4(CursoF5 cursoF4) {
        this.cursoF4 = cursoF4;
    }

    public List<AvaliacaoF5> getAvaliacoesF4() {
        return avaliacoesF4;
    }

    public void setAvaliacoesF4(List<AvaliacaoF5> avaliacoesF4) {
        this.avaliacoesF4 = avaliacoesF4;
    }
}
