class EagerSingleton {
    // The single instance, created immediately
    private static final EagerSingleton instance = new EagerSingleton();
    
    // Private constructor to prevent instantiation
    private EagerSingleton() {
        System.out.println("EagerSingleton is Instantiated.");
    }
    
    // Public method to get the instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}