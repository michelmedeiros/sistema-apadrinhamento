package br.com.apadrinhamento.enumerations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@JsonFormat(shape = Shape.OBJECT)
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