import java.io.PrintStream;
import java.util.Scanner;

class student
  extends person
{
  int sem;
  int year;
  String course;
  
  public void student_info()
  {
    System.out.println("Enter your semester: ");
    sem = sc.nextInt();
    System.out.println("Enter your academic year: ");
    year = sc.nextInt();
    System.out.println("Enter your course name: ");
    course = sc.next();
    System.out.println("Student name: " + name);
    System.out.println("Student age: " + age);
    System.out.println("Student contact number : " + c_no);
    System.out.println("Semester : " + sem);
    System.out.println("Year: " + year);
  }
}