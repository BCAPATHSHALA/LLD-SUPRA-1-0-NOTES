// Program 2: ArrayDeque Class Of Deque Interface
import java.util.Deque;
import java.util.ArrayDeque;

public class ArrayDequeDequeMethods {
    public static void main(String[] args) {
        // Create an ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        // Method 1: addFirst()
        deque.addFirst(10);
        deque.addFirst(20);
        System.out.println("Output 1: " + deque);  
        // Output: [20, 10]

        // Method 2: addLast()
        deque.addLast(30);
        System.out.println("Output 2: " + deque);  
        // Output: [20, 10, 30]

        // Method 3: offerFirst()
        boolean offerFirstResult = deque.offerFirst(40);
        System.out.println("Output 3: " + deque + ", OfferFirst: " + offerFirstResult);  
        // Output: [40, 20, 10, 30], OfferFirst: true

        // Method 4: offerLast()
        boolean offerLastResult = deque.offerLast(50);
        System.out.println("Output 4: " + deque + ", OfferLast: " + offerLastResult);  
        // Output: [40, 20, 10, 30, 50], OfferLast: true

        // Method 5: getFirst()
        Integer firstElement = deque.getFirst();
        System.out.println("Output 5: " + firstElement);  
        // Output: 40

        // Method 6: getLast()
        Integer lastElement = deque.getLast();
        System.out.println("Output 6: " + lastElement);  
        // Output: 50

        // Method 7: peekFirst()
        Integer peekFirstElement = deque.peekFirst();
        System.out.println("Output 7: " + peekFirstElement);  
        // Output: 40

        // Method 8: peekLast()
        Integer peekLastElement = deque.peekLast();
        System.out.println("Output 8: " + peekLastElement);  
        // Output: 50

        // Method 9: removeFirst()
        Integer removedFirst = deque.removeFirst();
        System.out.println("Output 9: " + deque + ", RemovedFirst: " + removedFirst);  
        // Output: [20, 10, 30, 50], RemovedFirst: 40

        // Method 10: removeLast()
        Integer removedLast = deque.removeLast();
        System.out.println("Output 10: " + deque + ", RemovedLast: " + removedLast);  
        // Output: [20, 10, 30], RemovedLast: 50

        // Method 11: pollFirst()
        Integer polledFirst = deque.pollFirst();
        System.out.println("Output 11: " + deque + ", PolledFirst: " + polledFirst);  
        // Output: [10, 30], PolledFirst: 20

        // Method 12: pollLast()
        Integer polledLast = deque.pollLast();
        System.out.println("Output 12: " + deque + ", PolledLast: " + polledLast);  
        // Output: [10], PolledLast: 30
    }
}
