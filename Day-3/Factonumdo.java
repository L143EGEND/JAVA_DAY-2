// write a java program to find the factorial of the given number in do-while

import java.util.Scanner;

class Factosumdo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        int i = 1;
        int sum = 1;

        do {
            sum *= i;  
            i++;
        } while (i <= n);

        System.out.println("The Factorial of " + n + " is: " + sum);
    }
}
