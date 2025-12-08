package Fase7.ui;

import Fase7.model.curso.CursoF7;
import Fase7.model.usuario.UsuarioF7;
import Fase7.repository.BancoDeDadosF7;
import Fase7.service.AutenticacaoServiceF7;
import Fase7.service.RelatorioServiceF7;

import java.util.Scanner;

public class MenuPrincipalF7 {

    private Scanner scanner = new Scanner(System.in);
    private AutenticacaoServiceF7 authService = new AutenticacaoServiceF7();
    private RelatorioServiceF7 relatorioService = new RelatorioServiceF7();

    public void iniciar() {
        System.out.println("=== BEM-VINDO AO SISTEMA FASE 7 ===");
        UsuarioF7 usuarioLogado = null;

        while (usuarioLogado == null) {
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            usuarioLogado = authService.login(login, senha);

            if (usuarioLogado == null) {
                System.out.println("❌ Credenciais inválidas. Tente novamente.");
            }
        }

        System.out.println("✅ Olá, " + usuarioLogado.getNome() + "!");
        exibirMenuOpcoes();
    }

    private void exibirMenuOpcoes() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n1. Relatório de Cursos");
            System.out.println("2. Relatório de Pessoas");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    System.out.println("\n--- LISTA DE CURSOS ---");
                    for (CursoF7 c : BancoDeDadosF7.getCursos()) {
                        relatorioService.gerarRelatorioCurso(c);
                    }
                    break;
                case 2:
                    System.out.println("\n--- LISTA DE USUÁRIOS ---");
                    for (UsuarioF7 u : BancoDeDadosF7.getUsuarios()) {
                        relatorioService.gerarRelatorioUsuario(u);
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
