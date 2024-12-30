class DoubleCheckedSingleton {
    // The single instance, initially null, marked as volatile to ensure visibility
    private static volatile DoubleCheckedSingleton instance;
    
    // Private constructor to prevent instantiation
    private DoubleCheckedSingleton() {
        System.out.println("DoubleCheckedSingleton is Instantiated.");
    }
    
    // Public method to get the instance
    public static DoubleCheckedSingleton getInstance() {
        // First check (not synchronized)
        if (instance == null) {
            // Synchronize on the class object
            synchronized (DoubleCheckedSingleton.class) {
                // Second check (synchronized)
                if (instance == null) {
                    // Create the instance
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        // Return the instance (either newly created or existing)
        return instance;
    }
}