// Step 1: Mediator Interface
interface ChatMediator {
    void sendMessage(String message, User user);
}

// Step 2: Concrete Mediator
class ChatRoom implements ChatMediator {
    @Override
    public void sendMessage(String message, User user) {
        System.out.println(user.getName() + " sent: " + message);
    }
}

// Step 3: Colleague (User)
class User {
    private String name;
    private ChatMediator mediator;
    
    public User(String name, ChatMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
    
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }
    
    public String getName() {
        return name;
    }
}

// Step 4: Client
public class WithMediatorPattern {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom();
        
        User amit = new User("Amit", chatRoom);
        User raj = new User("Raj", chatRoom);
        
        amit.sendMessage("Hello, Raj!");
        raj.sendMessage("Hi, Amit!");
    }
}
