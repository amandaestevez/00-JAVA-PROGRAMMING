package ecommerce.creatingusercatalog;
//This Java interface defines a contract for classes that want to be observable for changes in a catalog.

public interface CatalogObservable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String productName);
}

