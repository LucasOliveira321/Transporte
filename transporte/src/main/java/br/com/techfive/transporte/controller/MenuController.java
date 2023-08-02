package br.com.techfive.transporte.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {

    @GetMapping
    public String menuPrincipal(){
        return "menu/menuPrincipal";
    }

    @GetMapping("/cadastro")
    public String menuCadastro(){
        return "menu/menuCadastrar";
    }

}
