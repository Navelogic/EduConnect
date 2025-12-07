package model.Usuario;

import model.Avaliacao;
import model.Curso.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Aluno extends Usuario{
    private Curso curso;

    private final List<Avaliacao> avaliacoes = new ArrayList<>();

    public Aluno(String nome, String registro, String login, String senha) {
        super(nome, registro, login, senha);
    }

    public void adicionarAvaliacao(Avaliacao avaliacao) {
        if (avaliacao != null) {
            this.avaliacoes.add(avaliacao);
        } else {
            System.err.println("Tentativa de adicionar avaliação nula ignorada.");
        }
    }

    public List<Avaliacao> getAvaliacoes() {
        return Collections.unmodifiableList(avaliacoes);
    }

    public double calcularMedia() {
        if (avaliacoes.isEmpty()) return 0.0;

        double soma = avaliacoes.stream()
                .mapToDouble(Avaliacao::getNota)
                .sum();

        return soma / avaliacoes.size();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
