package graphics;
import java.util.Scanner;
public class Square implements figures
{
int a;
Scanner sc=new Scanner(System.in);
public void area()
{
System.out.println("Enter the side");
a=sc.nextInt();
System.out.println("Area of square="+a*a);
}
}