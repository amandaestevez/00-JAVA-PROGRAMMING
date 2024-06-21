package designpatterns.Singleton;

public class SingletonEager {

/**
 * This class implements the "Singleton Eager" design pattern
 * 
 * The class' unique instance is built immediately after declaring the static variable `instancia`.
 * 
 * @author amandaestevez 
 */

	private static SingletonEager instancia = new SingletonEager();
        /**
         * Static and private reference to the class' instance
         * 
         * The instance is built immediately, as soon as JVM loads the class.
         */
	

	private SingletonEager() {
		super();
	}
	/**
	 *Private constructor to avoid direct class instantiation.
	 * It guarantees the class can only be instantiated through the "getInstancia" method.
	 */
	
	public static SingletonEager getInstancia() {
		return instancia;

    }
         /**
	 * Public static method that returns the unique instance of the class.
	 * Since the instance was created when we declared the variable `instancia`, this method simply returns it.
	 */
}
