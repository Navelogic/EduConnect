package Fase6;

public class CursoPresencialF6 extends CursoF6 {
    private String salaF4;

    public CursoPresencialF6(String nome, String codigo, int cargaHoraria, String salaF4) {
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
