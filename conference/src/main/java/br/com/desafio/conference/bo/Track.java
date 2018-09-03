package br.com.desafio.conference.bo;

import java.time.LocalTime;

/**
 * Created by user on 02/09/2018.
 */
public class Track {

    private String nome;
    private LocalTime time;

    public Track(String nome, LocalTime time) {
        this.nome = nome;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Track track = (Track) o;

        if (nome != null ? !nome.equals(track.nome) : track.nome != null) return false;
        if (time != null ? !time.equals(track.time) : track.time != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (time != null ? time.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Track{" +
                "nome='" + nome + '\'' +
                ", time=" + time +
                '}';
    }
}
