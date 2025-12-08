package FaseFinal.ui;

import FaseFinal.model.Avaliacao;
import FaseFinal.model.Turma;
import FaseFinal.model.curso.Curso;
import FaseFinal.model.curso.CursoEAD;
import FaseFinal.model.curso.CursoPresencial;
import FaseFinal.model.usuario.Aluno;
import FaseFinal.model.usuario.Professor;
import FaseFinal.model.usuario.Usuario;
import FaseFinal.repository.BancoDeDados;
import FaseFinal.service.AutenticacaoService;
import FaseFinal.service.RelatorioService;

import java.util.Scanner;

public class MenuPrincipal {
    private Scanner scanner = new Scanner(System.in);
    private AutenticacaoService authService = new AutenticacaoService();
    private RelatorioService relatorioService = new RelatorioService();

    public void iniciar() {
        System.out.println("=== SISTEMA EDUCACIONAL CONSOLIDADO (FASE FINAL) ===");

        if (realizarLogin()) {
            exibirMenuPrincipal();
        }
    }

    private boolean realizarLogin() {
        System.out.println("--- Autenticação ---");
        while (true) {
            System.out.print("Login: ");
            String login = scanner.nextLine();
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            Usuario u = authService.login(login, senha);
            if (u != null) {
                System.out.println("✅ Bem-vindo(a), " + u.getNome() + "!");
                return true;
            }
            System.out.println("❌ Credenciais inválidas.");
        }
    }

    private void exibirMenuPrincipal() {
        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- MENU GESTOR ---");
            System.out.println("1. Cadastros (Pessoas/Cursos)");
            System.out.println("2. Gestão de Turmas (Criar/Matricular)");
            System.out.println("3. Acadêmico (Lançar Notas)");
            System.out.println("4. Relatórios Gerais");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) { opcao = -1; }

            switch (opcao) {
                case 1: menuCadastros(); break;
                case 2: menuTurmas(); break;
                case 3: menuNotas(); break;
                case 4: menuRelatorios(); break;
                case 0: System.out.println("Encerrando..."); break;
                default: System.out.println("Opção inválida.");
            }
        }
    }

    private void menuCadastros() {
        System.out.println("\n[1] Novo Aluno | [2] Novo Professor | [3] Novo Curso");
        System.out.print("Opção: ");
        String op = scanner.nextLine();

        if (op.equals("1")) cadastrarAluno();
        else if (op.equals("2")) cadastrarProfessor();
        else if (op.equals("3")) cadastrarCurso();
    }

    private void cadastrarAluno() {
        System.out.print("Nome: "); String nome = scanner.nextLine();
        System.out.print("Login: "); String login = scanner.nextLine();
        System.out.print("Senha: "); String senha = scanner.nextLine();
        System.out.print("Matrícula: "); String mat = scanner.nextLine();
        BancoDeDados.adicionarUsuario(new Aluno(nome, login, senha, mat, null));
        System.out.println("Aluno cadastrado!");
    }

    private void cadastrarProfessor() {
        System.out.print("Nome: "); String nome = scanner.nextLine();
        System.out.print("Login: "); String login = scanner.nextLine();
        System.out.print("Senha: "); String senha = scanner.nextLine();
        System.out.print("Especialidade: "); String esp = scanner.nextLine();
        BancoDeDados.adicionarUsuario(new Professor(nome, login, senha, esp, "REG-"+System.currentTimeMillis()));
        System.out.println("Professor cadastrado!");
    }

    private void cadastrarCurso() {
        System.out.print("Nome: "); String nome = scanner.nextLine();
        System.out.print("Código: "); String cod = scanner.nextLine();
        System.out.print("Carga Horária: "); int ch = Integer.parseInt(scanner.nextLine());
        System.out.print("Tipo [1] Presencial [2] EAD: "); String tipo = scanner.nextLine();

        if (tipo.equals("1")) {
            System.out.print("Sala: ");
            BancoDeDados.adicionarCurso(new CursoPresencial(nome, cod, ch, scanner.nextLine()));
        } else {
            System.out.print("Plataforma: ");
            BancoDeDados.adicionarCurso(new CursoEAD(nome, cod, ch, scanner.nextLine()));
        }
        System.out.println("Curso cadastrado!");
    }

    private void menuTurmas() {
        System.out.println("\n[1] Criar Nova Turma | [2] Matricular Aluno");
        String op = scanner.nextLine();

        if (op.equals("1")) {
            System.out.print("Código da Turma: "); String codTurma = scanner.nextLine();

            System.out.print("Código do Curso: "); String codCurso = scanner.nextLine();
            Curso curso = BancoDeDados.buscarCurso(codCurso);

            System.out.print("Nome do Professor: "); String nomeProf = scanner.nextLine();
            Usuario user = BancoDeDados.buscarUsuarioPorNome(nomeProf);

            if (curso != null && user instanceof Professor) {
                BancoDeDados.adicionarTurma(new Turma(codTurma, (Professor) user, curso));
                System.out.println("Turma criada com sucesso!");
            } else {
                System.out.println("Erro: Curso ou Professor não encontrados.");
            }

        } else if (op.equals("2")) {
            System.out.print("Código da Turma: "); String codTurma = scanner.nextLine();
            Turma turma = BancoDeDados.buscarTurma(codTurma);

            System.out.print("Nome do Aluno: "); String nomeAluno = scanner.nextLine();
            Usuario user = BancoDeDados.buscarUsuarioPorNome(nomeAluno);

            if (turma != null && user instanceof Aluno) {
                Aluno aluno = (Aluno) user;
                turma.adicionarAluno(aluno);
                System.out.println("Matrícula realizada na turma " + codTurma);
            } else {
                System.out.println("Erro: Turma ou Aluno inválidos.");
            }
        }
    }

    private void menuNotas() {
        System.out.print("Nome do Aluno para avaliar: ");
        Usuario user = BancoDeDados.buscarUsuarioPorNome(scanner.nextLine());

        if (user instanceof Aluno) {
            Aluno aluno = (Aluno) user;
            System.out.print("Descrição da Avaliação: "); String desc = scanner.nextLine();
            System.out.print("Nota (0-10): "); double nota = Double.parseDouble(scanner.nextLine());

            aluno.adicionarAvaliacao(new Avaliacao(desc, nota));
            System.out.println("Nota registrada.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }

    private void menuRelatorios() {
        System.out.println("\n--- RELATÓRIOS ---");
        System.out.println("Turmas Ativas:");
        for (Turma t : BancoDeDados.getTurmas()) {
            relatorioService.gerarRelatorioTurma(t);
        }

        System.out.println("Alunos e Desempenho:");
        for (Usuario u : BancoDeDados.getUsuarios()) {
            if (u instanceof Aluno) relatorioService.gerarRelatorioUsuario(u);
        }
    }
}