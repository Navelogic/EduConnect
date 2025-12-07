package Fase3;

import java.util.ArrayList;
import java.util.List;

public class AlunoF3 {
    private String nomeF3;
    private String matriculaF3;
    private CursoF3 cursoF3;
    private List<AvaliacaoF3> avaliacoesF3;

    public AlunoF3(String nomeF3, String matriculaF3, CursoF3 cursoF3) {
        this.nomeF3 = nomeF3;
        this.matriculaF3 = matriculaF3;
        this.cursoF3 = cursoF3;
        this.avaliacoesF3 = new ArrayList<>();
    }

    public void realizarAvaliacao(AvaliacaoF3 avaliacao) {
        this.avaliacoesF3.add(avaliacao);
    }

    public double calcularMedia() {
        if (avaliacoesF3.isEmpty()) return 0.0;

        double soma = 0;
        for (AvaliacaoF3 a : avaliacoesF3) {
            soma += a.getNotaF3();
        }
        return soma / avaliacoesF3.size();
    }

    public void exibirBoletim() {
        System.out.println("Boletim de: " + this.nomeF3);
        for (AvaliacaoF3 a : avaliacoesF3) {
            System.out.println("- " + a.getDescricaoF3() + ": " + a.getNotaF3());
        }
        System.out.println("Média Final: " + String.format("%.2f", calcularMedia()));
        System.out.println("-------------------------");
    }

    public String getNomeF3() {
        return nomeF3;
    }

    public void setNomeF3(String nomeF3) {
        this.nomeF3 = nomeF3;
    }

    public String getMatriculaF3() {
        return matriculaF3;
    }

    public void setMatriculaF3(String matriculaF3) {
        this.matriculaF3 = matriculaF3;
    }

    public CursoF3 getCursoF3() {
        return cursoF3;
    }

    public void setCursoF3(CursoF3 cursoF3) {
        this.cursoF3 = cursoF3;
    }

    public List<AvaliacaoF3> getAvaliacoesF3() {
        return avaliacoesF3;
    }

    public void setAvaliacoesF3(List<AvaliacaoF3> avaliacoesF3) {
        this.avaliacoesF3 = avaliacoesF3;
    }
}
