package padroesprojetojava.Singleton;

//@author amandaestevez

public class SingletonLazyHolder {
 /**
 * Classe que implementa o padrão Singleton "Lazy Holder".
 * 
 * A instância única da classe é criada somente quando o método `getInstancia` é chamado pela primeira vez.
 * 
 * Esta implementação utiliza a técnica "Holder" para garantir a inicialização lazy da instância.
 */
    
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }        
/**
* Classe interna estática aninhada que encapsula a instância única da classe SingletonLazyHolder.
* A classe interna é estática para garantir que a instância seja criada apenas uma vez, 
* mesmo que a classe externa seja instanciada várias vezes.
*/
    
    private SingletonLazyHolder() {
        super();
    }
    
   /**
	 * Construtor privado para evitar a instanciação direta da classe.
	 * 
	 * O construtor privado garante que a classe só possa ser instanciada através do método `getInstancia`.
	 */
    
     public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}