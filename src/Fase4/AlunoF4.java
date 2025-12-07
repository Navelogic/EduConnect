package Fase4;

import java.util.ArrayList;
import java.util.List;

public class AlunoF4 {
    private String nomeF4;
    private String matriculaF4;
    private CursoF4 cursoF4;
    private List<AvaliacaoF4> avaliacoesF4;

    public AlunoF4(String nomeF4, String matriculaF4, CursoF4 cursoF4) {
        this.nomeF4 = nomeF4;
        this.matriculaF4 = matriculaF4;
        this.cursoF4 = cursoF4;
        this.avaliacoesF4 = new ArrayList<>();
    }

    public void realizarAvaliacao(AvaliacaoF4 avaliacao) {
        this.avaliacoesF4.add(avaliacao);
    }

    public double calcularMedia() {
        if (avaliacoesF4.isEmpty()) return 0.0;

        double soma = 0;
        for (AvaliacaoF4 a : avaliacoesF4) {
            soma += a.getNotaF4();
        }
        return soma / avaliacoesF4.size();
    }

    public void exibirBoletim() {
        System.out.println("Boletim de: " + this.nomeF4);
        for (AvaliacaoF4 a : avaliacoesF4) {
            System.out.println("- " + a.getDescricaoF4() + ": " + a.getNotaF4());
        }
        System.out.println("Média Final: " + String.format("%.2f", calcularMedia()));
        System.out.println("-------------------------");
    }

    public String getNomeF4() {
        return nomeF4;
    }

    public void setNomeF4(String nomeF4) {
        this.nomeF4 = nomeF4;
    }

    public String getMatriculaF4() {
        return matriculaF4;
    }

    public void setMatriculaF4(String matriculaF4) {
        this.matriculaF4 = matriculaF4;
    }

    public CursoF4 getCursoF4() {
        return cursoF4;
    }

    public void setCursoF4(CursoF4 cursoF4) {
        this.cursoF4 = cursoF4;
    }

    public List<AvaliacaoF4> getAvaliacoesF4() {
        return avaliacoesF4;
    }

    public void setAvaliacoesF4(List<AvaliacaoF4> avaliacoesF4) {
        this.avaliacoesF4 = avaliacoesF4;
    }
}
