package br.gov.sp.cps.cliente_soap.exception;
import org.springframework.ws.soap.server.endpoint.annotation.FaultCode;
import org.springframework.ws.soap.server.endpoint.annotation.SoapFault;

@SoapFault(faultCode = FaultCode.CLIENT)
public class ClienteNaoEncontradoException extends RuntimeException {
    public ClienteNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}