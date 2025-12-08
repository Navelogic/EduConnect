package FaseFinal;

import FaseFinal.model.Avaliacao;
import FaseFinal.model.Turma;
import FaseFinal.model.curso.CursoEAD;
import FaseFinal.model.curso.Curso;
import FaseFinal.model.curso.CursoPresencial;
import FaseFinal.model.usuario.Administrador;
import FaseFinal.model.usuario.Aluno;
import FaseFinal.model.usuario.Professor;
import FaseFinal.repository.BancoDeDados;
import FaseFinal.ui.MenuPrincipal;

public class Main {
    public static void main(String[] args) {
        inicializarSistema();

        MenuPrincipal menu = new MenuPrincipal();
        menu.iniciar();
    }

    private static void inicializarSistema() {
        Curso c1 = new CursoPresencial("Java Pro", "JAVA-01", 120, "Lab 5");
        Curso c2 = new CursoEAD("Arquitetura Cloud", "CLOUD-02", 80, "AWS Academy");
        BancoDeDados.adicionarCurso(c1);
        BancoDeDados.adicionarCurso(c2);

        Administrador admin = new Administrador("Admin Geral", "admin", "admin123");
        Professor prof = new Professor("Mestre Yoda", "yoda", "force", "Jedi Training", "REG-01");
        BancoDeDados.adicionarUsuario(admin);
        BancoDeDados.adicionarUsuario(prof);

        Aluno aluno = new Aluno("Luke Skywalker", "luke", "123", "A-001", c1);
        aluno.adicionarAvaliacao(new Avaliacao("Treino de Sabre", 9.5));
        aluno.adicionarAvaliacao(new Avaliacao("Uso da Força", 8.0));
        BancoDeDados.adicionarUsuario(aluno);

        Turma turmaJedi = new Turma("TURMA-JEDI-2025", prof, c1);
        turmaJedi.adicionarAluno(aluno);
        BancoDeDados.adicionarTurma(turmaJedi);
    }
}