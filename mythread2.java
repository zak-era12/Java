import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 

class mythread2 extends Thread
{
    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number for thread 2 (even number):");
        int nextInt = scanner.nextInt();
        System.out.println("even numbers are ");
        for (int i = 0; i <= nextInt ; ++i) {
            if (i%2==0){
                System.out.print(i + "\t");
            }
            
        }
        System.out.println(" \n This is the run method of thread 2");
    }
    public static void main(String args[])
	{
		mythread2 obj = new mythread2();
		Thread t1=new Thread(obj);
		t1.start();
	}
}