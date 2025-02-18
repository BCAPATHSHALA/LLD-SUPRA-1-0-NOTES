// Step 1: Create an abstract Handler
abstract class SupportHandler {
    protected SupportHandler nextHandler;

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String issue);
}

// Step 2: Create Concrete Handlers
class CustomerSupport extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Basic")) {
            System.out.println("Customer Support: Handling the issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

class Supervisor extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Intermediate")) {
            System.out.println("Supervisor: Handling the issue.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(issue);
        }
    }
}

class Manager extends SupportHandler {
    public void handleRequest(String issue) {
        if (issue.equals("Critical")) {
            System.out.println("Manager: Handling the issue.");
        } else {
            System.out.println("No one can handle this request.");
        }
    }
}

// Step 3: Client Code
public class WithChainRDP {
    public static void main(String[] args) {
        SupportHandler customerSupport = new CustomerSupport();
        SupportHandler supervisor = new Supervisor();
        SupportHandler manager = new Manager();

        // Form the chain
        customerSupport.setNextHandler(supervisor);
        supervisor.setNextHandler(manager);

        // Send requests
        customerSupport.handleRequest("Basic");
        customerSupport.handleRequest("Intermediate");
        customerSupport.handleRequest("Critical");
    }
}
