package operation;
import java.util.Scanner;
public class Addition implements Operation
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	public void calc()
	{
System.out.println("Enter the first number:");
a=sc.nextInt();
System.out.println("Enter the Second number:");
b=sc.nextInt();
System.out.println("Result="+(a+b));
}
}