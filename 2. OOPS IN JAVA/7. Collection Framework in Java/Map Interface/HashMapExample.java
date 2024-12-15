// Implementation of the Map Interface Using HashMap
import java.util.Map;
import java.util.HashMap;

class HashMapExample {

    public static void main(String[] args) {
        // Creating a map using the HashMap
        Map<String, Integer> numbers = new HashMap<>();

        // Method 1: Insert elements to the map
        numbers.put("One", 1);
        numbers.put("Two", 2);
        System.out.println("Map: " + numbers);

        // Method 2: Access keys of the map
        System.out.println("Keys: " + numbers.keySet());

        // Method 3:Access values of the map
        System.out.println("Values: " + numbers.values());

        // Method 4:Access entries of the map
        System.out.println("Entries: " + numbers.entrySet());

        // Method 5: Remove Elements from the map
        int value = numbers.remove("Two");
        System.out.println("Removed Value: " + value);
    }
}

/*
Output:
Map: {One=1, Two=2}
Keys: [One, Two]
Values: [1, 2]
Entries: [One=1, Two=2]
Removed Value: 2
*/
