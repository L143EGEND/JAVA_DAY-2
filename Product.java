import java.util.Scanner;

class Product {
    public static void main(String args[]) {
        Scanner SC = new Scanner(System.in);
        int prnum;
        String prname;
        float prcost, prqty, bill; 

        System.out.println("Enter the product number:");
        prnum = SC.nextInt();
        
        System.out.println("Enter the product name:");
        prname = SC.next();
        
        System.out.println("Enter the product cost:");
        prcost = SC.nextFloat();
        
        System.out.println("Enter the product quantity:");
        prqty = SC.nextFloat();

        bill = prcost * prqty;

        System.out.println("The product number is: " + prnum);
        System.out.println("The product name is: " + prname);
        System.out.println("The product cost is: " + prcost);
        System.out.println("The product quantity is: " + prqty);
        System.out.println("The total bill is: " + bill);
    }
}
