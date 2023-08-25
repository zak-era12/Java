import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 

class mythread1 implements Runnable
{
    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for thread 1(n number):");
        final int nextInt = scanner.nextInt();
        System.out.println("n numbers are");
        for (int i = 0; i <= nextInt; ++i) {
            System.out.print(i + "\t");
        }
        System.out.println("This is the run method of thread 1");
    }
    public static void main(String args[])
	{
		mythread1 obj = new mythread1();
		Thread t1=new Thread(obj);
		t1.start();
	}

}