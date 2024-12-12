// Read More: https://www.programiz.com/java-programming/treeset
/*
The TreeSet class of the Java collections framework provides the functionality of a tree data structure.
*/
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        // Create a TreeSet
        Set<Integer> set1 = new TreeSet<>();

        // Insert Elements to TreeSet
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("Set 1: " + set1); // Output: [1, 2, 3]

        // Insert Elements using addAll()
        Set<Integer> set2 = new TreeSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set1.addAll(set2);
        System.out.println("Set 1 after addAll(): " + set1); // Output: [1, 2, 3, 4, 5]

        // Access TreeSet Elements
        boolean containsElement = set1.contains(3);
        System.out.println("Set 1 contains 3: " + containsElement); // Output: true

        // Remove Elements
        set1.remove(2);
        System.out.println("Set 1 after removing 2: " + set1); // Output: [1, 3, 4, 5]

        // Remove Elements using removeAll()
        set1.removeAll(set2);
        System.out.println("Set 1 after removeAll(set2): " + set1); // Output: [1]

        // Set Operations
        // Recreate sets for set operations
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        // Union of Sets
        Set<Integer> unionSet = new TreeSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("Union of set1 and set2: " + unionSet); // Output: [1, 2, 3, 4, 5]

        // Intersection of Sets
        Set<Integer> intersectionSet = new TreeSet<>(set1);
        intersectionSet.retainAll(set2);
        System.out.println("Intersection of set1 and set2: " + intersectionSet); // Output: [3, 4, 5]

        // Difference of Sets
        Set<Integer> differenceSet = new TreeSet<>(set1);
        differenceSet.removeAll(set2);
        System.out.println("Difference of set1 and set2: " + differenceSet); // Output: [1, 2]

        // Subset
        boolean isSubset = set2.containsAll(intersectionSet);
        System.out.println("Is intersectionSet a subset of set2: " + isSubset); // Output: true
    }
}
