import java.util.*;
class threads_5 implements Runnable
{
	public void run()
	{
		System.out.println("threads running");
	}
	public static void main(String args[])
	{
		threads_5 obj = new threads_5();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		Thread t3=new Thread(obj);
		Thread t4=new Thread(obj);
		Thread t5=new Thread(obj);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
}
		