package javadesignpatterns;

//Teste
public class Teste {
 public static void main(String[] args) {
	 PaymentFacade facade = Singleton.getInstance().getPaymentFacade();
     
     // Usando a fachada de pagamento para efetuar pagamentos
     facade.payWithCreditCard("João", "1234 5678 9012 3456", "123", "10/25", 100.0);
     facade.payWithPayPal("joao@email.com", "senha123", 50.0);
 }
}