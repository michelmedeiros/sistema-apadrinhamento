package br.com.apadrinhamento.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Doacao implements Serializable {

    private static final long serialVersionUID = 1344528886075243951L;

    private Long id;

    private Date dataRepasseDoacao;

    private BigDecimal valorDoacao;

    private Padrinho responsavelDoacao;

    private InformacaoBancaria informacaoBancaria;

    private Pagamento dadosPagamento;

}
