import java.util.Scanner;
class product
{
int pcode,price;
String pname;
Scanner sc=new Scanner(System.in);
void read()
{
	
System.out.println("Enter the pcode:");
pcode=sc.nextInt();
System.out.println("Enter the pname:");
pname=sc.next();
System.out.println("Enter the price:");
price=sc.nextInt();
}

void display()
{
	System.out.println("");
System.out.println("Pcode:"+pcode);
System.out.println("Pname:"+pname);
System.out.println("Price:"+price);
}

}




public class Productl
{
	public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int temp;
System.out.println("Product 1:");
product p1=new product();
p1.read();

System.out.println("\nProduct 2:");
product p2=new product();
p2.read();

System.out.println("\nProduct 3:");
product p3=new product();
p3.read();

temp=p1.price;
System.out.println("\nProduct with lowest price:");
if(p2.price<temp && p2.price<p3.price)
{
temp=p2.price;
p2.display();
}
else if(p3.price<temp)
{
temp=p3.price;
p3.display();
}
else
{
p1.display();
}

}
}
