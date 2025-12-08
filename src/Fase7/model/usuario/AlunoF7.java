package Fase7.model.usuario;


import Fase7.model.AvaliacaoF7;
import Fase7.model.curso.CursoF7;

import java.util.ArrayList;
import java.util.List;

public class AlunoF7 extends UsuarioF7 {
    private String matricula;
    private CursoF7 curso;
    private List<AvaliacaoF7> avaliacoes;

    public AlunoF7(String nome, String login, String senha, String matricula, CursoF7 curso) {
        super(nome, login, senha);
        this.matricula = matricula;
        this.curso = curso;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(AvaliacaoF7 avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public double calcularMedia() {
        if (avaliacoes.isEmpty()) return 0.0;
        double soma = 0;
        for (AvaliacaoF7 a : avaliacoes) {
            soma += a.getNota();
        }
        return soma / avaliacoes.size();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public CursoF7 getCurso() {
        return curso;
    }

    public void setCurso(CursoF7 curso) {
        this.curso = curso;
    }

    public List<AvaliacaoF7> getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(List<AvaliacaoF7> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}