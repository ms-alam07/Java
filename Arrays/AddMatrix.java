// Write a java program to add two matrices of the same size.

import  java.util.*;
public class AddMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows");
        int m = sc.nextInt();

        System.out.println("Enter the number of columns");
        int n = sc.nextInt();

        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int sum[][] = new int[m][n];

        System.out.println("Enter the first matrix elements");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                a[c][d] = sc.nextInt();
            }
        }

        System.out.println("Enter the second matrix elements");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                b[c][d] = sc.nextInt();
            }
        }

        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                sum[c][d] = a[c][d] +b[c][d];
            }
        }

        System.out.println("Sum of Matrices are: ");
        for(int c=0;c<m;c++){
            for(int d=0;d<n;d++){
                System.out.print(sum[c][d]+"\t");
            }
        }
        sc.close();
    }
}
