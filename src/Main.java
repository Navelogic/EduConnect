import model.Usuario.Aluno;
import model.Usuario.Professor;

public class Main {
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        Professor professor = new Professor();

        aluno.setNome("Navelogic");
        aluno.setRegistro("A1");

        professor.setNome("Nathan");
        professor.setRegistro("P1");

        System.out.println(aluno.getNome());
        System.out.println(professor.getNome());

    }
}