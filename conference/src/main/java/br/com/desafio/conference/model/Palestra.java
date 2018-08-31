package br.com.desafio.conference.model;

/**
 * Created by user on 31/08/2018.
 */
public class Palestra {

    private String nome;
    private Long tempo;


    public Palestra(String nome, Long tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTempo() {
        return tempo;
    }

    public void setTempo(Long tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Palestra{" +
                "nome='" + nome + '\'' +
                ", tempo=" + tempo +
                '}';
    }
}
