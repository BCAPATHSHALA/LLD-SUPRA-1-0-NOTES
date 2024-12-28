class LightButton {
    void display() {
        System.out.println("Light Button");
    }
}

class DarkButton {
    void display() {
        System.out.println("Dark Button");
    }
}

class LightTextField {
    void display() {
        System.out.println("Light TextField");
    }
}

class DarkTextField {
    void display() {
        System.out.println("Dark TextField");
    }
}

public class WithoutAbstractFactory {
    public static void main(String[] args) {
        LightButton lightButton = new LightButton();
        LightTextField lightTextField = new LightTextField();

        DarkButton darkButton = new DarkButton();
        DarkTextField darkTextField = new DarkTextField();

        lightButton.display();
        lightTextField.display();
        darkButton.display();
        darkTextField.display();
    }
}
