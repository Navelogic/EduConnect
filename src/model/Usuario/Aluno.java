package model.Usuario;

import model.Curso;

public class Aluno extends Usuario{
    private Curso curso;

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
