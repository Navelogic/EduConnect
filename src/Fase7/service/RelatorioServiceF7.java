package Fase7.service;

import Fase7.model.TurmaF7;
import Fase7.model.curso.CursoF7;
import Fase7.model.usuario.AdministradorF7;
import Fase7.model.usuario.AlunoF7;
import Fase7.model.usuario.ProfessorF7;
import Fase7.model.usuario.UsuarioF7;

public class RelatorioServiceF7 {

    public void gerarRelatorioUsuario(UsuarioF7 usuario) {
        if (usuario instanceof AlunoF7) {
            imprimirBoletim((AlunoF7) usuario);
        } else if (usuario instanceof ProfessorF7) {
            imprimirDocente((ProfessorF7) usuario);
        } else if (usuario instanceof AdministradorF7) {
            System.out.println("[ADMIN] " + usuario.getNome() + " - Acesso Total");
        }
    }

    public void gerarRelatorioCurso(CursoF7 curso) {
        System.out.println("--- Curso: " + curso.getNome() + " ---");
        System.out.println("Código: " + curso.getCodigo());
        System.out.println("Carga: " + curso.getCargaHoraria() + "h");
        System.out.println("Modalidade: " + curso.getTipoModalidade());
        System.out.println("-----------------------------");
    }

    public void gerarRelatorioTurma(TurmaF7 turma) {
        System.out.println("\n=== Resumo da Turma: " + turma.getCodigo() + " ===");
        System.out.println("Curso: " + turma.getCurso().getNome());
        System.out.println("Professor Responsável: " + turma.getProfessor().getNome());
        System.out.println("Total de Alunos: " + turma.getListaAlunos().size());

        System.out.println("--- Lista de Presença ---");
        if (turma.getListaAlunos().isEmpty()) {
            System.out.println("(Nenhum aluno matriculado)");
        } else {
            for (AlunoF7 a : turma.getListaAlunos()) {
                System.out.println("- " + a.getNome() + " (" + a.getMatricula() + ")");
            }
        }
        System.out.println("================================\n");
    }

    private void imprimirBoletim(AlunoF7 aluno) {
        System.out.println("\n=== BOLETIM: " + aluno.getNome() + " ===");
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + (aluno.getCurso() != null ? aluno.getCurso().getNome() : "N/A"));
        System.out.printf("Média: %.2f\n", aluno.calcularMedia());
        System.out.println("Situação: " + (aluno.calcularMedia() >= 7 ? "APROVADO" : "RECUPERAÇÃO"));
    }

    private void imprimirDocente(ProfessorF7 prof) {
        System.out.println("\n=== DOCENTE: " + prof.getNome() + " ===");
        System.out.println("Especialidade: " + prof.getEspecialidade());
        System.out.println("Registro: " + prof.getRegistro());
    }
}
