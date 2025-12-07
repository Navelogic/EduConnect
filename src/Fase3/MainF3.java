package Fase3;

public class MainF3 {
    public static void main(String[] args) {

        CursoF3 cursoJava = new CursoF3("Java Spring Boot", "JAVA-SP", 120);
        ProfessorF3 profCarlos = new ProfessorF3("Carlos Sênior", "Arquitetura de Software", "REG-999");

        AlunoF3 a1 = new AlunoF3("Navelogic", "2024001", cursoJava);

        TurmaF3 turmaNoite = new TurmaF3("TURMA-01-NOITE", profCarlos, cursoJava);

        AvaliacaoF3 prova1 = new AvaliacaoF3("Spring Basics");
        AvaliacaoF3 prova2 = new AvaliacaoF3("Autowired");

        System.out.println("--- Lançamento de Notas ---");

        prova1.atribuirNota(8.5);
        System.out.println("Nota 1 atribuída com sucesso.");

        System.out.println("Tentando lançar nota 15.0...");
        boolean sucesso = prova2.atribuirNota(15.0);

        if (!sucesso) {
            System.out.println("Corrigindo nota...");
            prova2.atribuirNota(9.0);
        }

        a1.realizarAvaliacao(prova1);
        a1.realizarAvaliacao(prova2);

        System.out.println("\n--- Resultado Final ---");
        a1.exibirBoletim();
    }
}