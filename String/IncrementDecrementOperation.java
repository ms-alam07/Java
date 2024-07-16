// Write a Java program to find the Final Value of the Variable After Performing Operations.

public class IncrementDecrementOperation {
    public static int finalValueAfterOperations(String[] operations) {
        int X = 0;
        for (String operation : operations) {
            if (operation.equals("++X") || operation.equals("X++")) {
                X++;
            } else if (operation.equals("--X") || operation.equals("X--")) {
                X--;
            }
        }
        return X;
    }

    public static void main(String[] args) {
        String[] operations = {"++X", "--X", "X++","X++"};
        System.out.println(finalValueAfterOperations(operations)); // Output: 1
    }
}
