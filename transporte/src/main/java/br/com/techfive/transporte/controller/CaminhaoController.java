package br.com.techfive.transporte.controller;

import br.com.techfive.transporte.caminhao.Caminhao;
import br.com.techfive.transporte.caminhao.CaminhaoRepository;
import br.com.techfive.transporte.caminhao.DadosCadastroCaminhao;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caminhao")
public class CaminhaoController {

    @Autowired
    private CaminhaoRepository caminhaoRepository;

    @GetMapping
    public String formulario(){
        return "cadastra/formulario_caminhao";
    }

    @PostMapping
    public String cadastrar(@Valid DadosCadastroCaminhao dados){

        Caminhao caminhao = new Caminhao();
        caminhaoRepository.save(caminhao);

        return "cadastra/formulario_caminhao";
    }

}
