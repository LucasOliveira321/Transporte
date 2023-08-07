package br.com.techfive.transporte.solicitacao;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "solicitacoes")
public class Solicitacao {
    private Integer id;
    private Integer saidaIdEmpresa;
    private Integer destinoIdEmpresa;
}
