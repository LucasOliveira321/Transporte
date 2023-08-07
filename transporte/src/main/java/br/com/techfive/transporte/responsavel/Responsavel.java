package br.com.techfive.transporte.responsavel;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Responsavel {
    @Column(name = "nome_responsavel")
    private String nomeResponsavel;
    private String telefone;
}
