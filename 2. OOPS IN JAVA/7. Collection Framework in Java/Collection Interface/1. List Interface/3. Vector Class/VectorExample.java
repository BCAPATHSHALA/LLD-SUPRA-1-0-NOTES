import java.util.List;
import java.util.Vector;
import java.util.Iterator;

public class VectorExample {
    public static void main(String[] args) {
        // Create Integer type vector
        List<Integer> vector1 = new Vector<>();

        //? Common Methods of Collection for All Sub-Interfaces
        // Method 1: add() - inserts the specified element to the collection
        vector1.add(10);
        vector1.add(20);
        vector1.add(30);
        System.out.println("Output 1: " + vector1);
        // Output: [10, 20, 30]

        // Method 2: size() - returns the size of the collection
        int size = vector1.size();
        System.out.println("Output 2: " + size);
        // Output: 3

        // Method 3: remove() - removes the specified element from the collection
        vector1.remove(0);
        System.out.println("Output 3: " + vector1);
        // Output: [20, 30]

        // Method 4: iterator() - returns an iterator to access elements of the collection
        Iterator<Integer> iterate = vector1.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();
        // Output: 20, 30,

        // Method 5: addAll() - adds all the elements of a specified collection to the collection
        Vector<Integer> vector2 = new Vector<>();
        vector2.add(100);
        System.out.println("Output 4: " + vector2);
        // Output: [100]
        
        vector1.addAll(vector2);
        System.out.println("Output 5: " + vector1);
        // Output: [20, 30, 100]

        // Method 6: removeAll() - removes all the elements of the specified collection from the collection
        vector1.removeAll(vector2);
        System.out.println("Output 6: " + vector1);
        // Output: [20, 30]

        // Method 7: clear() - removes all the elements of the collection
        vector1.clear();
        System.out.println("Output 7: " + vector1);
        // Output: []

        //? Methods of Vector Class
        // Method add(index, element) - adds an element to the specified position
        vector1.add(0, 40);
        vector1.add(1, 50);
        System.out.println("Output 8: " + vector1);
        // Output: [40, 50]

        // Method toString() - converts the vector into a String
        String vectorString = vector1.toString();
        System.out.println("Output 9: " + vectorString);
        // Output: [40, 50]
    }
}
