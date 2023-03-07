package javadesignpatterns;

//Singleton Pattern
public class Singleton {
    private static Singleton instance;
    private PaymentFacade facade;
    
    private Singleton() {
        facade = new PaymentFacade();
    }
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }
    
    public PaymentFacade getPaymentFacade() {
        return facade;
    }
}