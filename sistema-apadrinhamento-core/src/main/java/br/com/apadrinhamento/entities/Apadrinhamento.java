package br.com.apadrinhamento.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Apadrinhamento implements Serializable {

    private static final long serialVersionUID = 317000641816229998L;

    private Long id;

    private LocalDateTime dataInicioApadrinhamento;

    private LocalDateTime dataFimApadrinhamento;

    private Crianca crianca;

    private Padrinho padrinho;

    private Doacao doacao;

}