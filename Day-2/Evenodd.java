// Write a JAVAprogram to check whether a number is even or odd.

import java.util.Scanner;
class Evenodd{
public static void main(String args[])
 {
Scanner sc =new Scanner(System.in);
int a;
System.out.println("Enter a number:");
a=sc.nextInt();
if(a%2==0)
{
System.out.println("The given number is Even:");
}
else if (a%2==1)
{
System.out.println("The given number is Odd:");
}
else
{
System.out.println("The given number is Invalid:");
}
}
}
