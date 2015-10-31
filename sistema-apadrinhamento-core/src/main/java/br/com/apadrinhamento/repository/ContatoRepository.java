package br.com.apadrinhamento.repository;

import br.com.apadrinhamento.entities.Contato;

public interface ContatoRepository {

    Contato salvarContato(Contato contato);

    Contato atualizarContato(Contato contato);
}
