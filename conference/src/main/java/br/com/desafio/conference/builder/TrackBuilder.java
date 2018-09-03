package br.com.desafio.conference.builder;

import br.com.desafio.conference.bo.Palestra;
import br.com.desafio.conference.bo.Track;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by user on 01/09/2018.
 */
public class TrackBuilder {


    public void constroiTrack(List<Palestra> palestras){

        LocalTime tempoCorrenteTrack1 = LocalTime.of(9, 00);
        LocalTime tempoCorrenteTrack2 = LocalTime.of(9, 00);

        LocalTime inicioPalestra = LocalTime.of(9, 00);
        LocalTime inicioAlmoco = LocalTime.of(12, 00);
        LocalTime fimAlmoco = LocalTime.of(13, 00);
        LocalTime fimDoEvento = LocalTime.of(16, 30);

        LocalTime tmp;

        List<Track> listaTrack1 = new ArrayList<Track>();
        List<Track> listaTrack2 = new ArrayList<Track>();


        Collections.sort(palestras);

        Track track = null;

        int imparpar = 0;

        for (Palestra palestra : palestras) {

            if (palestra.getTempo() % 2 == 0) {

                int random = imparpar % 2;

                if (random == 1) {
                    track = new Track(palestra.getNome(), tempoCorrenteTrack1);
                    if (!listaTrack1.contains(track) && !listaTrack2.contains(track)) {
                        if (tempoCorrenteTrack1.isBefore(inicioAlmoco)) {
                            tmp = tempoCorrenteTrack1.plusMinutes(palestra.getTempo());
                            if (!tmp.isAfter(inicioAlmoco)) {
                                tempoCorrenteTrack1 = tempoCorrenteTrack1.plusMinutes(palestra.getTempo());
                                listaTrack1.add(track);
                            }
                        }else if(tempoCorrenteTrack1.equals(inicioAlmoco)){
                            listaTrack1.add(new Track("Almoco",tempoCorrenteTrack1));
                            tempoCorrenteTrack1 = fimAlmoco;
                        }else if(tempoCorrenteTrack1.isAfter(fimAlmoco)){
                            tempoCorrenteTrack1 = tempoCorrenteTrack1.plusMinutes(palestra.getTempo());
                            listaTrack1.add(track);
                        }
                    }
                } else {
                    track = new Track(palestra.getNome(), tempoCorrenteTrack2);
                    if (!listaTrack2.contains(track) && !listaTrack1.contains(track)) {
                        if (tempoCorrenteTrack2.isBefore(inicioAlmoco)) {
                            tmp = tempoCorrenteTrack2.plusMinutes(palestra.getTempo());
                            if (tmp.isAfter(inicioAlmoco)) {
                                //System.out.println("vai passar 2 do almoco " + tmp);
                            } else {
                                tempoCorrenteTrack2 = tempoCorrenteTrack2.plusMinutes(palestra.getTempo());
                                listaTrack2.add(track);
                            }
                        }
                    }
                }
            }

            imparpar++;
        }

        for (Track obj : listaTrack1) {
            System.out.println("Track 1 - " + obj.getTime() + " > " + obj.getNome());
        }

        System.out.println("-----------------------------------------------");
        for (Track obj : listaTrack2) {
            System.out.println("Track 2 - " + obj.getTime() + " > " + obj.getNome());
        }
    }

}
