import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeInsteadOfStackClass {
    public static void main(String[] args) {
        // Create Integer type deque
        Deque<Integer> deque1 = new ArrayDeque<>();

        //? Common Methods of Collection for All Sub-Interfaces
        // Method 1: add() - inserts the specified element to the collection
        deque1.add(10);
        deque1.add(20);
        deque1.add(30);
        System.out.println("Output 1: " + deque1);
        // Output: [10, 20, 30]

        // Method 2: size() - returns the size of the collection
        int size = deque1.size();
        System.out.println("Output 2: " + size);
        // Output: 3

        // Method 3: remove() - removes the specified element from the collection
        deque1.remove(10);
        System.out.println("Output 3: " + deque1);
        // Output: [20, 30]

        // Method 4: iterator() - returns an iterator to access elements of the collection
        Iterator<Integer> iterate = deque1.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();
        // Output: 20, 30,

        // Method 5: addAll() - adds all the elements of a specified collection to the collection
        ArrayDeque<Integer> deque2 = new ArrayDeque<>();
        deque2.add(100);
        System.out.println("Output 4: " + deque2);
        // Output: [100]
        
        deque1.addAll(deque2);
        System.out.println("Output 5: " + deque1);
        // Output: [20, 30, 100]

        // Method 6: removeAll() - removes all the elements of the specified collection from the collection
        deque1.removeAll(deque2);
        System.out.println("Output 6: " + deque1);
        // Output: [20, 30]

        // Method 7: clear() - removes all the elements of the collection
        deque1.clear();
        System.out.println("Output 7: " + deque1);
        // Output: []

        //? Methods of Deque Class
        Deque<Integer> deque3 = new ArrayDeque<>();

        // Method push() - adds an element to the top of the deque (same as addFirst)
        deque3.push(100);
        deque3.push(200);
        deque3.push(300);
        System.out.println("Output 8: " + deque3);
        // Output: [300, 200, 100]

        // Method pop() - removes an element from the top of the deque (same as removeFirst)
        Integer poppedElement = deque3.pop();
        System.out.println("Output 9: " + poppedElement);
        // Output: 300
        System.out.println("Output 10: " + deque3);
        // Output: [200, 100]

        // Method peek() - returns an element from the top of the deque (same as peekFirst)
        Integer peekElement = deque3.peek();
        System.out.println("Output 11: " + peekElement);
        // Output: 200

        // Method search() - not available in ArrayDeque, using contains as an alternative
        boolean containsElement = deque3.contains(100);
        System.out.println("Output 12: " + containsElement);
        // Output: true

        // Method isEmpty() - checks whether a deque is empty or not
        boolean isEmpty = deque3.isEmpty();
        System.out.println("Output 13: " + isEmpty);
        // Output: false
    }
}