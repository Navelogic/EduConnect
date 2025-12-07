package model.Usuario;

import model.Curso;

public class Aluno extends Usuario{
    private Curso curso;

    public Aluno(){}

    public Aluno (String nome, String registro){
        super(nome, registro);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
