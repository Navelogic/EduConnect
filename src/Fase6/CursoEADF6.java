package Fase6;

public class CursoEADF6 extends CursoF6 {
    private String plataformaF4;

    public CursoEADF6(String nome, String codigo, int cargaHoraria, String plataforma) {
        super(nome, codigo, cargaHoraria);
        this.plataformaF4 = plataforma;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Modalidade: EAD");
        System.out.println("Plataforma: " + this.plataformaF4);
        System.out.println("-------------------------");
    }
}
