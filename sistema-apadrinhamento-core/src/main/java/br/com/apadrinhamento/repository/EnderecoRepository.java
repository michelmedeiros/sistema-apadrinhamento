package br.com.apadrinhamento.repository;

import br.com.apadrinhamento.entities.Endereco;

public interface EnderecoRepository {

    Endereco salvarEndereco(Endereco endereco);

    Endereco atualizarEndereco(Endereco endereco);
}
