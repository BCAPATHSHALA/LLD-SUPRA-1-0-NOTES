import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create Integer type arraylist
        List<Integer> arrayList1 = new ArrayList<>();

        //? Common Methods of Collection for All Sub-Interfaces
        // Method 1: add() - inserts the specified element to the collection
        arrayList1.add(10);
        arrayList1.add(20);
        arrayList1.add(30);
        System.out.println("Output 1: " + arrayList1);
        // Output: [10, 20, 30]

        // Method 2: size() - returns the size of the collection
        int size = arrayList1.size();
        System.out.println("Output 2: " + size);
        // Output: 3

        // Method 3: remove() - removes the specified element from the collection
        arrayList1.remove(0);
        System.out.println("Output 3: " + arrayList1);
        // Output: [20, 30]

        // Method 4: iterator() - returns an iterator to access elements of the collection
        Iterator<Integer> iterate = arrayList1.iterator();
        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }
        System.out.println();
        // Output: 20, 30,

        // Method 5: addAll() - adds all the elements of a specified collection to the collection
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(100);
        System.out.println("Output 4: " + arrayList2);
        // Output: [100]
        arrayList1.addAll(arrayList2);
        System.out.println("Output 5: " + arrayList1);
        // Output: [20, 30, 100]

        // Method 6: removeAll() - removes all the elements of the specified collection from the collection
        arrayList1.removeAll(arrayList2);
        System.out.println("Output 6: " + arrayList1);
        // Output: [20, 30]

        // Method 7: clear() - removes all the elements of the collection
        arrayList1.clear();
        System.out.println("Output 7: " + arrayList1);
        // Output: []

        //? Common Methods of List for All Classes: ArrayList, LinkedList, Stack, Vector
        List<Integer> arrayList3 = new ArrayList<>();

        arrayList3.add(100);
        arrayList3.add(101);
        arrayList3.add(102);
        System.out.println("Output 8: "+ arrayList3);
        // Output: [100,101,102]

        // Method get(): helps to randomly access elements from lists
        System.out.println("Output 9: "+ arrayList3.get(0));
        // Output: 100

        // Method set(): changes elements of lists
        arrayList3.set(1, 1000);
        System.out.println("Output 10: "+ arrayList3);
        // Output: [100,1000,102]

        // Method toArray(): converts a list into an array

        // Step 1: Create a new array of Integer type & size of array is same as the ArrayList
        Integer[] arr = new Integer[arrayList3.size()];

        // Step 2: convert ArrayList into an array
        arrayList3.toArray(arr);

        // Step 3: print all elements of the array
        System.out.print("Output 11: ");
        for(Integer item: arr) {
            System.out.print(item+", ");
        }
        System.out.println();
        // Output: 100, 1000, 102,

        // Method contains(): returns true if a list contains specific element
        System.out.println("Output 12: "+ arrayList3.contains(1000));
        // Output: true

        //? Methods of ArrayList Class
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(7);
        numbers1.add(3);
        numbers1.add(9);
        numbers1.add(1);
        System.out.println("Unsorted ArrayList: " + numbers1);
        // Output: Unsorted ArrayList: [7, 3, 9, 1]

        // Method sort(): Sort the Arraylist elements
        // sort the ArrayList in ascending order
        numbers1.sort(Comparator.naturalOrder());
        System.out.println("Sorted ArrayList: " + numbers1);
        // Output: Sorted ArrayList: [1, 3, 7, 9]

        // sort the ArrayList in ascending order
        numbers1.sort(Comparator.reverseOrder());
        System.out.println("Sorted ArrayList: " + numbers1);
        // Output: Sorted ArrayList: [9, 7, 3, 1]

        // Method clone(): Creates a new Arraylist with the same element, size, and capacity
        @SuppressWarnings("unchecked")
        ArrayList<Integer> cloneNumber = (ArrayList<Integer>)numbers1.clone();
        System.out.println("Cloned ArrayList: " + cloneNumber);
        // Output: Cloned ArrayList: [9, 7, 3, 1]

        // Method ensureCapacity(): Specifies the total element the Arraylist can contain
        ArrayList<String> languages= new ArrayList<>();

        // set the capacity of the arraylist
        languages.ensureCapacity(3);

        // Add elements in the ArrayList
        languages.add("Java");
        languages.add("Python");
        languages.add("C");
        languages.add("C++");
        System.out.println("Languages ArrayList: " + languages);
        // Output: Languages ArrayList: [Java, Python, C, C++]
        /*
         Why do we need to resize arraylist using the ensureCapacity() method if the arraylist can automatically resize itself?
         
         It is because if we use the ensureCapacity() to resize the arraylist, then the arraylist will be resized at once with the specified capacity. Otherwise, the arraylist will be resized every time when an element is added.
         */

         // Method isEmpty(): Checks if the Arraylist is empty.
         System.out.println("ArrayList is empty: "+ languages.isEmpty());
         // Output: ArrayList is empty: false

         // Method indexOf(): Searches a specified element in an Arraylist and returns the index of the element.
         System.out.println("Index of C++: " + languages.indexOf("C++"));
         // Output: Index of C++: 3
    }
}

