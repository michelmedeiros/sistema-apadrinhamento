package br.com.apadrinhamento.services.impl;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.apadrinhamento.entities.Contato;
import br.com.apadrinhamento.repository.ContatoRepository;
import br.com.apadrinhamento.services.ContatoService;

public class ContatoServiceImpl implements ContatoService {

    @Inject
    private ContatoRepository repository;

    @Override
    @Transactional
    public Contato salvarContato(Contato contato) {
	return repository.salvarContato(contato);
    }

}
