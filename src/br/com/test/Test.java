package br.com.test;

import br.com.service.Serie;
import br.com.service.SerieProxy;
import static org.junit.jupiter.api.Assertions.*;

class Test {

    @org.junit.jupiter.api.Test
    public void returnSerie(){

        Serie serie = new SerieProxy();
        String site = serie.getSerie("Bird");

        assertEquals("www.bird.com", site);
        System.out.println(site);

    }
}
