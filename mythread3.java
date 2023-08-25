import java.util.Scanner;

class mythread3 extends Thread
{
    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number for thread 3 (odd number)");
        final int nextInt = scanner.nextInt();
        System.out.println("odd numbers are ");
        for (int i = 0; i <= nextInt; ++i) {
            if (i % 2 != 0){
            System.out.print(i + "\t");
            }
        }
        System.out.println(" \n This is the run method of thread 3");
    }
    public static void main(String args[])
	{
		mythread3 obj = new mythread3();
		Thread t1=new Thread(obj);
		t1.start();
	}
}