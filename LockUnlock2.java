import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Inc extends Thread {
    static int c = 0;											// static makes the counter available to access by child class
    static Lock lc = new ReentrantLock();						// if not static then value changes everytime

    public void run() 
	{
        for (int i = 0; i < 1000; i++)
		{
            lc.lock();
            try 
			{
                c++;
            } finally 
			{
                lc.unlock();
            }
        }
    }
}
public class LockUnlock2
{
    public static void main(String[] args) throws InterruptedException 
	{
        Inc t1 = new Inc();
        Inc t2 = new Inc();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Final Counter: " + Inc.c);
    }
}
