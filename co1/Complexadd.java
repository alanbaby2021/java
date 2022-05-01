import java.util.Scanner;
class complex
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	
	void read()
	{
    System.out.println("Enter the value for a:");
    a=sc.nextInt();
	System.out.println("Enter the value for b:");
	b=sc.nextInt();
	}
}


public class Complexadd 
{
	public static void main(String args[])
	{
		int a,b;
		complex c1=new complex(); 
		System.out.println("\nComplex number 1:");
		c1.read();
		complex c2=new complex(); 
		System.out.println("\nComplex number 2:");
		c2.read();
        a=c1.a+c2.a;
        b=c1.b+c2.b;
        System.out.println("\nComplex number 1:"+c1.a+"+"+c1.b+"i");
        System.out.println("Complex number 2:"+c2.a+"+"+c2.b+"i");
        System.out.println("Result="+a+"+"+b+"i");
	}
}