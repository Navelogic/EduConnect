package Fase7.model.curso;

public class CursoEADF7 extends CursoF7 {
    private String plataforma;

    public CursoEADF7(String nome, String codigo, int cargaHoraria, String plataforma) {
        super(nome, codigo, cargaHoraria);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String getTipoModalidade() {
        return "EAD (Plataforma: " + plataforma + ")";
    }
}