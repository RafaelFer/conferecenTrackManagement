package br.com.desafio.conference.builder;

import br.com.desafio.conference.model.Palestra;

/**
 * Created by user on 31/08/2018.
 */
public class PalestraBuilder {

    public Palestra constroiPalestra(String linha) {

        boolean possuiTempo = this.temTempo(linha.toString());

        Palestra palestra = null;

        if (possuiTempo) {
            Long tempo = new Long(linha.replaceAll("[^0-9]", ""));
            palestra = new Palestra(linha.substring(0, linha.length() - 5),tempo);
        }

        return palestra;
    }

    public boolean temTempo(String linha) {

        try {
            for (int i = 0; i < linha.length(); i++) {
                String letra = String.valueOf(linha.charAt(i));
                if (letra.matches("\\d")) {
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.printf("Erro> " + e.getMessage());
        }
        return false;
    }
}
