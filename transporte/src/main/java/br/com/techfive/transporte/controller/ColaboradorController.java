package br.com.techfive.transporte.controller;

import br.com.techfive.transporte.usuario.DadosCadastroUsuario;
import br.com.techfive.transporte.usuario.Usuario;
import br.com.techfive.transporte.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class ColaboradorController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public String formulario(){
        return "cadastra/formulario_colaborador";
    }

    @PostMapping
    public String cadastrar(@Valid DadosCadastroUsuario dados){
        if (dados.senha().equals(dados.repetirSenha())) {
            Usuario user = new Usuario(dados);
            usuarioRepository.save(user);
        }else {
            System.out.println("Senha errada");
        }
        return "cadastra/formulario_colaborador";
    }

}
