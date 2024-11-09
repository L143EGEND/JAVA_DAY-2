// Write a JAVAprogram to print all Strong numbers between 1 to n.

import java.util.Scanner;

class Strongnumbers {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        int originalNumber = number;

        while (number > 0) {
            int digit = number % 10;  
            sum += factorial(digit);  
            number /= 10;             
        }
        return sum == originalNumber;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("Strong numbers between 1 and " + n + " are:");

        for (int i = 1; i <= n; i++) {
            if (isStrong(i)) {
                System.out.println(i);  
            }
        }
    }
}
