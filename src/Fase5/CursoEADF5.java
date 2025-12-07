package Fase5;

public class CursoEADF5 extends CursoF5 {
    private String plataformaF4;

    public CursoEADF5(String nome, String codigo, int cargaHoraria, String plataforma) {
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
