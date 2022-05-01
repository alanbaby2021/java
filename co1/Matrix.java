import java.util.Scanner;
public class Matrix
{
public static void main(String args[])
{
	int i,j,n;
Scanner sc=new Scanner(System.in);
int a[][]=new int[10][10];
int b[][]=new int[10][10];
int c[][]=new int[10][10];
System.out.println("Enter the size:");
n=sc.nextInt();

System.out.println("Enter the elements of first matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}

System.out.println("Enter the elements of second matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
b[i][j]=sc.nextInt();
}
}

for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}

System.out.println("Resultant matrix");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
System.out.print(c[i][j]+" ");
}
System.out.println();
}

}
}