package model;

public class Curso {
    private String nome;
    private String registro;
    private Integer cargaHoraria;

    public Curso() {}

    public Curso(String nome, String registro, Integer cargaHoraria) {
        this.nome = nome;
        this.registro = registro;
        this.cargaHoraria = cargaHoraria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
