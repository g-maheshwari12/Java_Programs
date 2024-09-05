class GenericCons
{
	String s;
	int d;											//double d gives error because its value type
	<T extends Number>GenericCons(T args)
	{
		s = args.getClass().getName();
		d = args.intValue();							//doubleValue() is used to get value
	}
	void disp()
	{
		System.out.println("The type is : "+s);
		System.out.println("The value is : "+d);
	}
}
public class Generic5
{
	public static void main(String []args)
	{
		GenericCons g1 = new GenericCons(12);
		GenericCons g2 = new GenericCons((byte)12);
		GenericCons g3 = new GenericCons(12.12f);
		GenericCons g4 = new GenericCons(12.3456789);
		g1.disp();
		g2.disp();
		g3.disp();
		g4.disp();
	}
}
		