import java.util.Scanner;
public class Arr
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n;
System.out.print("Enter the size of the array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter Elements:");
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
System.out.println("The elements of the array are:");
}
for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");  
        }
    }
}
