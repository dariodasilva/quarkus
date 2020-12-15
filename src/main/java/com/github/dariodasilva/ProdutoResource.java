package com.github.dariodasilva;

import javax.transaction.Transactional;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("produtos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutoResource {

    @GET
    public List<Produto> buscarTodosProdutos(){
        return Produto.listAll();
    }

    @POST
    @Transactional
    public void buscarTodosProdutos(CadastrarProdutoDTO dto){
        Produto p = new Produto();

        p.nome = dto.nome;
        p.valor = dto.valor;
        p.persist();
    }

//    @POST
//    public Response save(Produto produto) {
//        produto.persist();
//        return Response.ok(produto).build();
//    }


}
