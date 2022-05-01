public class Stringm
{
	public static void main(String args[])
	{
    String m1,m2;
    m1="Hello";
    m2="World";
    System.out.println("\nString 1:"+m1);
    System.out.println("String 2:"+m2);
    if(m1.equals(m2))
    System.out.println("\nString 1 and string 2 are equal");
    else
    System.out.println("\nstring 1 and string 2 are not equal");

  System.out.println("\nConcatenated String:"+m1.concat(m2));
  System.out.println("\nLength of string(Hello):"+m1.length());
 System.out.println("\nCharAt(1) of Hello:"+m1.charAt(1));
System.out.println("\nReplacing H of Hello with T:"+m1.replace('H','T'));
System.out.println("\nSubstring of Hello:"+m1.substring(2));
System.out.println("\nHello to lowercase:"+m1.toLowerCase());	
System.out.println("\nWorld to uppercase:"+m2.toUpperCase());
	}
}

