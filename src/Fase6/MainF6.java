package Fase6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainF6 {
    public static void main(String[] args) {
        List<ImprimivelF6> bancoDeDados = new ArrayList<>();

        CursoPresencialF6 cursoJava = new CursoPresencialF6("Java Master", "JV-01", 100, "Lab 3");
        CursoEADF6 cursoReact = new CursoEADF6("React Front", "RC-02", 40, "Udemy");

        ProfessorF6 profGirafales = new ProfessorF6("Prof. Girafales", "girafales", "123", "Matemática", "REG-01");

        AlunoF6 alunoKiko = new AlunoF6("Kiko", "kiko", "bola", "2024-01", cursoJava);

        alunoKiko.realizarAvaliacao(new AvaliacaoF6("Prova 1", 5.0));

        AlunoF6 alunoChaves = new AlunoF6("Chaves", "chaves", "sanduiche", "2024-02", cursoReact);
        alunoChaves.realizarAvaliacao(new AvaliacaoF6("Projeto Final", 9.5));

        bancoDeDados.add(cursoJava);
        bancoDeDados.add(cursoReact);
        bancoDeDados.add(profGirafales);
        bancoDeDados.add(alunoKiko);
        bancoDeDados.add(alunoChaves);

        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- SISTEMA DE GESTÃO ACADÊMICA ---");
            System.out.println("1 - Gerar Relatório de Cursos");
            System.out.println("2 - Gerar Relatório de Pessoas (Alunos/Profs)");
            System.out.println("3 - RELATÓRIO GERAL (Imprimir Tudo)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    imprimirPorTipo(bancoDeDados, CursoF6.class);
                    break;
                case 2:
                    imprimirPorTipo(bancoDeDados, UsuarioF6.class);
                    break;
                case 3:
                    imprimirTudo(bancoDeDados);
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    public static void imprimirTudo(List<ImprimivelF6> lista) {
        System.out.println("\n>>> GERANDO RELATÓRIO COMPLETO DO SISTEMA <<<");
        for (ImprimivelF6 item : lista) {
            item.gerarRelatorio();
            try { Thread.sleep(300); } catch (InterruptedException e) {}
        }
    }


    public static void imprimirPorTipo(List<ImprimivelF6> lista, Class<?> tipo) {
        System.out.println("\n>>> Filtrando por: " + tipo.getSimpleName() + " <<<");
        for (ImprimivelF6 item : lista) {
            if (tipo.isInstance(item)) {
                item.gerarRelatorio();
            }
        }
    }
}