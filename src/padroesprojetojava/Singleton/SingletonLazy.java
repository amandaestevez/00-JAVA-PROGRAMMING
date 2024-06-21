package padroesprojetojava.Singleton;

public class SingletonLazy {
/*
 * Classe que implementa o padrão "Singleton Lazy".
 * A instância única da classe é criada somente quando o método "getInstancia" é chamado pela primeira vez.
 * 
 */
    private static SingletonLazy instancia;
/**
 * Referência privada para a instância única da classe Singleton
 * 
 * Inicialmente nula, pois a instanciação é adiada (lazy).
 */

    private SingletonLazy() {
      super();
    }
/**
 * Construtor privado para evitar a instanciação direta da classe.
 * 
 * O construtor privado garante que a classe só possa ser instanciada através do método `getInstancia`.
 */

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
        instancia = new SingletonLazy();
    }
        return instancia;
    }
}
/**
 * Método público estático que retorna a instância única da classe.
 * 
 * Se a instância ainda não foi criada (`instancia == null`), o método a cria utilizando o construtor privado.
 * 
 * Em qualquer caso, o método retorna a instância existente.
 * 
 * retorna A instância única da classe SingletonLazy.
 */
