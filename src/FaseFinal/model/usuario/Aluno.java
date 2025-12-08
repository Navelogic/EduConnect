package FaseFinal.model.usuario;

import FaseFinal.model.Avaliacao;
import FaseFinal.model.curso.Curso;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Usuario {
    private String matricula;
    private Curso curso;
    private List<Avaliacao> avaliacoes;

    public Aluno(String nome, String login, String senha, String matricula, Curso curso) {
        super(nome, login, senha);
        this.matricula = matricula;
        this.curso = curso;
        this.avaliacoes = new ArrayList<>();
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        this.avaliacoes.add(avaliacao);
    }

    public double calcularMedia() {
        if (avaliacoes.isEmpty()) return 0.0;
        double soma = 0;
        for (Avaliacao a : avaliacoes) {
            soma += a.getNota();
        }
        return soma / avaliacoes.size();
    }

    // Getters
    public String getMatricula() { return matricula; }
    public Curso getCurso() { return curso; }
    public List<Avaliacao> getAvaliacoes() { return avaliacoes; }
}