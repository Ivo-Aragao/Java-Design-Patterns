package javadesignpatterns;

//Facade Pattern
public class PaymentFacade {
 public void payWithCreditCard(String name, String cardNumber, String cvv, String dateOfExpiry, double amount) {
     PaymentStrategy strategy = new CreditCardStrategy(name, cardNumber, cvv, dateOfExpiry);
     strategy.pay(amount);
 }
 
 public void payWithPayPal(String email, String password, double amount) {
     PaymentStrategy strategy = new PayPalStrategy(email, password);
     strategy.pay(amount);
 }
}