package br.com.techfive.transporte.controller;

import br.com.techfive.transporte.empresa.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping
    public String menuConsulta(){
        return "consulta/consulta";
    }

    @GetMapping("/empresa")
    public String consultaEmpresa(Model model){
        model.addAttribute("consultar", empresaRepository.findAll());

        return "consulta/consultaEmpresa";
    }

}
