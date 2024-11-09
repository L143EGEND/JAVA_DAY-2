// Write a JAVAprogram to print all Armstrong numbers between 1 to n.

import java.util.Scanner;

class Armnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Armstrong numbers between 1 and " + n + " are:");

        for (int number = 1; number <= n; number++) {
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
                System.out.println(number);
            }
        }
    }
}
