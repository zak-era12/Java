import java.io.PrintStream;
import java.util.Scanner;

class get_data
{
  int n1;
  int n2;
  
  public void get_info()
  {
    Scanner localScanner = new Scanner(System.in);
    System.out.println("Enter two numbers \n");
    n1 = localScanner.nextInt();
    n2 = localScanner.nextInt();
  }
}