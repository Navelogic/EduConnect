package Fase4;

import java.util.ArrayList;
import java.util.List;

public class MainF4 {
    public static void main(String[] args) {

        var cursoJava = new CursoPresencialF4("Java Spring Boot", "JAVA-SP", 120, "1002");
        var cursoReact = new CursoEADF4("React Routes", "REACT-EAD", 100, "Studeo");

        List<CursoF4> listaDeCursos = new ArrayList<>();
        listaDeCursos.add(cursoJava);
        listaDeCursos.add(cursoReact);

        System.out.println(">>> Relatório Geral de Cursos <<<");

        for (CursoF4 c : listaDeCursos) {
            c.exibirDetalhes();
            System.out.println();
        }
    }
}