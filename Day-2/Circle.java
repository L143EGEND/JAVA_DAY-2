import java.util.Scanner;
class Circle{
public static void main(String args[])
 {
Scanner sc =new Scanner(System.in);
int radius;
double pi=1.34,area;

System.out.println("Enter Radius of a circle:");
radius=sc.nextInt();
area=pi*radius*radius;
System.out.println("Area of circle is:"+area);
}
}
