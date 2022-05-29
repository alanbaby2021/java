package graphics;
import java.util.Scanner;
public class Triangle implements figures
{
	int b,h;
	Scanner sc=new Scanner(System.in);
	public void area()
	{
		System.out.println("Enter the breadth");
		b=sc.nextInt();
		System.out.println("Enter the length");
		h=sc.nextInt();
		System.out.println("Area of triangle="+0.5*b*h);
	}
}