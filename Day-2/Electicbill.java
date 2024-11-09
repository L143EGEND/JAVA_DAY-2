/* Write a JAVAprogram to input electricity unit charges and calculate total     electricity bill according to the given condition:

    For first 50 units Rs. 0.50/unit

    For next 100 units Rs. 0.75/unit

    For next 100 units Rs. 1.20/unit

     For unit above 250 Rs. 1.50/unit

     An additional surcharge of 20% is added to the bill
*/

import java.util.Scanner;

class Electicbill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of electricity units consumed:");
        int units = sc.nextInt();

        double totalBill = 0;

        if (units <= 50) {
            totalBill = units * 0.50; 
        } else if (units <= 150) {
            totalBill = 50 * 0.50 + (units - 50) * 0.75;  
        } else if (units <= 250) {
            totalBill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;  
        } else {
            totalBill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50; 
        }

        double surcharge = totalBill * 0.20;
        totalBill += surcharge;

        System.out.println("Total electricity bill (including surcharge of 20%): Rs. " + totalBill);
    }
}
