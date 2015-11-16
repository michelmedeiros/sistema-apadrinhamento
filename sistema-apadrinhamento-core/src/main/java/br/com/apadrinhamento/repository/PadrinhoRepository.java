package br.com.apadrinhamento.repository;

import br.com.apadrinhamento.entities.Padrinho;

public interface PadrinhoRepository {

	Padrinho salvarPadrinho(Padrinho padrinho);

	Padrinho atualizarPadrinho(Padrinho padrinho);
}
