class Pst1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			if(i==3)   				//stop method stops the execution at i==3
				stop();
			System.out.println("Thread Pst1... "+i);
		}
	}
}
class Pst2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				if(i==3)
					Thread.sleep(3000);		//  use of Sleep() method
											// 3000 nanosec 
			}
			catch(InterruptedException e)
			{}
			System.out.println("Thread Pst2... " +i);
		}
	}
}
class Thread3
{
	public static void main(String []args)
	{
		System.out.println("Main Thread Start...");
		Pst1 p1 = new Pst1();
		Pst2 p2 = new Pst2();
		p1.start();
		p2.start();
		System.out.println("Main Thread End...");
	}
}