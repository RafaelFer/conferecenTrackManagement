package br.com.desafio.conference.bo;

/**
 * Created by user on 31/08/2018.
 */
public class Palestra implements Comparable<Palestra>{

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

    @Override
    public int compareTo(Palestra o) {
        return this.tempo.compareTo(o.getTempo());
    }
}
