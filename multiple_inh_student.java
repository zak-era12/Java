//Program to demonstrate multiple inheritance
// Example on interface , implements

import java.util.*;
interface i1
{
	public void subject_marks();
}
interface i2
{
	public void sports_marks();
}
class c1 implements i1, i2
{
	Scanner sc=new Scanner(System.in);
	double sub1, sub2, total, sp;
	String name;
	public void subject_marks()
	{
		System.out.println("Enter the marks of two subjects: ");
		sub1=sc.nextDouble();
		sub2=sc.nextDouble();
	}
	public void sports_marks()
	{
		System.out.println("Enter the sports marks: ");
		sp=sc.nextDouble();
	}
	public void total_marks()
	{
		total=sub1+sub2;
		System.out.println("Enter the student name: ");
		name=sc.next();
		System.out.println("Welcome! "+name);
		System.out.println("Your total marks is "+total);
	}
}
class multiple_inh_student
{
	public static void main(String [] args)
	{
		c1 obj =new c1();
		obj.subject_marks();
		obj.sports_marks();
		obj.total_marks();
	}
}
