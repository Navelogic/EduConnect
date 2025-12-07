package Fase2;

public class MainF2 {
    public static void main(String[] args) {

        CursoF2 cursoJava = new CursoF2("Java Spring Boot", "JAVA-SP", 120);
        ProfessorF2 profCarlos = new ProfessorF2("Carlos Sênior", "Arquitetura de Software", "REG-999");

        AlunoF2 a1 = new AlunoF2("Arian Weslley", "2024001", cursoJava);
        AlunoF2 a2 = new AlunoF2("Weslley Arian", "2024002", cursoJava);
        AlunoF2 a3 = new AlunoF2("ARWESLEYRANDIOAN", "2024003", cursoJava);

        TurmaF2 turmaNoite = new TurmaF2("TURMA-01-NOITE", profCarlos, cursoJava);

        turmaNoite.adicionarAluno(a1);
        turmaNoite.adicionarAluno(a2);
        turmaNoite.adicionarAluno(a3);

        turmaNoite.exibirResumo();

        turmaNoite.removerAluno(a3);

        turmaNoite.exibirResumo();
    }
}