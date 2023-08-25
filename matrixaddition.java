import java.util.*;

class matrixaddition
{
	
	public static void main(String [] args)
	{
		int i, j, row, col;
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number of rows: ");
		i=sc.nextInt();
		System.out.println(" \n Enter the number of columns: ");
		j=sc.nextInt();
		int [] [] arr1=new int [i][j];
		int [] [] arr2=new int [i][j];
		System.out.println("\n Enter matrix 1: \n ");
		for(row=0;row<i;row++)
		{
			for(col=0;col<j;col++)
			{
				arr1[row][col]=sc.nextInt();
			}
		}
		System.out.println("Enter matrix 2: \n ");	
		for(row=0;row<i;row++)
		{
			for(col=0;col<j;col++)
			{
				arr2[row][col]=sc.nextInt();
			}
		}
		System.out.println("Matrix 1: \n");
		for(row=0;row<i;row++)
		{
			for(col=0;col<j;col++)
			{
				System.out.print(arr1[row] [col] + "\t");
			}
			System.out.println();
		}
		System.out.println("Matrix 2: \n");
		for(row=0;row<i;row++)
		{
			for(col=0;col<j;col++)
			{
				System.out.print(arr2[row] [col] + "\t");
			}
			System.out.println();
		}
		System.out.println("Answer of addition \n");
		for(row=0;row<i;row++)
		{
			for(col=0;col<j;col++)
			{
				System.out.print((arr1[row][col]+arr2[row][col])+"\t");

			}
			System.out.println();
		}
	}
}
