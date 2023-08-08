package br.com.techfive.transporte.controller;

import br.com.techfive.transporte.usuario.DadosUsuario;
import br.com.techfive.transporte.usuario.Usuario;
import br.com.techfive.transporte.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class ColaboradorController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/cadastrar")
    public String formulario(){
        return "cadastra/formulario_colaborador";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(DadosUsuario dados){
        Usuario user = new Usuario(dados);
        usuarioRepository.save(user);

        return "cadastra/formulario_colaborador";
    }

}
