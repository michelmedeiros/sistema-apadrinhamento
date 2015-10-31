package br.com.apadrinhamento.repository.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.apadrinhamento.entities.Endereco;
import br.com.apadrinhamento.repository.EnderecoRepository;

public class EnderecoRepositoryImpl implements EnderecoRepository {

    @PersistenceContext(unitName = "ApadrinhamentoPU")
    private EntityManager entityManager;

    @Override
    public Endereco salvarEndereco(Endereco endereco) {
	entityManager.persist(endereco);
	return endereco;
    }

    @Override
    public Endereco atualizarEndereco(Endereco endereco) {
	return entityManager.merge(endereco);
    }
}
