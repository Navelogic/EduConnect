package Fase5;

public class CursoPresencialF5 extends CursoF5 {
    private String salaF4;

    public CursoPresencialF5(String nome, String codigo, int cargaHoraria, String salaF4) {
        super(nome, codigo, cargaHoraria);
        this.salaF4 = salaF4;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Modalidade: Presencial");
        System.out.println("Sala de Aula: " + this.salaF4);
        System.out.println("-------------------------");
    }
}
