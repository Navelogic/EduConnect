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


        turma.removerAluno(aluno);
    }
}