package br.com.apadrinhamento.repository.impl;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Default;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.apadrinhamento.entities.Contato;
import br.com.apadrinhamento.repository.ContatoRepository;

@Dependent
public class ContatoRepositoryImpl implements ContatoRepository {

    @PersistenceContext(unitName = "ApadrinhamentoPU")
    private EntityManager entityManager;

    @Override
    public Contato salvarContato(Contato contato) {
	entityManager.persist(contato);
	return contato;
    }

    @Override
    public Contato atualizarContato(Contato contato) {
	return entityManager.merge(contato);
    }
}
