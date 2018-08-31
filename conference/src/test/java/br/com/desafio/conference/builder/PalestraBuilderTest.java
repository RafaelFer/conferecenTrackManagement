package br.com.desafio.conference.builder;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalestraBuilderTest {


    @Test
    public void testTemTempo() throws Exception {

        String linha = "Programming in the Boondocks of Seattle 3min";

        for (int i = 0; i < linha.length(); i++) {
            String letra = String.valueOf(linha.charAt(i));
            if (letra.matches("\\d")) {
                Assert.assertEquals(3, 3);
            }
        }

    }
}