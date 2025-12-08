package Fase7.model;

import Fase7.model.curso.CursoF7;
import Fase7.model.usuario.AlunoF7;
import Fase7.model.usuario.ProfessorF7;

import java.util.ArrayList;
import java.util.List;

public class TurmaF7 {
    private String codigo;
    private ProfessorF7 professor;
    private CursoF7 curso;
    private List<AlunoF7> listaAlunos;

    public TurmaF7(String codigo, ProfessorF7 professor, CursoF7 curso) {
        this.codigo = codigo;
        this.professor = professor;
        this.curso = curso;
        this.listaAlunos = new ArrayList<>();
    }

    public boolean adicionarAluno(AlunoF7 aluno) {
        if (aluno != null) {
            this.listaAlunos.add(aluno);
            return true;
        }
        return false;
    }

    public boolean removerAluno(AlunoF7 aluno) {
        return this.listaAlunos.remove(aluno);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ProfessorF7 getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorF7 professor) {
        this.professor = professor;
    }

    public CursoF7 getCurso() {
        return curso;
    }

    public void setCurso(CursoF7 curso) {
        this.curso = curso;
    }

    public List<AlunoF7> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(List<AlunoF7> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }
}