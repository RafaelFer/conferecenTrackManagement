package br.com.desafio.conference.main;

import br.com.desafio.conference.builder.PalestraBuilder;
import br.com.desafio.conference.model.Palestra;
import br.com.desafio.conference.util.LeArquivo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 31/08/2018.
 */
public class Executa {

    public static void main(String[] args) {

        String caminhoArquivo = "C:/input.txt";

        List<String> listaEventos = LeArquivo.leArquivoRetornaListaString(caminhoArquivo);

        PalestraBuilder builder = new PalestraBuilder();

        Palestra palestra = null;

        List<Palestra> palestras = new ArrayList<Palestra>();

        for (String listaEvento : listaEventos) {
            if(listaEvento != null)
            palestras.add(builder.constroiPalestra(listaEvento));
        }

        System.out.println(palestras);

    }
}
