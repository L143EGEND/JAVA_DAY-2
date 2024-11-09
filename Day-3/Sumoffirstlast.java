// Write a JAVAprogram to find sum of first and last digit of a number.

import java.util.Scanner;

class Sumoffirstlast {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int lastDigit = number % 10;

        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;  
        }
        int sum = firstDigit + lastDigit;

        System.out.println("The sum of the first and last digit is: " + sum);

    }
}
