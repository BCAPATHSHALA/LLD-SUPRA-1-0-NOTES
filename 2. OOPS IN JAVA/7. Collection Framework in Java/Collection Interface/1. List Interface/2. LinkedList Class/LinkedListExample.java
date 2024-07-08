import java.util.List;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create Integer type arraylist
        List<Integer> linkedList1 = new LinkedList<>();

        //? Comman Methods of Collection for All Sub-Interfaces
        // Method 1: add() - inserts the specified element to the collection
        linkedList1.add(10);
        linkedList1.add(20);
        linkedList1.add(30);
        System.out.println("Output 1: " + linkedList1);
        // Output: [10, 20, 30]

        // Method 2: size() - returns the size of the collection
        int size = linkedList1.size();
        System.out.println("Output 2: " + size);
        // Output: 3

        // Method 3: remove() - removes the specified element from the collection
        linkedList1.remove(0);
        System.out.println("Output 3: " + linkedList1);
        // Output: [20, 30]

        // Method 4: iterator() - returns an iterator to access elements of the collection
        Iterator<Integer> iterate = linkedList1.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();
        // Output: 20, 30,

        // Method 5: addAll() - adds all the elements of a specified collection to the collection
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(100);
        System.out.println("Output 4: " + linkedList2);
        // Output: [100]

        linkedList1.addAll(linkedList2);
        System.out.println("Output 5: " + linkedList1);
        // Output: [20, 30, 100]

        // Method 6: removeAll() - removes all the elements of the specified collection from the collection
        linkedList1.removeAll(linkedList2);
        System.out.println("Output 6: " + linkedList1);
        // Output: [20, 30]

        // Method 7: clear() - removes all the elements of the collection
        linkedList1.clear();
        System.out.println("Output 7: " + linkedList1);
        // Output: []

        //? Common Methods of List for All Classes: ArrayList, LinkedList, Stack, Vector
        List<Integer> linkedList3 = new LinkedList<>();

        linkedList3.add(100);
        linkedList3.add(101);
        linkedList3.add(102);
        System.out.println("Output 8: "+ linkedList3);
        // Output: [100,101,102]

        // Method get(): helps to randomly access elements from lists
        System.out.println("Output 9: "+ linkedList3.get(0));
        // Output: 100

        // Method set(): changes elements of lists
        linkedList3.set(1, 1000);
        System.out.println("Output 10: "+ linkedList3);
        // Output: [100,1000,102]

        // Method toArray(): converts a list into an array

        // Step 1: Create a new array of Integer type & size of array is same as the ArrayList
        Integer[] arr = new Integer[linkedList3.size()];

        // Step 2: convert ArrayList into an array
        linkedList3.toArray(arr);

        // Step 3: print all elements of the array
        System.out.print("Output 11: ");
        for(Integer item: arr) {
            System.out.print(item+", ");
        }
        System.out.println();
        // Output: 100, 1000, 102,

        // Method contains(): returns true if a list contains specific element
        System.out.println("Output 12: "+ linkedList3.contains(1000));
        // Output: true

        //? Methods of LinkedList Class
        List<Integer> linkedList4 = new LinkedList<>();
        linkedList4.add(100);
        linkedList4.add(200);
        linkedList4.add(300);
        linkedList4.add(400);
        linkedList4.add(300);
        System.out.println("Output 13: "+ linkedList4);
        // Output: [100,200,300,400,300]

        // Method indexOf():	returns the index of the first occurrence of the element
        System.out.println("Output 14: "+linkedList4.indexOf(400));
        // Output: 3

        // Method lastIndexOf():	returns the index of the last occurrence of the element
        System.out.println("Output 15: "+linkedList4.lastIndexOf(300));
        // Output: 4
    }
}