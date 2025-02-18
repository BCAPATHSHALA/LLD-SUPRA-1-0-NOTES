class User {
    private String name;
    
    public User(String name) {
        this.name = name;
    }
    
    public void sendMessage(User receiver, String message) {
        System.out.println(this.name + " sends: " + message + " to " + receiver.getName());
        receiver.receiveMessage(message);
    }
    
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
    
    public String getName() {
        return name;
    }
}

public class WithoutMediatorPattern {
    public static void main(String[] args) {
        User user1 = new User("Raj");
        User user2 = new User("Amit");
        
        user1.sendMessage(user2, "Hello");
        user2.sendMessage(user1, "Ha Bol");
    }
}

/*
OUTPUT:
Raj sends: Hello to Amit
Amit received: Hello
Amit sends: Ha Bol to Raj
Raj received: Ha Bol
*/