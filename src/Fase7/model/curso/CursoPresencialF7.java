package Fase7.model.curso;

public class CursoPresencialF7 extends CursoF7 {
    private String sala;

    public CursoPresencialF7(String nome, String codigo, int cargaHoraria, String sala) {
        super(nome, codigo, cargaHoraria);
        this.sala = sala;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String getTipoModalidade() {
        return "Presencial (Sala: " + sala + ")";
    }
}