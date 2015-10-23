package br.com.apadrinhamento.entities;

import java.io.Serializable;
import java.sql.Blob;

import lombok.Data;
import lombok.NoArgsConstructor;
import br.com.apadrinhamento.enumerations.Sexo;

@Data
@NoArgsConstructor
public class Crianca implements Serializable{

    private static final long serialVersionUID = -3550222868722476593L;

    private Long id;

    private String nome;

    private Integer idade;

    private Endereco endereco;

    private String descricaoHistoria;

    private Sexo sexo;

    private Blob foto;


}