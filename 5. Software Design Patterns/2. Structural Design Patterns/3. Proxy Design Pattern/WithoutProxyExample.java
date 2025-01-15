class DatabaseConnection {
    public void connect() {
        System.out.println("Connecting to the database...");
    }

    public void fetchData() {
        System.out.println("Fetching data from the database...");
    }
}

// Client Code
public class WithoutProxyExample {
    public static void main(String[] args) {
        DatabaseConnection dbConnection = new DatabaseConnection();
        dbConnection.connect();
        dbConnection.fetchData();
    }
}
