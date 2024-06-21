package padroesprojetojava.Singleton;

public class Test {
    public static void main(String[] args) {

        //Teste para verificar o funcionamento do Singleton Lazy
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        
        //Teste para verificar o funcionamento do Singleton Eager
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        //Teste para verificar o funcionamento do Singleton Lazy Holder
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
    }
} 