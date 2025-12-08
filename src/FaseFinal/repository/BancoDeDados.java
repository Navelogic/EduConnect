package FaseFinal.repository;

import FaseFinal.model.Turma;
import FaseFinal.model.curso.Curso;
import FaseFinal.model.usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private static List<Usuario> usuarios = new ArrayList<>();
    private static List<Curso> cursos = new ArrayList<>();
    private static List<Turma> turmas = new ArrayList<>();

    public static void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void adicionarCurso(Curso curso) {
        cursos.add(curso);
    }

    public static void adicionarTurma(Turma turma) {
        turmas.add(turma);
    }

    public static List<Usuario> getUsuarios() { return usuarios; }
    public static List<Curso> getCursos() { return cursos; }
    public static List<Turma> getTurmas() { return turmas; }

    public static Usuario buscarUsuario(String login) {
        return usuarios.stream().filter(u -> u.getLogin().equals(login)).findFirst().orElse(null);
    }

    public static Usuario buscarUsuarioPorNome(String nome) {
        return usuarios.stream().filter(u -> u.getNome().equalsIgnoreCase(nome)).findFirst().orElse(null);
    }

    public static Curso buscarCurso(String codigo) {
        return cursos.stream().filter(c -> c.getCodigo().equalsIgnoreCase(codigo)).findFirst().orElse(null);
    }

    public static Turma buscarTurma(String codigo) {
        return turmas.stream().filter(t -> t.getCodigo().equalsIgnoreCase(codigo)).findFirst().orElse(null);
    }
}