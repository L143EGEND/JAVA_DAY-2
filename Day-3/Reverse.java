// Write a JAVAprogram to enter a number and print its reverse.

import java.util.Scanner;

class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int reverse = 0;
        int num = number;  
        while (num != 0) {
            int digit = num % 10;        
            reverse = reverse * 10 + digit;  
            num = num / 10;             
        }
        System.out.println("The reverse of " + number + " is: " + reverse);
    }
}
