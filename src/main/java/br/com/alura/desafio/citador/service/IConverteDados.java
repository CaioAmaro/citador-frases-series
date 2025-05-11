package br.com.alura.desafio.citador.service;

public interface IConverteDados {
    <T> T  obterDados(String json, Class<T> classe);
}
