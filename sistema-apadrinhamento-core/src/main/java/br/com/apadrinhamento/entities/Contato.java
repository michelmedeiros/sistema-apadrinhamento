package br.com.apadrinhamento.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.apadrinhamento.enumerations.FormaContato;
import br.com.apadrinhamento.enumerations.HorarioContato;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CONTATO", schema = "APADRINHAMENTO_DB")
public class Contato implements Serializable {

    private static final long serialVersionUID = 1066648765421299598L;

    @Id
    @GeneratedValue
    @Column(name = "CONTATO_ID")
    private Long id;

    @NotNull(message = "{validacao.notnull}")
    @Size(max = 45, message = "{validacao.tamanho}")
    @Column(name = "EMAIL")
    private String email;

    @Size(max = 20, message = "{validacao.tamanho}")
    @Column(name = "TEL_RESIDENCIAL")
    private String telefoneResidencial;

    @NotNull(message = "{validacao.notnull}")
    @Size(max = 20, message = "{validacao.tamanho}")
    @Column(name = "CELULAR")
    private String celular;

    @NotNull(message = "{validacao.notnull}")
    @Size(max = 100, message = "{validacao.tamanho}")
    @Column(name = "RESPONS_CONTATO")
    private String responsavelContato;

    @Size(max = 45, message = "{validacao.tamanho}")
    @Column(name = "PROFISSAO")
    private String profissao;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "FORMA_CONTATO")
    private FormaContato formaContato;

    @Enumerated(EnumType.ORDINAL)
    @NotNull(message = "{validacao.notnull}")
    @Column(name = "HORARIO_CONTATO")
    private HorarioContato horarioContato;

    @OneToOne
    @JoinColumn(name = "ENDERECO_ID")
    private Endereco endereco;

}