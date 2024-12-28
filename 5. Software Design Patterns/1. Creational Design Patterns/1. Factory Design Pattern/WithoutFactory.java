class AndroidPhone {
    void display() {
        System.out.println("Android Phone");
    }
}

class IPhone {
    void display() {
        System.out.println("iPhone");
    }
}

public class WithoutFactory {
    public static void main(String[] args) {
        AndroidPhone androidPhone = new AndroidPhone();
        IPhone iPhone = new IPhone();

        androidPhone.display();
        iPhone.display();
    }
}
