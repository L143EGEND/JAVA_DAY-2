// Write a JAVAprogram to print all Perfect numbers between 1 to n.

import java.util.Scanner;

class Perfectnumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        System.out.println("Perfect numbers between 1 and " + n + " are:");

        for (int number = 1; number <= n; number++) {
            int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (sum == number) {
                System.out.println(number);
            }
        }
    }
}