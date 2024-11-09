// Write a JAVAprogram to calculate factorial of a number.

import java.util.Scanner;

class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long factorial = 1;

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {

            for (int i = 1; i <= num; i++) {
                factorial *= i;  // Multiply factorial by i
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}
