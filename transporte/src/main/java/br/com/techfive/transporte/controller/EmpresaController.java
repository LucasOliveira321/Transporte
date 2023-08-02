package br.com.techfive.transporte.controller;

import br.com.techfive.transporte.empresa.DadosCadastraEmpresa;
import br.com.techfive.transporte.empresa.Empresa;
import br.com.techfive.transporte.empresa.EmpresaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping
    public String formulario(){
        return "cadastra/formulario_empresa";
    }

    @PostMapping
    public String cadastrar(@Valid DadosCadastraEmpresa dados){
        Empresa empresa = new Empresa(dados);
        empresaRepository.save(empresa);

        return "cadastra/formulario_empresa";
    }

}
