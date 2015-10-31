package br.com.apadrinhamento.entities;

import java.io.Serializable;
import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.apadrinhamento.enumerations.Sexo;

/**
 * Classe que representa a criança que será apadrinhada
 * 
 * @author michel
 *
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "CRIANCA", schema = "APADRINHAMENTO_DB")
public class Crianca implements Serializable {

    private static final long serialVersionUID = -3550222868722476593L;

    @Id
    @GeneratedValue
    @Column(name = "CRIANCA_ID")
    private Long id;

    @NotNull(message = "{validation.notnull}")
    @Size(max = 100, message = "{validacao.tamanho}")
    @Column(name = "NOME")
    private String nome;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "IDADE")
    private Integer idade;

    @Column(name = "DESC_HISTORIA")
    private String descricaoHistoria;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "SEXO")
    private Sexo sexo;

    @NotNull(message = "{validation.notnull}")
    @Column(name = "FOTO")
    private Blob foto;

}