// Write a JAVAprogram to check whether a number is negative, positive or zero.

import java.util.Scanner;

class Numcheck {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (num > 0) {
            System.out.println("The Given number is positive.");
        } else if (num < 0) {
            System.out.println("The Given number is negative.");
        } else {
            System.out.println("The Given number is zero.");
        }
    }
}
