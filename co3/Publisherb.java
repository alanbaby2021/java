import java.util.Scanner;
class publisher
{
	String pubname;
	Scanner sc=new Scanner(System.in);
	publisher()
	{
		System.out.println("Enter the publisher name:");
		pubname=sc.next();
	}
}
class book extends publisher
{
	String book_name,author_name;
book()
{
	super();
	    System.out.println("Enter the book name:");
		book_name=sc.next();
		System.out.println("Enter the author name:");
		author_name=sc.next();
}
void display()
{
System.out.println("\nDetails\nPublisher name:"+pubname);	
System.out.println("Book name:"+book_name);
System.out.println("Author name:"+author_name);
}
}
class literature extends book
{
	String ltype;
	literature()
	{   
		super();
		System.out.println("Enter the Literature type(Drama or Poetry):");
		ltype=sc.next();
	}
	void put()
	{
		System.out.println("Literature type:"+ltype);	
	}
}
class fiction extends book
{
	String ftype;
	fiction()
	{
		super();
		System.out.println("Enter the fiction type(Action or Adventure):");
		ftype=sc.next();
	}
void put()
	{
		System.out.println("Fiction type:"+ftype);
	}
}


public class Publisherb
{
public static void main(String args[])
{
	int opt;
Scanner sc=new Scanner(System.in);
System.out.println("\nMenu\n1.Literature\n2.fiction");
System.out.println("\nSelect the option:");
opt=sc.nextInt();
switch(opt)
{
case 1:
literature l=new literature();
l.display();
l.put();
break;
case 2:
fiction f=new fiction();
f.display();
f.put();
break;
default:
System.out.println("Invalid option");
break;	
}
}
}