package br.com.apadrinhamento.rest;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import br.com.apadrinhamento.entities.Padrinho;
import br.com.apadrinhamento.services.PadrinhoService;

@Path("/padrinho")
@Produces({ "application/json" })
public class CadastroPadrinhoRest {

	@Inject
	private PadrinhoService service;
	
	@GET
	@Path("/buscarPadrinhos")
	public Response buscarPadrinhos() {
		List<Padrinho> padrinhos = new ArrayList<Padrinho>();
		System.out.println("Teste");
		Padrinho padrinho = new Padrinho();
		padrinho.setCpf("00887309488");
		padrinho.setDataNascimento(Calendar.getInstance());
		padrinho.setDataCadastro(Calendar.getInstance());
		padrinhos.add(padrinho);

		return Response.status(Status.OK).entity(padrinhos).build();
	}
	
	@POST
	@Path("/salvarPadrinho")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Response salvarPadrinho(Padrinho padrinho){
		return Response.status(Status.CREATED).entity(service.salvarPadrinho(padrinho)).build();
	}
	

}
