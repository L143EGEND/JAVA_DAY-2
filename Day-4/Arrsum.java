// Write a java program to print the sum of an array

import java.util.Scanner;

public class Arrsum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i, n, sum = 0;

        System.out.print("Enter array size: ");
        n = sc.nextInt();
        
        int a[] = new int[n];

        System.out.println("Enter elements of the array:");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();  
        }

        for (i = 0; i < a.length; i++) {
            sum += a[i]; 
        }

        System.out.println("The sum of array elements is: " + sum);
    }
}
