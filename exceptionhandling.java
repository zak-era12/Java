import java.util.*;
class exceptionhandling
{
	public static void main(String [] args)
	{
	int x, y;
			Scanner sc=new Scanner (System.in);
		try
		{
			System.out.println("Enter the first number");
			x=sc.nextInt();
			System.out.println("Enter the second number");
			y=sc.nextInt();
			System.out.println("division= "+(x/y));	
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Division cannot be performed with zero");
		}
		System.out.println("Rest of the Code ");
		
	}
}