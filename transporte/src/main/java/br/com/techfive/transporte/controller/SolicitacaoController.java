package br.com.techfive.transporte.controller;

import br.com.techfive.transporte.empresa.Empresa;
import br.com.techfive.transporte.empresa.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/solicitacao")
public class SolicitacaoController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping("/coleta")
    public String solicitacaoTransporte(Model model){

        model.addAttribute("lista", empresaRepository.findAll());

        return "solicitacao/solicitacaoTransporte";
    }

}
