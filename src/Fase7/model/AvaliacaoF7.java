package Fase7.model;

public class AvaliacaoF7 {
    private String descricao;
    private double nota;

    public AvaliacaoF7(String descricao, double nota) {
        this.descricao = descricao;
        this.nota = (nota < 0 || nota > 10) ? 0 : nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}