class Thread6
{
	public static void main(String []args)
	{
		Thread T = new Thread();
		
		T = Thread.currentThread();				// refer to the currently executing thread
		
		System.out.println(T);					// Thread[#1,main,5,main]
		System.out.println(T.getName());		// return the name of the thread
		
		T.setName("GEU_JAVA");					// change name of thread to GEU_JAVA
		System.out.println(T.getPriority());	// to get priority of the thread
		System.out.println(T);					// Thread[#1,GEU_JAVA,5,main]
		System.out.println(T.getName());		// to print name of thread
		
		T.setPriority(7);						// setting the priority of the thread to 7
		System.out.println(T);					// Thread[#1,GEU_JAVA,7,main]
		System.out.println(T.getPriority());	// printing the priority of the thread
		
		T.setPriority(Thread.MAX_PRIORITY);		// setting the priority to max 
		System.out.println(T);
		System.out.println(T.getPriority());
		
		for (int i=1;i<=5;i++)
		{
			try
			{
				Thread.sleep(3000);				// Sleep() method puts the thread in wait state for 3000ms 
			}
			catch(InterruptedException e)
			{	}
			System.out.println("Main Thread in sleep with the value of i... "+i);
		}
	}
}