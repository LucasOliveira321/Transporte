package br.com.techfive.transporte.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosUsuario(
        @NotBlank
        @Email
        String email,
        @NotBlank
        String senha,
        @NotBlank
        String nome) {
}
