package graphics;
import java.util.Scanner;
public class Rectangle implements figures
{
	int l,b;
	Scanner sc=new Scanner(System.in);
	public void area()
	{
	System.out.println("Enter the length:");
	l=sc.nextInt();
	System.out.println("Enter the breadth:");
	b=sc.nextInt();
    System.out.println("Area of rectangele="+l*b);
}
}