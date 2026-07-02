// Strategy Interface
interface PaymentStrategy {
    void pay(int amount);
}

// Concrete Strategy 1
class CreditCardPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid Rs." + amount + " using Credit Card");
    }
}

// Concrete Strategy 2
class UpiPayment implements PaymentStrategy {
    public void pay(int amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }
}

// Context
class ShoppingCart {
    private PaymentStrategy payment;

    public void setPaymentStrategy(PaymentStrategy payment) {
        this.payment = payment;
    }

    public void checkout(int amount) {
        payment.pay(amount);
    }
}

// Client
public class StrategyPatternDemo {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(1000);

        cart.setPaymentStrategy(new UpiPayment());
        cart.checkout(500);
    }
}