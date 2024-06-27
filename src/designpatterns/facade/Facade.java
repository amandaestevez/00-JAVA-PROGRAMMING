package designpatterns.facade;

import mailsystem.crm.CrmService;
import mailsystem.cep.CepApi;

public class Facade {
    
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}

/*This code snippet is a Java implementation of the Facade design pattern. 
 * It provides a simplified interface for interacting with the subsystems "CrmService" and "CepApi" by encapsulating their functionalities behind a single method "migrarCliente". 
 * This method takes in a client's name and zip code, retrieves the city and state information using the CepApi, and then uses the CrmService to record the client's information. */