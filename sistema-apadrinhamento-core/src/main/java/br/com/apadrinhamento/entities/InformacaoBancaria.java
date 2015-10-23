package br.com.apadrinhamento.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "BANCO", schema = "APADRINHAMENTO_DB")
public class InformacaoBancaria implements Serializable {

    private static final long serialVersionUID = 1850316084972489551L;

    @Id
    @GeneratedValue
    @Column(name = "ID_BANCO")
    private Long id;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "NOME_BANCO")
    private String nomeBanco;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "NUM_AGENCIA")
    private String numeroAgencia;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "NUM_CONTA_CORRENTE")
    private String numetoContaCorrente;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "DIG_CONTA_CORRENTE")
    private Integer digitoContaCorrente;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "DIG_AGENCIA")
    private Integer digitoAgencia;

}