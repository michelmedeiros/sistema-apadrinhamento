package br.com.apadrinhamento.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "DOACAO", schema = "APADRINHAMENTO_DB")
public class Doacao implements Serializable {

    private static final long serialVersionUID = 1344528886075243951L;

    @Id
    @GeneratedValue
    @Column(name = "DOACAO_ID")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_DOACAO")
    private LocalDateTime dataNascimento;

    @NotNull(message = "{validacao.notnull}")
    @Column(name = "VALOR_DOACAO")
    private BigDecimal valorDoacao;

    @OneToOne
    @JoinColumn(name = "ENDERECO_ID")
    private Padrinho responsavelDoacao;

    @ManyToOne
    @JoinColumn(name = "DEBITO_CART_ID")
    private DebitoCartao debitoCartao;

    @ManyToOne
    @JoinColumn(name = "DEBITO_AUTOM_ID")
    private DebitoAutomatico debitoAutomatico;

}
