package br.com.apadrinhamento.enumerations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

@JsonFormat(shape = Shape.OBJECT)
public enum HorarioContato {

    MANHA(),

    TARDE(),

    NOITE();

}