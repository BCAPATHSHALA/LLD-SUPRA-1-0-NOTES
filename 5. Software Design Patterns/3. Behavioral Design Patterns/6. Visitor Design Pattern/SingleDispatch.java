class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class SingleDispatch {
    public static void main(String[] args) {
        Animal myPet = new Dog();
        myPet.makeSound(); // Calls Dog's makeSound() (Single Dispatch)
    }
}
