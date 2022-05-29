package graphics;
import java.util.Scanner;
public class Circle implements figures
{
	double r;
	Scanner sc=new Scanner(System.in);
	public void area()
	{
	System.out.println("Enter the radius:");
	r=sc.nextFloat();
	System.out.println("Area of circle="+3.14*r*r);
}
}