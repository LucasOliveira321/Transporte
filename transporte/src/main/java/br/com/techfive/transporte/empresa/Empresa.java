package br.com.techfive.transporte.empresa;

import br.com.techfive.transporte.endereco.Endereco;
import br.com.techfive.transporte.responsavel.Responsavel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "empresa")
@Getter
@NoArgsConstructor
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String cnpj;
    @Embedded
    private Endereco endereco;
    @Embedded
    private Responsavel responsavel;

    public Empresa(DadosCadastraEmpresa dados){
        this.nome = dados.nome();
        this.cnpj = dados.cnpj();
        this.endereco = new Endereco(
                dados.logradouro(),
                dados.numero(),
                dados.complemento(),
                dados.bairro(),
                dados.cidade(),
                dados.uf(),
                dados.cep());
        this.responsavel = new Responsavel(
                dados.nomeResponsavel(),
                dados.telefone());
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", logradouro='" + endereco.getLogradouro() + '\'' +
                ", numero='" + endereco.getNumero() + '\'' +
                ", complemento='" + endereco.getComplemento() + '\'' +
                ", bairro='" + endereco.getBairro() + '\'' +
                ", cidade='" + endereco.getCidade() + '\'' +
                ", uf='" + endereco.getUf() + '\'' +
                ", cep='" + endereco.getCep() + '\'' +
                '}';
    }
}
