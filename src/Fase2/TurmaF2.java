package Fase2;

import java.util.ArrayList;
import java.util.List;

public class TurmaF2 {
    private String codigoF2;
    private ProfessorF2 professorF2;
    private CursoF2 cursoF2;
    private List<AlunoF2> listaAlunosF2;

    public TurmaF2(String codigoF2, ProfessorF2 professorF2, CursoF2 cursoF2) {
        this.codigoF2 = codigoF2;
        this.professorF2 = professorF2;
        this.cursoF2 = cursoF2;
        this.listaAlunosF2 = new ArrayList<>();
    }

    public void adicionarAluno(AlunoF2 aluno) {
        if (aluno != null) {
            this.listaAlunosF2.add(aluno);
            System.out.println("Aluno " + aluno.getNomeF2() + " adicionado à turma " + this.codigoF2);
        } else {
            System.out.println("Erro: Tentativa de adicionar aluno inválido.");
        }
    }

    public void removerAluno(AlunoF2 aluno) {
        if (this.listaAlunosF2.remove(aluno)) {
            System.out.println("Aluno " + aluno.getNomeF2() + " removido.");
        } else {
            System.out.println("Aluno não encontrado nesta turma.");
        }
    }

    public void exibirResumo() {
        System.out.println("\n=== Resumo da Turma: " + this.codigoF2 + " ===");

        System.out.println("Curso: " + this.cursoF2.getNomeF2());
        System.out.println("Professor Responsável: " + this.professorF2.getNomeF2());
        System.out.println("Total de Alunos: " + this.listaAlunosF2.size());

        System.out.println("--- Lista de Presença ---");
        if (listaAlunosF2.isEmpty()) {
            System.out.println("(Nenhum aluno matriculado)");
        } else {
            for (AlunoF2 a : listaAlunosF2) {
                System.out.println("- " + a.getNomeF2() + " (" + a.getMatriculaF2() + ")");
            }
        }
        System.out.println("================================\n");
    }

    public String getCodigoF2() {
        return codigoF2;
    }

    public void setCodigoF2(String codigoF2) {
        this.codigoF2 = codigoF2;
    }

    public ProfessorF2 getProfessorF2() {
        return professorF2;
    }

    public void setProfessorF2(ProfessorF2 professorF2) {
        this.professorF2 = professorF2;
    }

    public CursoF2 getCursoF2() {
        return cursoF2;
    }

    public void setCursoF2(CursoF2 cursoF2) {
        this.cursoF2 = cursoF2;
    }

    public List<AlunoF2> getListaAlunosF2() {
        return listaAlunosF2;
    }

    public void setListaAlunosF2(List<AlunoF2> listaAlunosF2) {
        this.listaAlunosF2 = listaAlunosF2;
    }
}
