package br.com.apadrinhamento.enumerations;

public enum BandeiraCartao {

    VISA("Visa"),
    MASTER("Master Card"),
    AMERICAN_EXPESS("American Express");

    private String descricao;

    public String getDescricao() {
	return descricao;
    }

    private BandeiraCartao(String descricao) {
	this.descricao = descricao;
    }

}
