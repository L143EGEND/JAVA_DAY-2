// Write a JAVAprogram to find frequency of each digit in a given integer.

import java.util.Scanner;

class Digitfrqy {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int[] frequency = new int[10]; 
        int num = number;  
        while (num != 0) {
            int digit = num % 10;    
            frequency[digit]++;      
            num = num / 10;          
        }
        System.out.println("Digit frequencies in the number " + number + ":");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }
    }
}
