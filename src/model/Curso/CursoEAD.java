package model.Curso;

public class CursoEAD extends Curso {
    private String plataforma;

    public CursoEAD(String nome, String codigo, Integer cargaHoraria, String plataforma) {
        super(nome, codigo, cargaHoraria);
        this.plataforma = plataforma;
    }

    @Override
    public String detalharCurso() {
        return "%s | Modalidade: EAD | Plataforma: %s"
                .formatted(super.detalharCurso(), this.plataforma);
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }
}
