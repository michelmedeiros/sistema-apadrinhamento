package br.com.apadrinhamento.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

public class BaseEntity implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = -7698930479497692386L;

    @Column(name = "USUARIO_CRIACAO")
    private String usuarioCriacao;

    @Column(name = "USUARIO_ATUALIZACAO")
    private String usuarioAtualizacao;

    @Column(name = "DATA_CRIACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataCriacao;

    @Column(name = "DATA_ATUALIZACAO")
    @Temporal(TemporalType.TIMESTAMP)
    private Calendar dataAtualizacao;

}
