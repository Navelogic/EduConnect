package Fase3;

public class AvaliacaoF3 {
    private String descricaoF3;
    private double notaF3;

    public AvaliacaoF3(String descricaoF3) {
        this.descricaoF3 = descricaoF3;
        this.notaF3 = 0.0;
    }

    public boolean atribuirNota(double valor) {
        if (valor < 0 || valor > 10) {
            System.out.println("ERRO: A nota deve ser entre 0 e 10. Valor tentado: " + valor);
            return false;
        }
        this.notaF3 = valor;
        return true;
    }

    public String getDescricaoF3() {
        return descricaoF3;
    }

    public void setDescricaoF3(String descricaoF3) {
        this.descricaoF3 = descricaoF3;
    }

    public double getNotaF3() {
        return notaF3;
    }

    public void setNotaF3(double notaF3) {
        this.notaF3 = notaF3;
    }
}
