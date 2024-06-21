package subsistema1.crm;

/*This code defines a CrmService class with a private constructor and a method gravarCliente.
 * The method gravarCliente prints out information about a client being saved in the CRM system. */

 //@author amandaestevez

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Client registered in the CRM system.");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }

}
