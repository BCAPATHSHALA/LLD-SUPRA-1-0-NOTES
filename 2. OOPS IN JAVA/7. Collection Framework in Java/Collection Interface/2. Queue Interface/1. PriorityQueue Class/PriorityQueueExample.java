import java.util.Queue;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create Integer type PriorityQueue (Min Heap)
        Queue<Integer> priorityQueue = new PriorityQueue<>();

        // Method 1: add() - inserts the specified element to the queue
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        System.out.println("Output 1: " + priorityQueue);
        // Output: [10, 30, 20]

        // Method 2: offer() - inserts the specified element to the queue
        boolean isAdded = priorityQueue.offer(40);
        System.out.println("Output 2: " + priorityQueue + ", Added: " + isAdded);
        // Output: [10, 30, 20, 40], Added: true

        // Method 3: element() - returns the head of the queue
        Integer headElement = priorityQueue.element();
        System.out.println("Output 3: " + headElement);
        // Output: 10

        // Method 4: peek() - retrieves, but does not remove, the head of the queue
        Integer headPeek = priorityQueue.peek();
        System.out.println("Output 4: " + headPeek);
        // Output: 10

        // Method 5: remove() - removes the head of the queue
        priorityQueue.remove();
        System.out.println("Output 5: " + priorityQueue);
        // Output: [20, 30, 40]

        // Method 6: poll() - retrieves and removes the head of the queue
        Integer polledElement = priorityQueue.poll();
        System.out.println("Output 6: " + priorityQueue + ", Polled: " + polledElement);
        // Output: [30, 40], Polled: 20

        // Method 7: clear() - removes all the elements of the queue
        priorityQueue.clear();
        System.out.println("Output 7: " + priorityQueue);
        // Output: []

        // Demonstrating behavior when queue is empty
        try {
            priorityQueue.element();
        } catch (Exception e) {
            System.out.println("Output 8: element() threw an exception because the queue is empty.");
        }
        // Output: element() threw an exception because the queue is empty.

        Integer emptyPeek = priorityQueue.peek();
        System.out.println("Output 9: peek() on empty queue: " + emptyPeek);
        // Output: peek() on empty queue: null

        Integer emptyPoll = priorityQueue.poll();
        System.out.println("Output 10: poll() on empty queue: " + emptyPoll);
        // Output: poll() on empty queue: null

        try {
            priorityQueue.remove();
        } catch (Exception e) {
            System.out.println("Output 11: remove() threw an exception because the queue is empty.");
        }
        // Output: remove() threw an exception because the queue is empty.
    }
}
