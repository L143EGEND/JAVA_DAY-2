// Write a JAVAprogram to check whether a number is Armstrong number or not.

import java.util.Scanner;

class Armnumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        int digits = 0;
        while (originalNumber != 0) {
            digits++;
            originalNumber /= 10;
        }

        originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, digits);
            originalNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}
