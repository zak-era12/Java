//Program to check whether the given number is Armstrong number or not

import java.util.*;
interface i1
{
	public void m1();
}
class arm_calculate implements i1
{
	Scanner sc=new Scanner(System.in);
	int num, sum=0, rem,temp;
	public void m1()
	{
		System.out.println("Enter the number: ");
		num=sc.nextInt();
		temp=num;
		while (num!=0)	
		{
			rem=num%10;
			sum=sum+rem*rem*rem;
			num=num/10;
		}
		if (sum==temp)
		{
			System.out.println("Number is Armstrong "+sum);
		}
		else
		{ 
		System.out.println("Number is not Armstrong "+sum);
		}			
	}
}

class armstrong 
{
	public static void main(String [] args)
	{
		i1 obj=new arm_calculate();
		obj.m1(); 
	}
}