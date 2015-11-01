package br.com.apadrinhamento.entities;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe que representa o padrinho que realiza a doação financeira
 * 
 * @author michel
 *
 */
@Data
@NoArgsConstructor
@Entity
@Table(name = "PADRINHO", schema = "APADRINHAMENTO_DB")
public class Padrinho implements Serializable {

    private static final long serialVersionUID = 8312697432643059150L;

    @Id
    @GeneratedValue
    @Column(name = "PADRINHO_ID")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_NASCIMENTO")
    private Calendar dataNascimento;

    @NotNull(message = "{validacao.notnull}")
    @Size(max = 15, message = "{validacao.tamanho}")
    @Column(name = "CPF")
    private String cpf;

    @NotNull(message = "{validation.notnull}")
    @Size(max = 45, message = "{validacao.tamanho}")
    @Column(name = "NOME")
    private String nome;

    @ManyToOne
    @JoinColumn(name = "ID_CONTATO")
    private Contato contato;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_CADASTRO")
    private Calendar dataCadastro;

    @OneToMany(mappedBy = "padrinho")
    private List<Apadrinhamento> apadrinhamentos;

}