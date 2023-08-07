package br.com.techfive.transporte.empresa;

import jakarta.validation.constraints.NotBlank;
import org.springframework.format.annotation.NumberFormat;

public record DadosCadastraEmpresa(
        @NotBlank
        String nome,
        @NotBlank
        String cnpj,
        @NotBlank
        String logradouro,
        @NotBlank
        @NumberFormat
        String numero,
        String complemento,
        @NotBlank
        String bairro,
        @NotBlank
        String cidade,
        @NotBlank
        String uf,
        @NotBlank
        String cep,
        @NotBlank
        String nomeResponsavel,
        @NotBlank
        String telefone
) {}
