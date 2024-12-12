import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {
    public static void main(String[] args) {
        Queue<Integer> linkedList1 = new LinkedList<>();

        // add elements
        linkedList1.add(100);
        linkedList1.add(200);
        linkedList1.add(300);
        System.out.println("LinkedList: " + linkedList1);
        // Output: LinkedList: [100,200,300]

        // access the first element
        Integer val = linkedList1.peek();
        System.out.println("Accessed Element: " + val);
        // Output: Accessed Element: 100

        // access and remove the first element
        Integer val2 = linkedList1.poll();
        System.out.println("Removed Element: " + val2);
        // Output: Removed Element: 100
        System.out.println("LinkedList after poll(): " + linkedList1);
        // Output: LinkedList: [200,300]

        // add element at the end
        linkedList1.offer(1000);
        System.out.println("LinkedList after offer(): " + linkedList1);
        // Output: LinkedList: [200,300,1000]
    }
}