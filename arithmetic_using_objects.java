import java.util.*;
class get_data
{
	int n1, n2;
	public void get_info()
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two numbers \n");
		n1=sc.nextInt();
		n2=sc.nextInt();
	}
	public void add()
	{
		System.out.println("Addition= "+(n1+n2));

	}
	public void subtract()
	{
		System.out.println("Subtraction= "+(n1-n2));
	}
	public void multiply()
	{
		System.out.println("Multiplication= "+(n1*n2));
	}
	public void divide()
	{
		System.out.println("Division= "+(n1/n2));
	} 
}
class arithmetic_using_objects
{
	public static void main(String [] args)
	{
		get_data obj=new get_data();
		obj.get_info();
		obj.add();
		//obj.get_info();
		obj.subtract();
		//obj.get_info();
		obj.multiply();
		//obj.get_info();
		obj.divide();		
	}
}