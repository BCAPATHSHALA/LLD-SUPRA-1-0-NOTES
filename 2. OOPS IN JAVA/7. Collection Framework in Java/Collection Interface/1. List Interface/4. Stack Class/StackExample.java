import java.util.List;
import java.util.Stack;
import java.util.Iterator;

public class StackExample {
    public static void main(String[] args) {
        // Create Integer type stack
        List<Integer> stack1 = new Stack<>();

        //? Common Methods of Collection for All Sub-Interfaces
        // Method 1: add() - inserts the specified element to the collection
        stack1.add(10);
        stack1.add(20);
        stack1.add(30);
        System.out.println("Output 1: " + stack1);
        // Output: [10, 20, 30]

        // Method 2: size() - returns the size of the collection
        int size = stack1.size();
        System.out.println("Output 2: " + size);
        // Output: 3

        // Method 3: remove() - removes the specified element from the collection
        stack1.remove(0);
        System.out.println("Output 3: " + stack1);
        // Output: [20, 30]

        // Method 4: iterator() - returns an iterator to access elements of the collection
        Iterator<Integer> iterate = stack1.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();
        // Output: 20, 30,

        // Method 5: addAll() - adds all the elements of a specified collection to the collection
        Stack<Integer> stack2 = new Stack<>();
        stack2.add(100);
        System.out.println("Output 4: " + stack2);
        // Output: [100]
        
        stack1.addAll(stack2);
        System.out.println("Output 5: " + stack1);
        // Output: [20, 30, 100]

        // Method 6: removeAll() - removes all the elements of the specified collection from the collection
        stack1.removeAll(stack2);
        System.out.println("Output 6: " + stack1);
        // Output: [20, 30]

        // Method 7: clear() - removes all the elements of the collection
        stack1.clear();
        System.out.println("Output 7: " + stack1);
        // Output: []

        //? Methods of Stack Class
        Stack<Integer> stack3 = new Stack<>();

        // Method push() - adds an element to the top of the stack
        stack3.push(100);
        stack3.push(200);
        stack3.push(300);
        System.out.println("Output 8: " + stack3);
        // Output: [100, 200, 300]

        // Method pop() - removes an element from the top of the stack
        Integer poppedElement = stack3.pop();
        System.out.println("Output 9: " + poppedElement);
        // Output: 300
        System.out.println("Output 10: " + stack3);
        // Output: [100, 200]

        // Method peek() - returns an element from the top of the stack
        Integer peekElement = stack3.peek();
        System.out.println("Output 11: " + peekElement);
        // Output: 200

        // Method search() - searches an element in the stack and returns the position of the element from the top of the stack
        int position = stack3.search(100);
        System.out.println("Output 12: " + position);
        // Output: 2

        // Method empty() - checks whether a stack is empty or not
        boolean isEmpty = stack3.empty();
        System.out.println("Output 13: " + isEmpty);
        // Output: false
    }
}
