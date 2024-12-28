// Step 1: Abstract Products
interface Button {
    void display();
}

interface TextField {
    void display();
}

// Step 2: Concrete Products
class LightButton implements Button {
    @Override
    public void display() {
        System.out.println("Light Button");
    }
}

class DarkButton implements Button {
    @Override
    public void display() {
        System.out.println("Dark Button");
    }
}

class LightTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Light TextField");
    }
}

class DarkTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Dark TextField");
    }
}

// Step 3: Abstract Factory
interface ThemeFactory {
    Button createButton();
    TextField createTextField();
}

// Step 4: Concrete Factories
class LightThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public TextField createTextField() {
        return new LightTextField();
    }
}

class DarkThemeFactory implements ThemeFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public TextField createTextField() {
        return new DarkTextField();
    }
}

// Step 5: Client
public class WithAbstractFactory {
    public static void main(String[] args) {
        ThemeFactory themeFactory = new LightThemeFactory(); // Change to DarkThemeFactory for dark theme

        Button button = themeFactory.createButton();
        TextField textField = themeFactory.createTextField();

        button.display();
        textField.display();
    }
}
