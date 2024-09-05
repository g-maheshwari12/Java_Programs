class GenericCons										//generic constructor 
{
	String s;
	<T extends Number>GenericCons(T args)				//Number class accept only numeric data not string , char ,etc.
	{
		s = args.getClass().getName();
	}
	void disp()
	{
		System.out.println("The type is : "+s);
	}
}
public class Generic4
{
	public static void main(String []args)
	{
		GenericCons g1 = new GenericCons(12);			//constructor calling
		GenericCons g2 = new GenericCons((byte)12);
		GenericCons g3 = new GenericCons(12.12f);
		GenericCons g4 = new GenericCons(12.3456789);
		g1.disp();
		g2.disp();
		g3.disp();
		g4.disp();
	}
}