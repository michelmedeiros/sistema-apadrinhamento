package br.com.apadrinhamento.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.apadrinhamento.enumerations.BandeiraCartao;
import br.com.apadrinhamento.enumerations.TipoPagamento;

@Data
@NoArgsConstructor
public class Pagamento implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 5009195888560456489L;

    private Long id;

    private TipoPagamento tipoPagamento;

    private BandeiraCartao bandeiraCartao;

    private Long numeroCartao;

    private Integer codigoSeguranca;

    private LocalDateTime dataValidade;

    private LocalDateTime dataFaturamento;

    private Integer diaPreferencial;

}
