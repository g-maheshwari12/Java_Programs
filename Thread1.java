//run as user defined normal method
class Pst1 extends Thread
{
	public void run()
	{
		for(int i=1;i<4;i++)
		{
			System.out.println("Thread Pst1..." +i);
		}
	}
}
class Pst2 extends Thread
{
	public void run()
	{
		for(int i =1;i<4;i++)
		{
			System.out.println("Thread Pst2..." +i);
		}
	}
}
class Thread1
{
	public static void main(String []args)
	{
		System.out.println("Main Thread Start...");
		Pst1 p1 = new Pst1();
		Pst2 p2 = new Pst2();
		p1.run();
		p2.run();
		System.out.println("Main Thread End...");
	}
}