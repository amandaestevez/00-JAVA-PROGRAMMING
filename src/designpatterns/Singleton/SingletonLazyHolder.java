package designpatterns.Singleton;

//@author amandaestevez

public class SingletonLazyHolder {
    /**
     * Class that implements the "Lazy Holder" Singleton pattern.
     * The single instance of the class is created only when the `getInstancia` method is called for the first time.
     * This implementation uses the "Holder" technique to ensure lazy initialization of the instance.
     */

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    /**
     * Nested static inner class that encapsulates the single instance of the SingletonLazyHolder class.
     * The inner class is static to ensure that the instance is created only once,
     * even if the outer class is instantiated multiple times.
     */

    private SingletonLazyHolder() {
        super();
    }

    /**
     * Private constructor to prevent direct instantiation of the class.
     * The private constructor ensures that the class can only be
     * instantiated through the `getInstancia` method.
     */

    public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}