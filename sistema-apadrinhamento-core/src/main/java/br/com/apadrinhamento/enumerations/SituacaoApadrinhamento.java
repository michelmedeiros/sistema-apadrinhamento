package br.com.apadrinhamento.enumerations;

public enum SituacaoApadrinhamento {

    VIGENTE("Vigente"),

    FINALIZADO("Finalizado"),

    PENDENTE("Pendente");

    private String descricao;

    SituacaoApadrinhamento(String descricao) {
	this.descricao = descricao;
    }

    public String getDescricao() {
	return this.descricao;
    }

}
