class exam implements Runnable
{
	String msg;
	Thread t;
	exam(String str)					// exam constructor 
	{
		msg = str;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		for(int i=1 ; i<5;i++)
		{
			System.out.println("Thread of Exam class with "+msg);
		}
	}
}
class Thread5
{
	public static void main(String[] args)
	{
		exam e1 = new exam("ONE");
		exam e2 = new exam("TWO");
		exam e3 = new exam("THREE");
		exam e4 = new exam("FOUR");
		
		System.out.println("Is Thread alive or not??? "+e1.t.isAlive()); 		//isAlive() method is used to check whether thread is live or dead
		System.out.println("Is Thread alive or not??? "+e2.t.isAlive());
		System.out.println("Is Thread alive or not??? "+e3.t.isAlive());
		System.out.println("Is Thread alive or not??? "+e4.t.isAlive());
		System.out.println(" ");
		try
		{
			
			e1.t.join();
			e2.t.join();
			e3.t.join();
			e4.t.join();
		}
		catch(InterruptedException e)
		{}
		System.out.println("Is Thread alive or not??? "+e1.t.isAlive()); 		//isAlive() method is used to check whether thread is live or dead
		System.out.println("Is Thread alive or not??? "+e2.t.isAlive());
		System.out.println("Is Thread alive or not??? "+e3.t.isAlive());
		System.out.println("Is Thread alive or not??? "+e4.t.isAlive());
	}
}
		