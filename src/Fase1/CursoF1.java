package Fase1;

public class CursoF1 {
    private String nomeF1;
    private String codigoF1;
    private int cargaHorariaF1;

    public CursoF1(String nomeF1, String codigoF1, int cargaHorariaF1) {
        this.nomeF1 = nomeF1;
        this.codigoF1 = codigoF1;
        this.cargaHorariaF1 = cargaHorariaF1;
    }

    public String getNomeF1() {
        return nomeF1;
    }

    public void setNomeF1(String nomeF1) {
        this.nomeF1 = nomeF1;
    }

    public String getCodigoF1() {
        return codigoF1;
    }

    public void setCodigoF1(String codigoF1) {
        this.codigoF1 = codigoF1;
    }

    public int getCargaHorariaF1() {
        return cargaHorariaF1;
    }

    public void setCargaHorariaF1(int cargaHorariaF1) {
        this.cargaHorariaF1 = cargaHorariaF1;
    }
}
