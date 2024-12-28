// Step 1: Create an interface (Product)
interface Phone {
    void display();
}

// Step 2: Create concrete classes (Concrete Products)
class AndroidPhone implements Phone {
    @Override
    public void display() {
        System.out.println("Android Phone");
    }
}

class IPhone implements Phone {
    @Override
    public void display() {
        System.out.println("iPhone");
    }
}

// Step 3: Create a factory class (Factory)
class PhoneFactory {
    public static Phone getPhone(String type) {
        if (type.equalsIgnoreCase("android")) {
            return new AndroidPhone();
        } else if (type.equalsIgnoreCase("iphone")) {
            return new IPhone();
        }
        return null;
    }
}

// Step 4: Use the factory in the main method
public class WithFactory {
    public static void main(String[] args) {
        Phone android = PhoneFactory.getPhone("android");
        Phone iphone = PhoneFactory.getPhone("iphone");

        android.display();
        iphone.display();
    }
}
