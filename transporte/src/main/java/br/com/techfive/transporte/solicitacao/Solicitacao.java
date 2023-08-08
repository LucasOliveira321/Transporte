package br.com.techfive.transporte.solicitacao;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

//@Entity
//@Table(name = "solicitacoes")
//@NoArgsConstructor
//@Getter
public class Solicitacao {
    private Integer id;
    private Integer saidaIdEmpresa;
    private Integer destinoIdEmpresa;
    //ENUM material
    //LocalDateTime dataColetaHorario
    //Usuario solicitante
    //Caminhao caminhao
    //Motorista motorista
    //String observacao


}
