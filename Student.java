import java.util.Scanner;
class Student{
public static void main(String args[])
 {
Scanner sc =new Scanner(System.in);
int stnum,m,p,c,total;
String stname;
float avg;
System.out.println("Enter the Student number:");
stnum=sc.nextInt();
System.out.println("Enter the Student m marks:");
m=sc.nextInt();
System.out.println("Enter the Student p marks:");
p=sc.nextInt();
System.out.println("Enter the Student c marks:");
c=sc.nextInt();
System.out.println("Enter the Student name :");
stname=sc.next();


total=m+p+c;
avg = total/3;

System.out.println("Enter the Student number:"+stnum);

System.out.println("Enter the Student m marks:"+m);
System.out.println("Enter the Student p marks:"+p);
System.out.println("Enter the Student c marks:"+c);
System.out.println("Enter the Student name :"+stname);
System.out.println("Enter the Student Average marks:"+avg);
   }
}
