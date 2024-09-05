class Hello implements Runnable
{
	public void run()
	{
		for(int i=1;i<5;i++)
		{
			System.out.println("Thread Hello... " +i);
		}
	}
}
class Thread4
{
	public static void main(String[] args)
	{
		System.out.println("Main Start");
		Hello h1 = new Hello();
		Hello h2 = new Hello();
		Hello h3 = new Hello();
		Hello h4 = new Hello();
		Thread t1 = new Thread(h1);
		Thread t2 = new Thread(h2);
		Thread t3 = new Thread(h3);
		Thread t4 = new Thread(h4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("Main end");
	}
}
