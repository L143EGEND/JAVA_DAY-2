// Write a JAVAprogram to find sum of all prime numbers between 1 to n.

import java.util.Scanner;

class Sumprime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int num = 2; num <= n; num++) {
            boolean Prime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    Prime = false; 
                    break; 
                }
            }
            if (Prime) {
                sum += num;
            }
        }
        System.out.println("The sum of all prime numbers between 1 and " + n + " is: " + sum);
    }
}
