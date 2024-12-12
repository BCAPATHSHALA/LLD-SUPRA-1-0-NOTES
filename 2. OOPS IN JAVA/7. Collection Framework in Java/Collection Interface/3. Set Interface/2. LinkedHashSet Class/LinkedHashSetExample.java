// Read More: https://www.programiz.com/java-programming/linkedhashset

/*
 The LinkedHashSet class of the Java collections framework provides functionalities of both the hashtable and the linked list data structure.
*/

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        // Create a LinkedHashSet
        Set<Integer> set1 = new LinkedHashSet<>();

        // Insert Elements to LinkedHashSet
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set 1: " + set1); 
        // Output: [1, 2, 3]

        // Insert Elements using addAll()
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set1.addAll(set2);
        System.out.println("Set 1 after addAll(): " + set1); 
        // Output: [1, 2, 3, 4, 5]

        // Access LinkedHashSet Elements
        boolean containsElement = set1.contains(3);
        System.out.println("Set 1 contains 3: " + containsElement); 
        // Output: true

        // Remove Elements
        set1.remove(2);
        System.out.println("Set 1 after removing 2: " + set1); 
        // Output: [1, 3, 4, 5]

        // Remove Elements using removeAll()
        set1.removeAll(set2);
        System.out.println("Set 1 after removeAll(set2): " + set1); 
        // Output: [1]

        //? Set Operations
        // Recreate sets for set operations
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        // Union of Sets
        Set<Integer> unionSet = new LinkedHashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union of set1 and set2: " + unionSet); 
        // Output: [1, 2, 3, 4, 5]

        // Intersection of Sets
        Set<Integer> intersectionSet = new LinkedHashSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + intersectionSet); 
        // Output: [3, 4, 5]

        // Difference of Sets
        Set<Integer> differenceSet = new LinkedHashSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference of set1 and set2: " + differenceSet); 
        // Output: [1, 2]

        // Subset
        boolean isSubset = set2.containsAll(intersectionSet);
        System.out.println("Is intersectionSet a subset of set2: " + isSubset); 
        // Output: true
    }
}
