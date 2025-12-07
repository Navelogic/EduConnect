package Fase6;

public class CursoF6 implements ImprimivelF6 {
    private String nomeF4;
    private String codigoF4;
    private int cargaHorariaF4;

    public CursoF6(String nomeF4, String codigoF4, int cargaHorariaF4) {
        this.nomeF4 = nomeF4;
        this.codigoF4 = codigoF4;
        this.cargaHorariaF4 = cargaHorariaF4;
    }

    public void exibirDetalhes() {
        System.out.println("--- Detalhes do Curso ---");
        System.out.println("Nome: " + this.nomeF4);
        System.out.println("Código: " + this.codigoF4);
        System.out.println("Carga Horária: " + this.cargaHorariaF4 + "h");
    }

    @Override
    public void gerarRelatorio() {
        this.exibirDetalhes();
    }

    public String getNomeF4() {
        return nomeF4;
    }

    public void setNomeF4(String nomeF4) {
        this.nomeF4 = nomeF4;
    }

    public String getCodigoF4() {
        return codigoF4;
    }

    public void setCodigoF4(String codigoF4) {
        this.codigoF4 = codigoF4;
    }

    public int getCargaHorariaF4() {
        return cargaHorariaF4;
    }

    public void setCargaHorariaF4(int cargaHorariaF4) {
        this.cargaHorariaF4 = cargaHorariaF4;
    }
}
