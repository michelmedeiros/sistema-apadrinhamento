package br.com.apadrinhamento.services.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import br.com.apadrinhamento.entities.Endereco;
import br.com.apadrinhamento.repository.EnderecoRepository;
import br.com.apadrinhamento.services.EnderecoService;

@Stateless
public class EnderecoServiceImpl implements EnderecoService {

    @Inject
    private EnderecoRepository enderecoRepository;

    private EntityManagerFactory emf;
    private EntityManager em;

    @Override
    @Transactional
    public Endereco salvarEndereco(Endereco endereco) {
	return enderecoRepository.salvarEndereco(endereco);
    }

    public void startConnection() {
	emf = Persistence.createEntityManagerFactory("ApadrinhamentoPU");
	em = emf.createEntityManager();
	em.getTransaction().begin();
    }

    public void closeConnection() {
	em.getTransaction().commit();
	emf.close();
    }

    public void save(Endereco endereco) {
	em.persist(endereco);
    }

}
