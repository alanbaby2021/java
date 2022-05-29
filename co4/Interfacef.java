import graphics.Rectangle;
import graphics.Triangle;
import graphics.Square;
import graphics.Circle;
import java.util.Scanner;
public class Interfacef
{
	public static void main(String args[])
	{
		int opt;
		Scanner sc=new Scanner(System.in);
do
{
		System.out.println("\nMenu");
		System.out.println("1.Rectangle\n2.Triangle\n3.Square\n4.Circle");
		System.out.println("Select your option");
		opt=sc.nextInt();

		switch(opt)
		{
case 1:
Rectangle re=new Rectangle();
re.area();
break;
case 2:
Triangle t=new Triangle();
t.area();
break;
case 3:
Square s=new Square();
s.area();
break;
case 4:
Circle c=new Circle();
c.area();
break;
default:
System.out.println("\nInvalid option");
	}
	}while(opt<5);
}
}