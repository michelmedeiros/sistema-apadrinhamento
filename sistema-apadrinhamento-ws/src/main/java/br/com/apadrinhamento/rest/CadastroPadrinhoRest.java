package br.com.apadrinhamento.rest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.apadrinhamento.entities.Padrinho;

@Path("/apadrinhamento")
@Produces({ "application/json" })
public class CadastroPadrinhoRest {

    @GET
    public Response buscarPadrinhos() {
	List<Padrinho> padrinhos = new ArrayList<Padrinho>();
	System.out.println("Teste");
	Padrinho padrinho = new Padrinho();
	padrinho.setCpf("00887309488");
	padrinho.setDataNascimento(LocalDateTime.now());
	padrinho.setDataCadastro(LocalDateTime.now());
	padrinhos.add(padrinho);

	return Response.status(Status.OK).entity(padrinho).build();
	// return padrinhos;
    }

}
