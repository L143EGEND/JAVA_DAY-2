// Write a JAVAprogram to print day of week name using switch case.

import java.util.Scanner;

class Weekswtch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 2; 
        
        System.out.println("Enter a Number:");
        n = sc.nextInt();
        
        switch (n) {
            case 1:
                System.out.println("IS SUNDAY");
                break;
            case 2:
                System.out.println("IS MONDAY");
                break;
            case 3:
                System.out.println("IS TUESDAY");
                break;
            case 4:
                System.out.println("IS WEDNESDAY");
                break;
            case 5:
                System.out.println("IS THURSDAY");
                break;
            case 6:
                System.out.println("IS FRIDAY");
                break;
            case 7:
                System.out.println("IS SATURDAY");
                break;
            default:
                System.out.println("Given Number is Invalid");
                break;
        }
        
    }
}
