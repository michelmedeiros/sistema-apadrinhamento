package br.com.apadrinhamento.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.apadrinhamento.enumerations.BandeiraCartao;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "DEBITO_CARTAO", schema = "APADRINHAMENTO_DB")
public class DebitoCartao implements Serializable {

    private static final long serialVersionUID = 9153209030818523549L;

    @Id
    @GeneratedValue
    @Column(name = "DEBITO_CART_ID")
    private Long id;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "BANDEIRA_CARTAO")
    private BandeiraCartao bandeiraCartao;

    @NotNull(message = "{validation.notnull}")
    @Size(max = 15, message = "{validacao.tamanho}")
    @Column(name = "NUM_CARTAO")
    private String numeroCartao;

    @NotNull(message = "{validation.notnull}")
    @Size(max = 3, message = "{validacao.tamanho}")
    @Column(name = "COD_SEGURANCA")
    private String codigoSeguranca;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_VALIDADE")
    private Calendar dataValidade;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_FATURAMENTO")
    private Calendar dataFaturamento;
}
