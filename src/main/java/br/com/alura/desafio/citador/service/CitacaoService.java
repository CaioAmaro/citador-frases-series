package br.com.alura.desafio.citador.service;

import org.springframework.stereotype.Service;

@Service
public class CitacaoService {
    private ConsumoGemini consumoGemini;
    private ConsumoApi consumoApi;
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=afd46234";

    //ENDERECO + nomeSerie.replace(" ", "+") + API_KEY
    public void gerar(){
        String nomeSerie = ConsumoGemini.obterNomeSerie();
//        String json = consumoApi.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
        System.out.println(nomeSerie);
//        System.out.println(json);
    }
}
