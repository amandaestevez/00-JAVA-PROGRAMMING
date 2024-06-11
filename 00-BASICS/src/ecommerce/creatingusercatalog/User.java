package ecommerce.creatingusercatalog;

//This implements the *Observer* interface, which means it is an observer in an observer pattern.
class User implements Observer {
    private String name;

    /*
     *  This is the constructor of the class. 
     * It takes a name as a parameter and assigns it to the name attribute of the class.
     */
    public User(String name) {
        this.name = name;
    }

    /*
     * This method is required by the Observer interface. 
     * It's called when the observed object notifies the observer. 
     * In this case, it prints a notification message with the name of the added product.
     */
    @Override
    public void update(String productName) {
        System.out.println("Notification received: New product added - " + productName);
    }
}