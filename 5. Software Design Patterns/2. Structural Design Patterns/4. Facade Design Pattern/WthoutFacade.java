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


// Client - ecommerce customer
public class WthoutFacade{
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        Payment payment = new Payment();
        Shipping shipping = new Shipping();

        inventory.checkStock();
        payment.makePayment();
        shipping.arrangeShipping();
    }
}
