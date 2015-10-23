package br.com.apadrinhamento.enumerations;


public enum HorarioContato {

    MANHA("Manhã"),

    TARDE("Tarde"),

    NOITE("Noite");

    private String descricao;

    HorarioContato(String descricao){
	this.descricao = descricao;
    }

    public String getDescricao(){
	return this.descricao;
    }
}