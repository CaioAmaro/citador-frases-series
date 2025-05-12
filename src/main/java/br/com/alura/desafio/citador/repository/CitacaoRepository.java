package br.com.alura.desafio.citador.repository;

import br.com.alura.desafio.citador.dto.CitacaoDTO;
import br.com.alura.desafio.citador.model.Citacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CitacaoRepository extends JpaRepository<Citacao, Long> {

    @Query("SELECT c FROM Citacao c ORDER BY FUNCTION('RANDOM') LIMIT 1")
    public Citacao sortearFrase();
}
