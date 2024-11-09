// Write a JAVAprogram to find maximum between two numbers.

import java.util.Scanner;

class Maxtwo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int n1 = sc.nextInt();

        System.out.println("Enter the second number:");
        int n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("The maximum number is: " + n1);
        } else if (n2 > n1) {
            System.out.println("The maximum number is: " + n2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
