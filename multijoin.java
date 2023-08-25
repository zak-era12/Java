
import java.io.PrintStream;

class multijoin
  extends Thread
{
  public void run()
  {
    for (int i = 1; i <= 5; i++)
    {
      try
      {
        Thread.sleep(500L);
      }
      catch (Exception localException)
      {
        System.out.println(localException);
      }
      System.out.println(i);
    }
  }
  
  public static void main(String[] paramArrayOfString)
  {
    multijoin localmultijoin1 = new multijoin();
    multijoin localmultijoin2 = new multijoin();
    multijoin localmultijoin3 = new multijoin();
    localmultijoin1.start();
    try
    {
      localmultijoin1.join();
    }
    catch (Exception localException)
    {
      System.out.println(localException);
    }
    localmultijoin2.start();
    localmultijoin3.start();
  }
}