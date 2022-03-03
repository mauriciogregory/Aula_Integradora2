package br.com.service;

public class ServiceSerie implements Serie {
    @Override
    public String getSerie(String nome) {
        nome = nome.toLowerCase();
        return ("www." + nome.replace(" ", "") + ".com");
    }
}
