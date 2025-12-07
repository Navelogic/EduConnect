package Fase1;

public class MainF1 {
    public static void main(String[] args) {

        CursoF1 cursoADS = new CursoF1("Análise e Desenvolvimento de Sistemas", "ADS-2024", 2800);
        System.out.println("--- Curso Criado ---");
        System.out.println("Nome: " + cursoADS.getNomeF1());
        System.out.println("Código: " + cursoADS.getCodigoF1());
        System.out.println("Carga Horária: " + cursoADS.getCargaHorariaF1() + " horas");
        System.out.println("--------------------\n");

        ProfessorF1 profAna = new ProfessorF1("Ana Clara", "Estrutura de Dados e Algoritmos", "PRF-456");
        System.out.println("--- Professor Criado ---");
        System.out.println("Nome: " + profAna.getNomeF1());
        System.out.println("Especialidade: " + profAna.getEspecialidadeF1());
        System.out.println("Registro: " + profAna.getRegistroF1());
        System.out.println("------------------------\n");

        AlunoF1 alunoPedro = new AlunoF1("Pedro Silva", "MAT-1001", cursoADS.getNomeF1());
        System.out.println("--- Aluno Criado ---");
        System.out.println("Nome: " + alunoPedro.getNomeF1());
        System.out.println("Matrícula: " + alunoPedro.getMatriculaF1());
        System.out.println("Curso: " + alunoPedro.getCursoF1());
        System.out.println("--------------------");
    }
}