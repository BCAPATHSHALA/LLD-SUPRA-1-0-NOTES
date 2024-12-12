// Program 1: ArrayDeque Class Of Queue Interface
import java.util.Queue;
import java.util.ArrayDeque;

public class ArrayDequeQueueMethods {
    public static void main(String[] args) {
        // Create an ArrayDeque
        Queue<Integer> queue = new ArrayDeque<>();

        // Method 1: add()
        queue.add(30);
        queue.add(10);
        queue.add(20);
        System.out.println("Output 1: " + queue);  
        // Output: [30, 10, 20]

        // Method 2: offer()
        boolean isAdded = queue.offer(40);
        System.out.println("Output 2: " + queue + ", Added: " + isAdded);  
        // Output: [30, 10, 20, 40], Added: true

        // Method 3: element()
        Integer headElement = queue.element();
        System.out.println("Output 3: " + headElement);  
        // Output: 30

        // Method 4: peek()
        Integer headPeek = queue.peek();
        System.out.println("Output 4: " + headPeek);  
        // Output: 30

        // Method 5: remove()
        queue.remove();
        System.out.println("Output 5: " + queue);  
        // Output: [10, 20, 40]

        // Method 6: poll()
        Integer polledElement = queue.poll();
        System.out.println("Output 6: " + queue + ", Polled: " + polledElement);  
        // Output: [20, 40], Polled: 10

        // Demonstrating behavior when queue is empty
        queue.clear();
        try {
            queue.element();
        } catch (Exception e) {
            System.out.println("Output 7: element() threw an exception because the queue is empty.");
        }

        Integer emptyPeek = queue.peek();
        System.out.println("Output 8: peek() on empty queue: " + emptyPeek);  
        // Output: null

        Integer emptyPoll = queue.poll();
        System.out.println("Output 9: poll() on empty queue: " + emptyPoll);  
        // Output: null

        try {
            queue.remove();
        } catch (Exception e) {
            System.out.println("Output 10: remove() threw an exception because the queue is empty.");
        }
    }
}
