import java.util.Scanner;
interface result
{
 public void area();
 public void perimeter();
}



class circle implements result
{
	Scanner sc=new Scanner(System.in);
double r,area,per;
public void area()
{
System.out.println("Enter the radius:");
r=sc.nextFloat();	
area=3.14*r*r;
System.out.println("Area="+area);
}
public void perimeter()
{
double per;	
per=2*3.14*r;
System.out.println("Perimeter="+per);
}
}


class rectangle implements result
{
	Scanner sc=new Scanner(System.in);
int l,b,area,per;
public void area()
{
System.out.println("Enter the length:");
l=sc.nextInt();	
System.out.println("Enter the breadth:");
b=sc.nextInt();	
area=l*b;
System.out.println("Area="+area);
}
public void perimeter()
{
int per;	
per=2*(l+b);
System.out.println("Perimeter="+per);
}
}



class Areaper
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int opt;
		System.out.println("\nMenu\n1.Circle\n2.Rectangle\n");
		System.out.println("Select your option:\n");
		opt=sc.nextInt();
		switch(opt)
		{
			case 1:
			circle c=new circle();
			c.area();
			c.perimeter();
			break;
			case 2:
            rectangle r=new rectangle();
            r.area();
            r.perimeter();
			break;
		    default:
		    System.out.println("Invalid option");
		}
	}
}