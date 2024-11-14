// Write a JAVAprogram to count total number of even and odd elements in an array.

import java.util.Scanner;

public class Evenodd {

    public static void count(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Total even elements: " + even);
        System.out.println("Total odd elements: " + odd);
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

        count(arr);
    }
}
