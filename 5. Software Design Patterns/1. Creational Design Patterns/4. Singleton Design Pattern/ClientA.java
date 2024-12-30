// Implementing Singleton Design Pattern in Java
class Singleton {
    // Static member holds only one instance of the Singleton class & it is initially null
    private static Singleton instance;

    // Singleton class private constructor to prevent instantiation from other classes
    private Singleton(){
        System.out.println("Singleton is Instantiated.");
    }

    // Static factory method to provide the global point of access to the Singleton class
    public static Singleton getInstance(){
        if (instance == null){
            // If there is no instance available, create a new one
            instance = new Singleton();
        }
        
        // Return the Singleton instance
        return instance;
    }
}
    

// ClientA 
public class ClientA {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Client A: Singleton is " + singleton);
    }
}