import java.util.Scanner;
import operation.Addition;
import operation.Substraction;
import operation.Multiplication;
import operation.Division;
class Operationmain
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);  
		int opt;
		do 
		{
		System.out.println("\nMenu\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division\n");
System.out.println("Select your option\n");
opt=sc.nextInt();
switch(opt)
{
case 1:
Addition a=new Addition();
a.calc();
	break;
case 2:
	Substraction s=new Substraction();
	s.calc();
	break;
case 3:
	Multiplication m=new Multiplication();
	m.calc();
	break;
case 4:
	Division d=new Division();
	d.calc();
	break;
default:
	System.out.println("Invalid option");
}
}while(opt<5);

	}
}