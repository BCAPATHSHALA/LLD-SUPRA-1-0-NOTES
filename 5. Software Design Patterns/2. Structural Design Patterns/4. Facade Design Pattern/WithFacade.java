class Inventory {
    public void checkStock() {
        System.out.println("Stock is available.");
    }
}

class Payment {
    public void makePayment() {
        System.out.println("Payment is successful.");
    }
}

class Shipping {
    public void arrangeShipping() {
        System.out.println("Shipping is arranged.");
    }
}

// Facade
class ECommerceFacade {
    private Inventory inventory;
    private Payment payment;
    private Shipping shipping;

    public ECommerceFacade() {
        this.inventory = new Inventory();
        this.payment = new Payment();
        this.shipping = new Shipping();
    }

    public void placeOrder() {
        inventory.checkStock();
        payment.makePayment();
        shipping.arrangeShipping();
        System.out.println("Order placed successfully!");
    }
}

// Client
public class WithFacade{
    public static void main(String[] args) {
        ECommerceFacade ecommerce = new ECommerceFacade();
        ecommerce.placeOrder(); // Placing the order
    }
}
