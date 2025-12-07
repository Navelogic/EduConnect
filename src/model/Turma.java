package model;

import model.Usuario.Aluno;
import model.Usuario.Professor;

import java.util.ArrayList;
import java.util.List;


public class Turma {
    private String registro;
    private Professor professor;
    private Curso curso;

    private final List<Aluno> listaAlunos = new ArrayList<>();

    public Turma () {}

    public Turma(String registro, Professor professor, Curso curso){
        this.registro = registro;
        this.professor = professor;
        this.curso = curso;
    }

    public void adicionarAluno(Aluno aluno){
        if (aluno == null) {
            throw new IllegalArgumentException("Não existe aluno!");
        }

        if (!listaAlunos.contains(aluno)){
            listaAlunos.add(aluno);
            System.out.printf("Aluno %s matriculado na turma %s.%n", aluno.getNome(), this.registro);
        } else {
            System.out.println("Aluno já matriculado na turma!");
        }
    }

    public void removerAluno(Aluno aluno){
        if (listaAlunos.remove(aluno)){
            System.out.printf("Aluno %s removido da turma %s.%n", aluno.getNome(), this.registro);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    public String exibirResumo() {
        return """
                
                === RESUMO DA TURMA ===
                Registro: %s
                Curso: %s (Carga Horária: %dh)
                Professor Regente: %s
                Quantidade de Alunos: %d
                =======================
                """.formatted(
                this.registro,
                this.curso.getNome(),
                this.curso.getCargaHoraria(),
                this.professor.getNome(),
                this.listaAlunos.size()
        );
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Aluno> getListaAlunos() {
        return listaAlunos;
    }
}
