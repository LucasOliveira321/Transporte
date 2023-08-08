package br.com.techfive.transporte.caminhao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

public record DadosCadastroCaminhao(
        @NotBlank
        String apelido,
        @NotBlank
        String modelo,
        @NotBlank
        String placa,
        @NotBlank
        String renavam,
        @NotNull
        Date exercicio,
        @NotBlank
        String carroceria,
        String goodCard,
        String senhaCartao,
        @NotBlank
        String chassis,
        @NotNull
        Date anoFabricacao,
        @NotNull
        Integer tara,
        @NotNull
        Integer cargaMaxima,
        @NotNull
        Integer pesoTotal,
        BigDecimal alturaMetro,
        BigDecimal larguraMetro,
        BigDecimal comprimentoMetro,
        BigDecimal metroCubico,
        @NotNull
        String quantidadePneus,
        String modeloPneus,
        Date vencimentoLicenciamento,
        Date vencimentoCronotacografo,
        Date vencimentoLaudoOpacidade,
        Date vencimentoAutorizacaoTransporteResiduoPerigoso,
        Date vencimentoUnybrasil){
}
