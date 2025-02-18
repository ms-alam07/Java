// Write a program to right rotate the given array element.

public class RightRotation{
    public static void main(String[] args) {
        
        int a[] = {7, 15, 6, 18, 9, 13};
        int n = a.length;
        
        // Store the last element
        int temp = a[n - 1];

        // Shift elements to the right
        for (int i = n - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        // Place the last element at the first position
        a[0] = temp;

        // Print rotated array
        System.out.print("Rotated Array: ");
        for (int x : a) {
            System.out.print(x + " ");
        }
    }
}