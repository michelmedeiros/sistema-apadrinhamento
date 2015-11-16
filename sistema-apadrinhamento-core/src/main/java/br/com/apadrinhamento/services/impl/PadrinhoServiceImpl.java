package br.com.apadrinhamento.services.impl;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.apadrinhamento.entities.Padrinho;
import br.com.apadrinhamento.repository.PadrinhoRepository;
import br.com.apadrinhamento.services.PadrinhoService;

@Stateless
public class PadrinhoServiceImpl implements PadrinhoService {

    @Inject
    private PadrinhoRepository padrinhoRepository;

    @Override
    @Transactional
    public Padrinho salvarPadrinho(Padrinho padrinho) {
	return padrinhoRepository.salvarPadrinho(padrinho);
    }

}
