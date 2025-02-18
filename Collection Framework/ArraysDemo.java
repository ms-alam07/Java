import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        // Initialize an array
        int[] numbers = {5, 2, 8, 1, 3};

        // 1️⃣ Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // 2️⃣ Binary Search (Array must be sorted)
        int index = Arrays.binarySearch(numbers, 3);
        System.out.println("Index of 3: " + index);

        // 3️⃣ Copying an array
        int[] copiedArray = Arrays.copyOf(numbers, numbers.length);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // 4️⃣ Copying a range of an array
        int[] rangeCopy = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Range Copied (index 1 to 3): " + Arrays.toString(rangeCopy));

        // 5️⃣ Filling an array with a value
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 7);
        System.out.println("Filled Array with 7: " + Arrays.toString(filledArray));

        // 6️⃣ Checking equality of arrays
        boolean isEqual = Arrays.equals(numbers, copiedArray);
        System.out.println("Are numbers and copiedArray equal? " + isEqual);

        // 7️⃣ Parallel Sorting (Faster sorting for large arrays)
        int[] largeArray = {20, 15, 30, 10, 5};
        Arrays.parallelSort(largeArray);
        System.out.println("Parallel Sorted Array: " + Arrays.toString(largeArray));

        // 8️⃣ Converting an array to string
        String arrayString = Arrays.toString(numbers);
        System.out.println("Array as String: " + arrayString);
    }
}
