package br.com.apadrinhamento.enumerations;

public enum Sexo {

    MASCULINO("Masculino"),

    FEMININO("Feminino");

    private String descricao;

    Sexo(String descricao){
	this.descricao = descricao;
    }

    public String getDescricao(){
	return this.descricao;
    }

}
