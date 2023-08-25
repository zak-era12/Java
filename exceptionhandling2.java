import java.util.*;
class exceptionhandling2
{
	public static void main(String [] args)
	{
	int i, n;
	int [] arr1=new int [5];

			Scanner sc=new Scanner (System.in);
		try
		{
		
			System.out.println("Enter the elements ");
			for(i=0;i<4;i++)
			{
				arr1[i]=sc.nextInt();
			}
			System.out.println("Enter the index number of an element: ");
			n=sc.nextInt();
			System.out.println("The element of the specified index: "+ arr1[n]);


		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Specify index within the length  of the array ");
		}
		System.out.println("Rest of the Code ");
		
	}
}