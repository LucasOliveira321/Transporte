package br.com.techfive.transporte.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@Getter
public class Usuario {
    @Id
    private String email;
    private String senha;
    private String nome;
    private String cargo;

    public Usuario(@Valid DadosCadastroUsuario dados){
        this.email = dados.email();
        this.senha = dados.senha();
        this.nome = dados.nome();
        this.cargo = dados.cargo().toString();
    }
}
