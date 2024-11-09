// Write a JAVAprogram to input week number and print week day.

import java.util.Scanner;

class Week {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.println("Enter a Number:");
        a=sc.nextInt();
        if (a==1) {
            System.out.println("IS SUNDAY");
        }
        else if (a==2) {
            System.out.println("IS MONDAY");
        }
        else if (a==3) {
            System.out.println("IS TUESDAY");
        }
        else if (a==4) {
            System.out.println("IS WEDNESDAY");
        }
        else if (a==5) {
            System.out.println("IS THURSDAY");
        }
        else if (a==6) {
            System.out.println("IS FRIDAY");
        }
        else if (a==7) {
            System.out.println("IS SATURDAY");
        } 
        else {
            System.out.println("Given Number is Invalid");
        }

    }
}
