package br.com.alura.desafio.citador.controller;

import br.com.alura.desafio.citador.service.CitacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class CitacaoController {

    @Autowired
    private CitacaoService citacaoService;

    @GetMapping("/frases/gerar")
    public void gerar(){
        citacaoService.gerar();
    }
}
