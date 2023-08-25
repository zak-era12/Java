import java.util.*;
class person
{
	Scanner sc=new Scanner (System.in);
	String name;
	int age, c_no;
	public void info()
	{
		System.out.println("Enter your name: ");
		name=sc.next();
		System.out.println("Enter your age: ");
		age=sc.nextInt();
		System.out.println("Enter your contact number: ");
		c_no=sc.nextInt();
	}
}
class student extends person
{
	int sem, year;
	String course;
	public void student_info()
	{
		System.out.println("Enter your semester: ");
		sem=sc.nextInt();
		System.out.println("Enter your academic year: ");
		year=sc.nextInt();
		System.out.println("Enter your course name: ");
		course=sc.next();
		System.out.println("Student name: "+name);
		System.out.println("Student age: "+age);
		System.out.println("Student contact number : "+c_no);
		System.out.println("Semester : "+sem);
		System.out.println("Year: "+year);
	}
}
class faculty extends person 
{
	public void faculty_info()
	{
		double sal;
		String qual, post;
		System.out.println("Enter your salary ");
		sal=sc.nextDouble();
		System.out.println("Enter your qualification ");
		qual=sc.next();
		System.out.println("Enter your designation ");
		post=sc.next();
		System.out.println("Employee name: "+name);
		System.out.println("Employee age: "+age);
		System.out.println("Employee contact number : "+c_no);
		System.out.println("Employee salary: "+sal);
		System.out.println("Employee qualification: "+qual);
		System.out.println("Employee designation: "+post);
	}
}
class heirarchical
{
	
	public static void main(String [] args)
	{
		int choice;
		Scanner sc1=new Scanner(System.in);
		student s1=new student();
		faculty f1=new faculty();
		System.out.println("Select choice for viewing details\n \t 1.Faculty \n \t 2.Student\n ");
		choice=sc1.nextInt();
		if(choice==1)
		{
			f1.info();
			f1.faculty_info();
		}
		else if(choice==2)
		{
			s1.info();
			s1.student_info();
		}
		else
		{
			System.out.println("You have entered an invalid choice.");
		}
	}
}