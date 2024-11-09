//  Write a JAVAprogram to print all Prime numbers between 1 to n.

import java.util.Scanner;

class Primenumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("Prime numbers between 1 and " + n + " are:");

        for (int num = 2; num <= n; num++) {
            boolean Prime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    Prime = false; 
                    break; 
                }
            }
            if (Prime) {
                System.out.println(num);
            }
        }
    }
}
