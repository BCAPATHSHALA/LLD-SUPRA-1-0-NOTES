// Program 3: ArrayDeque as a Stack
import java.util.ArrayDeque;

public class ArrayDequeAsStack {
    public static void main(String[] args) {
        // Create an ArrayDeque to use as a Stack
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        // Method 1: push()
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Output 1: " + stack);  
        // Output: [30, 20, 10]

        // Method 2: peek()
        Integer topElement = stack.peek();
        System.out.println("Output 2: " + topElement);  
        // Output: 30

        // Method 3: pop()
        Integer poppedElement = stack.pop();
        System.out.println("Output 3: " + stack + ", Popped: " + poppedElement);  
        // Output: [20, 10], Popped: 30
    }
}
