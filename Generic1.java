class abc
{
	Object p,q;
	abc(Object t1,Object t2)
	{
		p=t1;
		q=t2;
	}
	void disp()
	{
		System.out.println("P= "+p);
		System.out.println("Q= "+q);
		System.out.println("P is converted in type of = "+p.getClass().getName());
		System.out.println("Q is converted in type of = "+q.getClass().getName());
	}
}
class Generic1
{
	public static void main(String[] args)
	{
	
		abc a1 = new abc(11,12);
		abc a2 = new abc(11.11f,12.12f);
		abc a3 = new abc("Gaurav","GEU");
		abc a4 = new abc((byte)10,(byte)23);
		a1.disp();
		a2.disp();
		a3.disp();
		a4.disp();
	}
}
