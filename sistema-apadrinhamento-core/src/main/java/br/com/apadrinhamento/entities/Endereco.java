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
@Table(name = "ENDERECO", schema = "APADRINHAMENTO_DB")
public class Endereco implements Serializable {

    private static final long serialVersionUID = -3178966049811239534L;

    @Id
    @GeneratedValue
    @Column(name = "ENDERECO_ID")
    private Long id;

    @Column(name = "DESC_CIDADE")
    private String cidade;

    @Column(name = "SIGLA_ESTADO")
    private String estado;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "RUA")
    private String rua;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "NUMERO")
    private Integer numero;

    @Column(name = "COMPLEMENTO")
    private String complemento;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "BAIRRO")
    private String bairro;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "CEP")
    private String cep;

}