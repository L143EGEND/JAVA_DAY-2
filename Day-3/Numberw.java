// Write a JAVAprogram to enter a number and print it in words.
import java.util.Scanner;

class Numberw {

    static String convertToWords(int num) {
        String[] ones = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", 
                           "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        
        String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

        if (num == 0) {
            return "Zero";
        }

        String result = "";

        if (num < 20) {
            result = ones[num];
        }

        else if (num < 100) {
            result = tens[num / 10] + (num % 10 != 0 ? " " + ones[num % 10] : "");
        }

        else if (num < 1000) {
            result = ones[num / 100] + " Hundred" + (num % 100 != 0 ? " and " + convertToWords(num % 100) : "");
        }
        else {
            result = convertToWords(num / 1000) + " Thousand" + (num % 1000 != 0 ? " " + convertToWords(num % 1000) : "");
        }

        return result;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        String result = convertToWords(number);

        System.out.println("The number " + number + " in words is: " + result);
    }
}
