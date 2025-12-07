package Fase2;

public class AlunoF2 {
    private String nomeF2;
    private String matriculaF2;
    private CursoF2 cursoF2;

    public AlunoF2(String nomeF2, String matriculaF2, CursoF2 cursoF2) {
        this.nomeF2 = nomeF2;
        this.matriculaF2 = matriculaF2;
        this.cursoF2 = cursoF2;
    }

    public String getNomeF2() {
        return nomeF2;
    }

    public void setNomeF2(String nomeF2) {
        this.nomeF2 = nomeF2;
    }

    public String getMatriculaF2() {
        return matriculaF2;
    }

    public void setMatriculaF2(String matriculaF2) {
        this.matriculaF2 = matriculaF2;
    }

    public CursoF2 getCursoF2() {
        return cursoF2;
    }

    public void setCursoF2(CursoF2 cursoF2) {
        this.cursoF2 = cursoF2;
    }
}
