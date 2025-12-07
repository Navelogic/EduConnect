import model.Avaliacao;
import model.Curso;
import model.Turma;
import model.Usuario.Aluno;
import model.Usuario.Professor;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Navelogic", "A1");
        Professor professor = new Professor("Nathan", "P1", "Java 21");
        Curso curso = new Curso("POO", "T1", 12);
        Turma turma = new Turma("T1", professor, curso);

        turma.adicionarAluno(aluno);


        System.out.println(turma.exibirResumo());

        System.out.println("\n--- Iniciando Ciclo de Avaliações ---");

        try {
            var prova1 = new Avaliacao("Prova 1", 8.5);
            var trabalho = new Avaliacao("Trabalho Final", 9.0);

            aluno.adicionarAvaliacao(prova1);
            aluno.adicionarAvaliacao(trabalho);

            System.out.println("Notas do aluno " + aluno.getNome() + ":");
            aluno.getAvaliacoes().forEach(System.out::println);

            System.out.printf("Média atual: %.2f%n", aluno.calcularMedia());

            System.out.println("\nTentando atribuir nota inválida...");
            var provaInvalida = new Avaliacao("Prova Hacker", 15.0); // Erro aqui

        } catch (IllegalArgumentException e) {
            // Captura o erro tratado na classe Avaliacao
            System.err.println("ERRO DE VALIDAÇÃO: " + e.getMessage());
        }
    }
}