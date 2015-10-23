package br.com.apadrinhamento.enumerations;

public enum TipoPagamento {

    PAY_PAL("Pay Pal"),
    DEBITO_CONTA("Débito em Conta"),
    BOLETO_BANCARIO("Boleto Bancário"),
    CARTAO_CREDITO("Cartão de Crédito");

    private String descricao;

    public String getDescricao() {
	return descricao;
    }

    private TipoPagamento(String descricao) {
	this.descricao = descricao;
    }

}
