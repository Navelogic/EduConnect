package Fase4;

public class CursoPresencialF4 extends CursoF4 {
    private String salaF4;

    public CursoPresencialF4(String nome, String codigo, int cargaHoraria, String salaF4) {
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
