package br.com.desafio.conference.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 31/08/2018.
 */
public class LeArquivo {

    public static List<String> leArquivoRetornaListaString(String caminhoArquivo){

        List<String> eventos = new ArrayList<String>();
        try {
            FileReader arq = new FileReader(caminhoArquivo);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            eventos.add(linha);
            while (linha != null) {
                linha = lerArq.readLine();
                eventos.add(linha);
            }
            arq.close();

            return eventos;
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());
        }
        return null;
    }
}
