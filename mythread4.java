import java.util.Scanner;

// 
// Decompiled by Procyon v0.5.36
// 

class mythread4 extends Thread
{
    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number for thread 4(square number)");
        final int nextInt = scanner.nextInt();
        System.out.println("square number are ");
        for (int i = 0; i <= nextInt; ++i) {
            System.out.print("  " + i * i);
        }
        System.out.println("This is the run method of thread 4");
    }
}