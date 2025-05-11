package br.com.alura.desafio.citador.repository;

import br.com.alura.desafio.citador.model.Citacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitacaoRepository extends JpaRepository<Citacao, Long> {

}