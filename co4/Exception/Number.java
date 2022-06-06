import java.util.Scanner;
class negative extends Exception
{
	public negative(String str)
	{
super(str);
	}
}

class sample
{
	Scanner sc=new Scanner(System.in);
int n,x,sum=0,avg,i;
	void avg() throws negative
	{
		System.out.println("Enter the value for n:");
n=sc.nextInt();
System.out.println("Enter the number:");
for(i=0;i<n;i++)
{
	x=sc.nextInt();
	if(x<0)
		throw new negative("Entered a Negative number");
		else
		sum=sum+x;
	}
	avg=sum/n;
System.out.println("Average="+avg);
}
}


class Number
{
	public static void main(String args[])
	{
		try
		{
sample s=new sample();
s.avg();
		}
		catch(negative n)
		{
System.out.println("Exception occured:\n"+n);
		}

	}
}