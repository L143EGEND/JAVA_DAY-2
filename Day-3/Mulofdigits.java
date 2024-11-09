// Write a JAVAprogram to calculate product of digits of a number.

import java.util.Scanner;

class Mulofdigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int Mul = 1;
        int num = number;  
        while (num != 0) {
            int digit = num % 10;   
            Mul *= digit;       
            num = num / 10;         
        }
        System.out.println("The product of the digits of " + number + " is: " + Mul);
    }
}
