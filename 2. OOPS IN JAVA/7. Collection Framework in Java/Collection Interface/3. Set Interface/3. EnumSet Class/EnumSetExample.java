// Read More: https://www.programiz.com/java-programming/enumset
/* 
The EnumSet class of the Java collections framework provides a set implementation of elements of a single enum.
*/

import java.util.EnumSet;
import java.util.Set;

public class EnumSetExample {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {
        // Create an EnumSet
        Set<Day> days1 = EnumSet.of(Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY);
        System.out.println("Days 1: " + days1); 
        // Output: [MONDAY, WEDNESDAY, FRIDAY]

        // Insert Elements using add()
        days1.add(Day.SUNDAY);
        System.out.println("Days 1 after add(): " + days1); 
        // Output: [MONDAY, WEDNESDAY, FRIDAY, SUNDAY]

        // Insert Elements using addAll()
        Set<Day> days2 = EnumSet.of(Day.TUESDAY, Day.THURSDAY);
        days1.addAll(days2);
        System.out.println("Days 1 after addAll(): " + days1); 
        // Output: [MONDAY, WEDNESDAY, FRIDAY, SUNDAY, TUESDAY, THURSDAY]

        // Access EnumSet Elements
        boolean containsElement = days1.contains(Day.MONDAY);
        System.out.println("Days 1 contains MONDAY: " + containsElement); 
        // Output: true

        // Remove Elements
        days1.remove(Day.MONDAY);
        System.out.println("Days 1 after remove(): " + days1); 
        // Output: [WEDNESDAY, FRIDAY, SUNDAY, TUESDAY, THURSDAY]

        // Remove Elements using removeAll()
        days1.removeAll(days2);
        System.out.println("Days 1 after removeAll(days2): " + days1); 
        // Output: [WEDNESDAY, FRIDAY, SUNDAY]

        //? Set Operations
        // Recreate sets for set operations
        days1.add(Day.THURSDAY);

        // Union of Sets
        Set<Day> unionSet = EnumSet.copyOf(days1);
        unionSet.addAll(days2);
        System.out.println("Union of days1 and days2: " + unionSet); 
        // Output: [WEDNESDAY, FRIDAY, SUNDAY, THURSDAY, TUESDAY]

        // Intersection of Sets
        Set<Day> intersectionSet = EnumSet.copyOf(days1);
        intersectionSet.retainAll(days2);
        System.out.println("Intersection of days1 and days2: " + intersectionSet); 
        // Output: [THURSDAY]

        // Difference of Sets
        Set<Day> differenceSet = EnumSet.copyOf(days1);
        differenceSet.removeAll(days2);
        System.out.println("Difference of days1 and days2: " + differenceSet); 
        // Output: [WEDNESDAY, FRIDAY, SUNDAY]

        // Subset
        boolean isSubset = days2.containsAll(intersectionSet);
        System.out.println("Is intersectionSet a subset of days2: " + isSubset); 
        // Output: true
    }
}
