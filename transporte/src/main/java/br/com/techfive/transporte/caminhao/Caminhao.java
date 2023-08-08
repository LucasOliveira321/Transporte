package br.com.techfive.transporte.caminhao;

import br.com.techfive.transporte.usuario.DadosCadastroUsuario;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "caminhao")
@NoArgsConstructor
@Getter
public class Caminhao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String apelido;
    private String modelo;
    private String placa;
    private String renavam;
    private Date exercicio;
    private String carroceria;
    private String goodCard;
    private String senhaCartao;
    private String chassis;
    private Date anoFabricacao;
    private Integer tara;
    private Integer cargaMaxima;
    private Integer pesoTotal;
    private BigDecimal alturaMetro;
    private BigDecimal larguraMetro;
    private BigDecimal comprimentoMetro;
    private BigDecimal metroCubico;
    private String quantidadePneus;
    private String modeloPneus;

    private Date vencimentoLicenciamento;
    private Date vencimentoCronotacografo;
    private Date vencimentoLaudoOpacidade;
    private Date vencimentoAutorizacaoTransporteResiduoPerigoso;
    private Date vencimentoUnybrasil;

    public Caminhao(DadosCadastroCaminhao dados) {
        this.apelido = dados.apelido();
        this.modelo = dados.modelo();
        this.placa = dados.placa();
        this.renavam = dados.renavam();
        this.exercicio = dados.exercicio();
        this.carroceria = dados.carroceria();
        this.goodCard = dados.goodCard();
        this.senhaCartao = dados.senhaCartao();
        this.chassis = dados.chassis();
        this.anoFabricacao = dados.anoFabricacao();
        this.tara = dados.tara();
        this.cargaMaxima = dados.cargaMaxima();
        this.pesoTotal = dados.pesoTotal();
        this.alturaMetro = dados.alturaMetro();
        this.larguraMetro = dados.larguraMetro();
        this.comprimentoMetro = dados.comprimentoMetro();
        this.metroCubico = dados.metroCubico();
        this.quantidadePneus = dados.quantidadePneus();
        this.modeloPneus = dados.modeloPneus();
        this.vencimentoLicenciamento = dados.vencimentoLicenciamento();
        this.vencimentoCronotacografo = dados.vencimentoCronotacografo();
        this.vencimentoLaudoOpacidade = dados.vencimentoLaudoOpacidade();
        this.vencimentoAutorizacaoTransporteResiduoPerigoso = dados.vencimentoAutorizacaoTransporteResiduoPerigoso();
        this.vencimentoUnybrasil = vencimentoUnybrasil;
    }
}
