package model.Curso;

public class CursoPresencial extends Curso {
    private String sala;

    public CursoPresencial(String nome, String codigo, Integer cargaHoraria, String sala) {
        super(nome, codigo, cargaHoraria);
        this.sala = sala;
    }

    @Override
    public String detalharCurso() {
        return "%s | Modalidade: Presencial | Sala: %s"
                .formatted(super.detalharCurso(), this.sala);
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
