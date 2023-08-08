package br.com.techfive.transporte.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(
        @NotBlank
        @Email
        String email,
        @NotBlank
        String senha,
        @NotBlank
        String repetirSenha,
        @NotBlank
        String nome,
        @NotNull
        Cargo cargo) {
}
