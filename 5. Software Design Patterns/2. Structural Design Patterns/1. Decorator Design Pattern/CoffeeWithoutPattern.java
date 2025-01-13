class SimpleCoffee {
    public String getDescription() {
        return "Simple Coffee";
    }

    public double getCost() {
        return 50.0;
    }
}

class MilkCoffee extends SimpleCoffee {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 10.0;
    }
}

class MilkSugarCoffee extends MilkCoffee {
    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 5.0;
    }
}

// Main Class
public class CoffeeWithoutPattern {
    public static void main(String[] args) {
        MilkSugarCoffee coffee = new MilkSugarCoffee();
        System.out.println(coffee.getDescription() + " -> Cost: " + coffee.getCost());
    }
}
