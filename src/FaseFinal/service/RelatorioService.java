package FaseFinal.service;

import FaseFinal.model.Turma;
import FaseFinal.model.curso.Curso;
import FaseFinal.model.usuario.Administrador;
import FaseFinal.model.usuario.Aluno;
import FaseFinal.model.usuario.Professor;
import FaseFinal.model.usuario.Usuario;

public class RelatorioService {

    public void gerarRelatorioUsuario(Usuario usuario) {
        if (usuario instanceof Aluno) {
            imprimirBoletim((Aluno) usuario);
        } else if (usuario instanceof Professor) {
            imprimirDocente((Professor) usuario);
        } else if (usuario instanceof Administrador) {
            System.out.println("[ADMIN] " + usuario.getNome() + " - Acesso Total");
        }
    }

    public void gerarRelatorioCurso(Curso curso) {
        System.out.println("--- Curso: " + curso.getNome() + " ---");
        System.out.println("Código: " + curso.getCodigo());
        System.out.println("Carga: " + curso.getCargaHoraria() + "h");
        System.out.println("Modalidade: " + curso.getTipoModalidade());
        System.out.println("-----------------------------");
    }

    public void gerarRelatorioTurma(Turma turma) {
        System.out.println("\n=== Resumo da Turma: " + turma.getCodigo() + " ===");
        System.out.println("Curso: " + turma.getCurso().getNome());
        System.out.println("Professor Responsável: " + turma.getProfessor().getNome());
        System.out.println("Total de Alunos: " + turma.getListaAlunos().size());

        System.out.println("--- Lista de Presença ---");
        if (turma.getListaAlunos().isEmpty()) {
            System.out.println("(Nenhum aluno matriculado)");
        } else {
            for (Aluno a : turma.getListaAlunos()) {
                System.out.println("- " + a.getNome() + " (" + a.getMatricula() + ")");
            }
        }
        System.out.println("================================\n");
    }

    private void imprimirBoletim(Aluno aluno) {
        System.out.println("\n=== BOLETIM: " + aluno.getNome() + " ===");
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Curso: " + (aluno.getCurso() != null ? aluno.getCurso().getNome() : "N/A"));
        System.out.printf("Média: %.2f\n", aluno.calcularMedia());
        System.out.println("Situação: " + (aluno.calcularMedia() >= 7 ? "APROVADO" : "RECUPERAÇÃO"));
    }

    private void imprimirDocente(Professor prof) {
        System.out.println("\n=== DOCENTE: " + prof.getNome() + " ===");
        System.out.println("Especialidade: " + prof.getEspecialidade());
        System.out.println("Registro: " + prof.getRegistro());
    }
}