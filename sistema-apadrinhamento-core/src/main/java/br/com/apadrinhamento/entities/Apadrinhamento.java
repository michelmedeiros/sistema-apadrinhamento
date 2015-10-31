package br.com.apadrinhamento.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.apadrinhamento.enumerations.SituacaoApadrinhamento;

@Data
@NoArgsConstructor
@Entity
@Table(name = "APADRINHAMENTO", schema = "APADRINHAMENTO_DB")
public class Apadrinhamento implements Serializable {

    private static final long serialVersionUID = 317000641816229998L;

    @Id
    @GeneratedValue
    @Column(name = "APADRINHAMENTO_ID")
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_INICIO_APADR")
    private LocalDateTime dataInicioApadrinhamento;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATA_FIM_APADR")
    private LocalDateTime dataFimApadrinhamento;

    @Column(name = "SIT_APADRINHAMENTO")
    private SituacaoApadrinhamento situacao;

    @OneToOne
    @JoinColumn(name = "CRIANCA_ID")
    private Crianca crianca;

    @OneToOne
    @JoinColumn(name = "PADRINHO_ID")
    private Padrinho padrinho;

    @OneToOne
    @JoinColumn(name = "DOACAO_ID")
    private Doacao doacao;

}