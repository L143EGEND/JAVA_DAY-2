// Write a JAVAprogram to find sum of all odd numbers between 1 to n.

import java.util.Scanner;

class Sumofodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("The sum of all odd numbers between 1 and " + n + " is: " + sum);
    }
}

