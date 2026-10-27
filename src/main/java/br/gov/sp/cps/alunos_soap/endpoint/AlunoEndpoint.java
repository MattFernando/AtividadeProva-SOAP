package br.gov.sp.cps.alunos_soap.endpoint;

import br.gov.sp.cps.alunos_soap.model.ConsultarAlunoRequest;
import br.gov.sp.cps.alunos_soap.model.ConsultarAlunoResponse;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class AlunoEndpoint {

    private static final String NAMESPACE = "http://cps.sp.gov.br/alunos";

    @PayloadRoot( namespace = NAMESPACE, localPart = "consultarAlunoRequest"  )
    @ResponsePayload
    public ConsultarAlunoResponse consultarAluno( @RequestPayload ConsultarAlunoRequest request) {

        ConsultarAlunoResponse response =  new ConsultarAlunoResponse();

        if (request.getRa() == 1) {

            response.setNome("Tenis");
            response.setDescricao("Tenis preto tamanho 40");
            response.setMarca("Nike"  );
            response.setQuantidade(11);

        } else if (request.getRa() == 2){
        	response.setNome("Celular");
            response.setDescricao("Celular generico");
            response.setMarca("Motorola"  );
            response.setQuantidade(9);
        	
        }
        
        
        
        else {

            response.setNome( "Produto não encontrado" );
            response.setDescricao( "Produto não encontrado" );
            response.setMarca( "Produto não encontrado" );
            response.setQuantidade( 0 );
        }

        return response;
    }
}