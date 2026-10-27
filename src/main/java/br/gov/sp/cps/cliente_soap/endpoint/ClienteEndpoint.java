package br.gov.sp.cps.cliente_soap.endpoint;

import br.gov.sp.cps.cliente_soap.exception.ClienteNaoEncontradoException;
import br.gov.sp.cps.clientes_soap.schema.ConsultarClienteRequest;
import br.gov.sp.cps.clientes_soap.schema.ConsultarClienteResponse;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ClienteEndpoint {

    private static final String NAMESPACE = "http://soacurso.com/clientes";

    @PayloadRoot(namespace = NAMESPACE, localPart = "consultarClienteRequest")
    @ResponsePayload
    public ConsultarClienteResponse consultarCliente(
            @RequestPayload ConsultarClienteRequest request) {

        if (request.getId() == 1001) {
            ConsultarClienteResponse response = new ConsultarClienteResponse();
            response.setId(1001);
            response.setNome("Maria Silva");
            response.setEmail("maria@email.com");
            return response;
        }

        throw new ClienteNaoEncontradoException(
                "Cliente não encontrado: " + request.getId());
    }
}
