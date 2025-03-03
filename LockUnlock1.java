import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockUnlock
{
	void disp()
	{
		Lock lc = new ReentrantLock();
		System.out.println("Lock method started");
		lc.lock();
		int a = 10;
		int b = 20;
		int c = a+(b*(a/(b-a)));
		System.out.println("Answer is : "+c);
		lc.unlock();
		System.out.println("Lock method completed");
	}
	public static void main(String[] args)
	{
		LockUnlock l = new LockUnlock();
		l.disp();
	}
}