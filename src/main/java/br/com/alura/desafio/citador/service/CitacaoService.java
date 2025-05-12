package br.com.alura.desafio.citador.service;

import br.com.alura.desafio.citador.dto.CitacaoDTO;
import br.com.alura.desafio.citador.model.Citacao;
import br.com.alura.desafio.citador.repository.CitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitacaoService {

    @Autowired
    private CitacaoRepository citacaoRepository;

    public CitacaoDTO converterCitacao(Citacao citacao){
        return new CitacaoDTO(
                citacao.getTitulo(),
                citacao.getFrase(),
                citacao.getPersonagem(),
                citacao.getPoster());
    }

    public CitacaoDTO sortearFrase() {
        return converterCitacao(citacaoRepository.sortearFrase());
    }
}
