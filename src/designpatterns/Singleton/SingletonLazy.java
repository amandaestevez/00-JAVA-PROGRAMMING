package designpatterns.Singleton;

public class SingletonLazy {
    /**
     * Class that implements the "Singleton Lazy" pattern.
     * The single instance of the class is created only when the "getInstance" method is called for the first time.
     *
     */

    private static SingletonLazy instancia;
    /**
     * Private reference to the single instance of the Singleton class.
     * Initially null, as instantiation is deferred (lazy).
     */

    private SingletonLazy() {
      super();
    }
    /**
     * Private constructor to prevent direct instantiation of the class.
     * The private constructor ensures that the class can only be instantiated through the `getInstance` method.
     */

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
        instancia = new SingletonLazy();
    }
        return instancia;
    }
}
/**
 * Public static method that returns the single instance of the class.
 * If the instance has not yet been created (`instance == null`), the method creates it using the private constructor.
 * In any case, the method returns the existing instance.
 * Returns The single instance of the SingletonLazy class.
 */

