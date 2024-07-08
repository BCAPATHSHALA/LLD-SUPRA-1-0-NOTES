import java.util.Deque;
import java.util.LinkedList;

public class LinkedListAsDQueue {
    public static void main(String[] args) {
        Deque<Integer> linkedList1 = new LinkedList<>();

        // Method addFirst() - adds the specified element at the beginning of the linked list
        linkedList1.addFirst(100);
        linkedList1.addFirst(200);
        System.out.println("After addFirst(): " + linkedList1);
        // Output: [200, 100]

        // Method addLast() - adds the specified element at the end of the linked list
        linkedList1.addLast(300);
        linkedList1.addLast(400);
        System.out.println("After addLast(): " + linkedList1);
        // Output: [200, 100, 300, 400]

        // Method getFirst() - returns the first element
        Integer firstElement = linkedList1.getFirst();
        System.out.println("First Element: " + firstElement);
        // Output: First Element: 200

        // Method getLast() - returns the last element
        Integer lastElement = linkedList1.getLast();
        System.out.println("Last Element: " + lastElement);
        // Output: Last Element: 400

        // Method removeFirst() - removes the first element
        linkedList1.removeFirst();
        System.out.println("After removeFirst(): " + linkedList1);
        // Output: [100, 300, 400]

        // Method removeLast() - removes the last element
        linkedList1.removeLast();
        System.out.println("After removeLast(): " + linkedList1);
        // Output: [100, 300]

        // Method peek() - returns the first element (head) of the linked list
        Integer peekElement = linkedList1.peek();
        System.out.println("Peek Element: " + peekElement);
        // Output: Peek Element: 100

        // Method poll() - returns and removes the first element from the linked list
        Integer pollElement = linkedList1.poll();
        System.out.println("Poll Element: " + pollElement);
        // Output: Poll Element: 100
        System.out.println("After poll(): " + linkedList1);
        // Output: [300]

        // Method offer() - adds the specified element at the end of the linked list
        linkedList1.offer(500);
        System.out.println("After offer(): " + linkedList1);
        // Output: [300, 500]
    }
}