// Write a JAVAprogram to check whether a number is Strong number or not.

import java.util.Scanner;

class Strongnum {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number; 
        int sum = 0;

        while (number > 0) {
            int digit = number % 10; 
            sum += factorial(digit); 
            number /= 10; 
        }
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is a Strong number.");
        } else {
            System.out.println(originalNumber + " is not a Strong number.");
        }
    }
}
