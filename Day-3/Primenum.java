// Write a JAVAprogram to check whether a number is Prime number or not.

import java.util.Scanner;

class Primenum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean Prime = true;
        if (num <= 1) {
            Prime = false;
        } else {

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    Prime = false;
                    break; 
                }
            }
        }
        if (Prime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}
