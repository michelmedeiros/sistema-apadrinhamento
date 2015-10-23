package br.com.apadrinhamento.enumerations;


public enum FormaContato {

    EMAIL("Email"),
    INTERNET("Internet"),
    TV("TV");

    private String descricao;

    public String getDescricao() {
	return descricao;
    }

    private FormaContato(String descricao) {
	this.descricao = descricao;
    }



}