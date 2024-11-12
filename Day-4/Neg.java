//  Write a JAVAprogram to print all negative elements in an array.


import java.util.Scanner;

public class Neg {

    public static void Negative(int[] arr) {
        System.out.println("Negative elements in the array are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
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
        Negative(arr);
    }
}
