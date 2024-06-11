

import java.util.ArrayList;
import java.util.List;

/*
 * This Java code defines a Catalog class that implements the CatalogObservable interface. 
 * It maintains a list of observers and provides methods to add, remove, and notify observers. 
 * When a product is added, it notifies the observers with the product name.
 */
class Catalog implements CatalogObservable {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
  
    @Override
    public void notifyObservers(String productName) {
      for (Observer observer : observers) {
        observer.update(productName);
      } 
    }

    public void addProduct(String name, String description, double price) {
        notifyObservers(name);
    }
}

