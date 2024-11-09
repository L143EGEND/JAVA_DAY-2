// Write a JAVAprogram to calculate sum of digits of a number.

import java.util.Scanner;

class Sumofdigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int sum = 0;
        int num = number;  
        while (num != 0) {
            int digit = num % 10;  
            sum += digit;          
            num = num / 10;        
        }
        System.out.println("The sum of the digits of " + number + " is: " + sum);
    }
}
