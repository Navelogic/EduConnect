package Fase7.repository;

import Fase7.model.curso.CursoF7;
import Fase7.model.usuario.UsuarioF7;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosF7 {
    private static List<UsuarioF7> usuarios = new ArrayList<>();
    private static List<CursoF7> cursos = new ArrayList<>();

    public static void adicionarUsuario(UsuarioF7 usuario) {
        usuarios.add(usuario);
    }

    public static void adicionarCurso(CursoF7 curso) {
        cursos.add(curso);
    }

    public static List<UsuarioF7> getUsuarios() {
        return usuarios;
    }

    public static List<CursoF7> getCursos() {
        return cursos;
    }
}
