package padroesprojetojava.Singleton;

public class SingletonEager {

/**
 * Classe que implementa o padrão "Singleton Eager".
 * 
 * A instância única da classe é criada imediatamente na declaração da variável estática `instancia`.
 * 
 * @author amandaestevez 
 */

	private static SingletonEager instancia = new SingletonEager();
        /**
         * Referência privada e estática para a instância única da classe.
         * 
         * A instância é criada imediatamente, assim que a classe é carregada pela JVM.
         */
	

	private SingletonEager() {
		super();
	}
         /**
	 * Construtor privado para evitar a instanciação direta da classe.
	 * 
	 * O construtor privado garante que a classe só possa ser instanciada através do método `getInstancia`.
	 */
	
	public static SingletonEager getInstancia() {
		return instancia;

    }
         /**
	 * Método público estático que retorna a instância única da classe.
	 * 
	 * Como a instância já foi criada na declaração da variável `instancia`, este método apenas a retorna.
	 * 
	 * Retorna a instância única da classe SingletonEager.
	 */
}
