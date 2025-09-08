package Arrays;

import java.util.Arrays; // Import Arrays class for utility methods

public class Main {
    public static void main(String[] args){

        // array = a collection of values of the same data type
        //       * think of it as a variable that can store more than 1 value *

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        // ---------------- Common Array Methods ----------------

        // 1. Get array length
        int numOfFruits = fruits.length;  
        System.out.println("Number of fruits: " + numOfFruits);

        // 2. Sort array in alphabetical order
        Arrays.sort(fruits);  
        System.out.println("Sorted fruits: " + Arrays.toString(fruits));

        // 3. Fill array with a single value
        String[] filledArray = new String[5];
        Arrays.fill(filledArray, "mango");
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // 4. Copy array to a new array
        String[] copiedArray = Arrays.copyOf(fruits, fruits.length);
        System.out.println("Copied array: " + Arrays.toString(copiedArray));

        // 5. Copy a range from array
        String[] rangeArray = Arrays.copyOfRange(fruits, 1, 3); // index 1 to 2
        System.out.println("Range array: " + Arrays.toString(rangeArray));

        // 6. Check if two arrays are equal
        boolean isEqual = Arrays.equals(fruits, copiedArray);
        System.out.println("fruits == copiedArray ? " + isEqual);

        // 7. Binary search (array must be sorted!)
        int index = Arrays.binarySearch(fruits, "orange");
        System.out.println("Index of 'orange': " + index);

        // 8. Convert array to String (for easy printing)
        System.out.println("Fruits array as string: " + Arrays.toString(fruits));

        // 9. Stream operations (Java 8+)
        long count = Arrays.stream(fruits).filter(f -> f.startsWith("b")).count();
        System.out.println("Fruits starting with 'b': " + count);

        // This uses a lambda expression (f -> f.startsWith("b")).

        // ---------------- Print all elements ----------------
        System.out.println("\nFinal Fruits List:");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
