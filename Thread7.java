class  abc
{
	synchronized void disp(String mes)			//synchronized keyword makes tha disp func to execute for one thread at a time
	{											//and all other threads are blocked until the execution of one thread completes.
		System.out.print("["+mes);
		try
		{
			Thread.sleep(2000);					// sleep method makes the thread to get into the wait state 
		}
		catch(InterruptedException e)
		{}
		System.out.print("]");
	}
}
class xyz implements Runnable
{
	abc a1;
	String msg;
	Thread t;
	xyz(String mess , abc b1)
	{
		msg = mess;
		a1 = b1;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		a1.disp(msg);
	}
}
class Thread7
{
	public static void main(String []args)
	{
		abc c1 = new abc();
		xyz x1 = new xyz("ABC",c1);
		xyz x2 = new xyz("DEF",c1);
		xyz x3 = new xyz("GHI",c1);
		xyz x4 = new xyz("KLM",c1);
	}
}