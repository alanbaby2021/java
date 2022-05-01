import java.util.Scanner;
public class Symmetric
{
public static void main(String args[])
{
int i,j,n,c=0,r,cl;
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int b[][]=new int[10][10];

System.out.println("Enter the row size:");
r=sc.nextInt();
System.out.println("Enter the column size:");
cl=sc.nextInt();
if(r==cl)
{
System.out.println("Enter the elements of matrix");
for(i=0;i<r;i++)
{
for(j=0;j<cl;j++)
{
a[i][j]=sc.nextInt();
}
}

for(i=0;i<r;i++)
{
for(j=0;j<cl;j++)
{
b[j][i]=a[i][j];
}
}


System.out.println("Transpos matrix:");
for(i=0;i<r;i++)
{
	for(j=0;j<cl;j++)
	{
	System.out.print(b[i][j]+" ");	
	}
	System.out.println();
}


for(i=0;i<r;i++)
{
for(j=0;j<cl;j++)
{
if(a[i][j]!=b[i][j])
{
c=1;
break;
}
}
}

if(c==1)
System.out.println("Not Symmetric");

if(c==0)
System.out.println("Symmetric");
}
else
{
System.out.println("Not possible");	
}

}
}