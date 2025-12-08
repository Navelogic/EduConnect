package Fase7;

import Fase7.model.AvaliacaoF7;
import Fase7.model.curso.CursoEADF7;
import Fase7.model.curso.CursoF7;
import Fase7.model.curso.CursoPresencialF7;
import Fase7.model.usuario.AdministradorF7;
import Fase7.model.usuario.AlunoF7;
import Fase7.model.usuario.ProfessorF7;
import Fase7.repository.BancoDeDadosF7;
import Fase7.ui.MenuPrincipalF7;

public class MainF7 {
    public static void main(String[] args) {
        inicializarSistema();

        MenuPrincipalF7 menu = new MenuPrincipalF7();
        menu.iniciar();
    }

    private static void inicializarSistema() {
        CursoF7 c1 = new CursoPresencialF7("Java Pro", "JAVA-01", 120, "Lab 5");
        CursoF7 c2 = new CursoEADF7("Arquitetura Cloud", "CLOUD-02", 80, "AWS Academy");
        BancoDeDadosF7.adicionarCurso(c1);
        BancoDeDadosF7.adicionarCurso(c2);

        AdministradorF7 admin = new AdministradorF7("Admin Geral", "admin", "admin123");
        ProfessorF7 prof = new ProfessorF7("Mestre Yoda", "yoda", "force", "Jedi Training", "REG-01");

        AlunoF7 aluno = new AlunoF7("Luke Skywalker", "luke", "123", "A-001", c1);
        aluno.adicionarAvaliacao(new AvaliacaoF7("Treino de Sabre", 9.5));
        aluno.adicionarAvaliacao(new AvaliacaoF7("Uso da Força", 8.0));

        BancoDeDadosF7.adicionarUsuario(admin);
        BancoDeDadosF7.adicionarUsuario(prof);
        BancoDeDadosF7.adicionarUsuario(aluno);
    }
}