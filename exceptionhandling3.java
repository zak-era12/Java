import java.util.*;
class exceptionhandling3
{
	public static void main(String [] args)
	{
		int age, id;
		String name;
		Scanner sc=new Scanner (System.in);
		try
		{
			System.out.println("Enter the employee age: ");
			age=sc.nextInt();
			if(age<18 || age>56)
			throw new Exception ("Invalid age entered. You are not authorised for further access. ");
			System.out.println("Enter employee name:");
			name=sc.next();
			System.out.println("Enter the employee id: ");
			id=sc.nextInt();
			System.out.println("Welcome! "+name);
			System.out.println("Your Employee ID is "+id);
	

		}
		catch(Exception e)
		{
			System.out.println("Error: "+e.getMessage());
		}
		finally
		{
			System.out.println(" \n Finally block is always executed");
		}
	}
}

