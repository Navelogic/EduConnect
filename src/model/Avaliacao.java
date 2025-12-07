package model;

public class Avaliacao {
    private String descricao;
    private Double nota;

    public Avaliacao(String descricao, Double notaInicial) {
        this.descricao = descricao;
        this.atribuirNota(notaInicial);
    }

    public void atribuirNota(Double nota) {
        if (nota == null) {
            throw new IllegalArgumentException("A nota não pode ser nula.");
        }

        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("A nota deve estar entre 0.0 e 10.0. Valor recebido: " + nota);
        }

        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "%s: %.2f".formatted(descricao, nota);
    }
}
