import java.util.Scanner;
class employee
{
int salary;
String empid,names,address;
employee(String id,String name,String add,int s)
{
empid=id;
names=name;
address=add;
salary=s;
}
}

class teacher extends employee
{
String department,subject;
teacher(String dep,String sub,String id,String name,String add,int sal)
{
	super(id,name,add,sal);
	department=dep;
	subject=sub;

}
void display()
{
System.out.println("Empid="+empid);
System.out.println("Employee Name="+names);
System.out.println("Employee Address="+address);
System.out.println("Employee salary="+salary);
System.out.println("Department="+department);
System.out.println("Subject="+subject);
System.out.println("\n");
}
}


public class Employee_t
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int n,i,sal;
	String id,name,add,dep,sub;
System.out.println("Enter the no of teachers");
n=sc.nextInt();
teacher t[]=new teacher[n];
 for(i=0;i<t.length;i++)
 {
 	System.out.println("Enter the empid");
 	id=sc.next();
 	System.out.println("Enter the name:");
 	name=sc.next();
 	System.out.println("Enter the address:");
 	add=sc.next();
 	System.out.println("Enter the salary:");
 	sal=sc.nextInt();
 	System.out.println("Enter the department:");
 	dep=sc.next();
 	System.out.println("Enter the subject:");
 	sub=sc.next();
 	t[i]=new teacher(dep,sub,id,name,add,sal);
 	System.out.println("\n");
 }
 for(i=0;i<t.length;i++)
 {  
 	t[i].display();
 }
}
}