package Fase4;

import java.util.ArrayList;
import java.util.List;

public class TurmaF4 {
    private String codigoF4;
    private ProfessorF4 professorF4;
    private CursoF4 cursoF4;
    private List<AlunoF4> listaAlunosF4;

    public TurmaF4(String codigoF4, ProfessorF4 professorF4, CursoF4 cursoF4) {
        this.codigoF4 = codigoF4;
        this.professorF4 = professorF4;
        this.cursoF4 = cursoF4;
        this.listaAlunosF4 = new ArrayList<>();
    }

    public void adicionarAluno(AlunoF4 aluno) {
        if (aluno != null) {
            this.listaAlunosF4.add(aluno);
            System.out.println("Aluno " + aluno.getNomeF4() + " adicionado à turma " + this.codigoF4);
        } else {
            System.out.println("Erro: Tentativa de adicionar aluno inválido.");
        }
    }

    public void removerAluno(AlunoF4 aluno) {
        if (this.listaAlunosF4.remove(aluno)) {
            System.out.println("Aluno " + aluno.getNomeF4() + " removido.");
        } else {
            System.out.println("Aluno não encontrado nesta turma.");
        }
    }

    public void exibirResumo() {
        System.out.println("\n=== Resumo da Turma: " + this.codigoF4 + " ===");

        System.out.println("Curso: " + this.cursoF4.getNomeF4());
        System.out.println("Professor Responsável: " + this.professorF4.getNomeF4());
        System.out.println("Total de Alunos: " + this.listaAlunosF4.size());

        System.out.println("--- Lista de Presença ---");
        if (listaAlunosF4.isEmpty()) {
            System.out.println("(Nenhum aluno matriculado)");
        } else {
            for (AlunoF4 a : listaAlunosF4) {
                System.out.println("- " + a.getNomeF4() + " (" + a.getMatriculaF4() + ")");
            }
        }
        System.out.println("================================\n");
    }

    public String getCodigoF4() {
        return codigoF4;
    }

    public void setCodigoF4(String codigoF4) {
        this.codigoF4 = codigoF4;
    }

    public ProfessorF4 getProfessorF4() {
        return professorF4;
    }

    public void setProfessorF4(ProfessorF4 professorF4) {
        this.professorF4 = professorF4;
    }

    public CursoF4 getCursoF4() {
        return cursoF4;
    }

    public void setCursoF4(CursoF4 cursoF4) {
        this.cursoF4 = cursoF4;
    }

    public List<AlunoF4> getListaAlunosF4() {
        return listaAlunosF4;
    }

    public void setListaAlunosF4(List<AlunoF4> listaAlunosF4) {
        this.listaAlunosF4 = listaAlunosF4;
    }
}
