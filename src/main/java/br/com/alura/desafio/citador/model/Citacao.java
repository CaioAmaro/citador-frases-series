package br.com.alura.desafio.citador.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Citacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public String getTitulo() {
        return titulo;
    }

    public String getFrase() {
        return frase;
    }

    public String getPersonagem() {
        return personagem;
    }

    public String getPoster() {
        return poster;
    }
}
