// write a java program to find the factorial of the given number

import java.util.Scanner;

class Factonum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = 1, n, sum = 1;

        System.out.println("Enter a Number:");
        n = sc.nextInt();
        while (i <= n) {
            sum = sum*i;
            i++;
        }

        System.out.println("The factorial of first " + n + " natural numbers is: " + sum);
    }
}
