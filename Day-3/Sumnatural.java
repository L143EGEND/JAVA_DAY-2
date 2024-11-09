// Write a JAVAprogram to find sum of all natural numbers between 1 to n.

import java.util.Scanner;

class Sumnatural {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 1, n, sum = 0;

        System.out.println("Enter a Number:");
        n = sc.nextInt();
        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
