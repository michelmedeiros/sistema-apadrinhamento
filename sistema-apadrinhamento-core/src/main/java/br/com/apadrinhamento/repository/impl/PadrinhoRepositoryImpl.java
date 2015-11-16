package br.com.apadrinhamento.repository.impl;

import javax.enterprise.context.Dependent;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.apadrinhamento.entities.Padrinho;
import br.com.apadrinhamento.repository.PadrinhoRepository;

@Dependent
public class PadrinhoRepositoryImpl implements PadrinhoRepository {

    @PersistenceContext(unitName = "ApadrinhamentoPU")
    private EntityManager entityManager;

    @Override
    public Padrinho salvarPadrinho(Padrinho padrinho) {
	entityManager.persist(padrinho);
	return padrinho;
    }

    @Override
    public Padrinho atualizarPadrinho(Padrinho padrinho) {
	return entityManager.merge(padrinho);
    }
}
