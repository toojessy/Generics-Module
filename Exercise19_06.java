import java.util.ArrayList;

/**
 * Exercise 19.6: Largest element in an ArrayList
 */
public class Exercise19_06 {
    
    /**
     * Finds the maximum element in an ArrayList.
     *
     * @param list the ArrayList to search
     * @return the maximum element
     */
    public static <E extends Comparable<E>> E max(ArrayList<E> list) {
        // Optional safety check
        if (list == null || list.isEmpty()) {
            return null;
        }

        // Assume the first element is the maximum
        E max = list.get(0);

        // Compare each element to the current max
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).compareTo(max) > 0) {
                max = list.get(i);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        // Test with Integers
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(15);
        intList.add(3);
        intList.add(42);
        intList.add(7);
        intList.add(28);
        
        System.out.println("Integer list: " + intList);
        Integer maxInt = max(intList);
        System.out.println("Maximum: " + maxInt);
        
        // Test with Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("zebra");
        stringList.add("banana");
        stringList.add("cherry");
        
        System.out.println("\nString list: " + stringList);
        String maxString = max(stringList);
        System.out.println("Maximum: " + maxString);
        
        // Test with Doubles
        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.5);
        doubleList.add(1.2);
        doubleList.add(7.8);
        doubleList.add(2.1);
        
        System.out.println("\nDouble list: " + doubleList);
        Double maxDouble = max(doubleList);
        System.out.println("Maximum: " + maxDouble);
    }
}
