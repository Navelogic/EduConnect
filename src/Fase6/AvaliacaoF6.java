package Fase6;

public class AvaliacaoF6 {
    private String descricaoF4;
    private double notaF4;

    public AvaliacaoF6(String descricaoF4, double notaF4) {
        this.descricaoF4 = descricaoF4;
        atribuirNota(notaF4);
    }

    public boolean atribuirNota(double valor) {
        if (valor < 0 || valor > 10) {
            System.out.println("ERRO: A nota deve ser entre 0 e 10. Valor tentado: " + valor);
            return false;
        }
        this.notaF4 = valor;
        return true;
    }

    public String getDescricaoF4() {
        return descricaoF4;
    }

    public void setDescricaoF4(String descricaoF4) {
        this.descricaoF4 = descricaoF4;
    }

    public double getNotaF4() {
        return notaF4;
    }

    public void setNotaF4(double notaF4) {
        this.notaF4 = notaF4;
    }
}
