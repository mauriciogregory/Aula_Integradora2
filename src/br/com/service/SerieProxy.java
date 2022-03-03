package br.com.service;
import br.com.exception.Exception;

import java.util.ArrayList;
import java.util.List;

public class SerieProxy implements Serie {

    private ServiceSerie serieService = new ServiceSerie();
    private List<String> numberSeries = new ArrayList<>();

    @Override
    public String getSerie(String nome) {

        if (numberSeries.size() <= 4) {
            numberSeries.add(nome);
            return serieService.getSerie(nome);
        }

        throw new Exception("Erro!");
    }
}
