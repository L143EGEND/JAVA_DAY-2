// Write a JAVAprogram to find maximum and minimum element in an array. 

import java.util.Scanner;

public class Maxmin {

    public static void find(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } 
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        find(arr);
    }
}
