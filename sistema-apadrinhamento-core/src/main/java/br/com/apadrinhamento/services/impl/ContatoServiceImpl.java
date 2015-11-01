package br.com.apadrinhamento.services.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.apadrinhamento.entities.Contato;
import br.com.apadrinhamento.repository.ContatoRepository;
import br.com.apadrinhamento.services.ContatoService;
import lombok.extern.slf4j.Slf4j;

@Stateless
public class ContatoServiceImpl implements ContatoService {

    @Inject
    private ContatoRepository contatoRepository;

    @Override
    @Transactional
    public Contato salvarContato(Contato contato) {
	return contatoRepository.salvarContato(contato);
    }

}
