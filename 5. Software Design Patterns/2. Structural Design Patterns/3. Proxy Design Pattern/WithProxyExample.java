// Step 1: Subject Interface
interface Database {
    void connect();
    void fetchData();
}

// Step 2: Real Subject
class RealDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting to the database...");
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching data from the database...");
    }
}

// Step 3: Proxy
class DatabaseProxy implements Database {
    private RealDatabase realDatabase;
    private boolean isAuthorized = false;

    public DatabaseProxy(boolean isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    @Override
    public void connect() {
        if (isAuthorized) {
            if (realDatabase == null) {
                realDatabase = new RealDatabase();
            }
            realDatabase.connect();
        } else {
            System.out.println("Access Denied: You are not authorized to connect to the database.");
        }
    }

    @Override
    public void fetchData() {
        if (isAuthorized) {
            if (realDatabase == null) {
                realDatabase = new RealDatabase();
            }
            realDatabase.fetchData();
        } else {
            System.out.println("Access Denied: You are not authorized to fetch data.");
        }
    }
}

// Client Code
public class WithProxyExample {
    public static void main(String[] args) {
        Database unauthorizedProxy = new DatabaseProxy(false);
        unauthorizedProxy.connect();
        unauthorizedProxy.fetchData();

        System.out.println("---");

        Database authorizedProxy = new DatabaseProxy(true);
        authorizedProxy.connect();
        authorizedProxy.fetchData();
    }
}
