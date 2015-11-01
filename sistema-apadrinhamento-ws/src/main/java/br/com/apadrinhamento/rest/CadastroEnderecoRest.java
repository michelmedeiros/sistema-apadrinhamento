package br.com.apadrinhamento.rest;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.apadrinhamento.entities.Endereco;
import br.com.apadrinhamento.services.EnderecoService;

@Path("/enderecos")
@Produces({ "application/json" })
public class CadastroEnderecoRest {

    @Inject
    private EnderecoService enderecoService;

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response salvar(Endereco entity) {

	Endereco endereco = new Endereco();
	endereco.setBairro("Centro");
	endereco.setCep("59370000");
	endereco.setCidade("Natal");
	endereco.setEstado("RN");
	endereco.setComplemento("AP");
	endereco.setNumero(100);
	endereco.setRua("Rua do Sol");

	return Response.status(Status.CREATED)
		.entity(enderecoService.salvarEndereco(endereco)).build();
    }

}
