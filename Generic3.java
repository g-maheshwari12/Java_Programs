class MultipleGenerics<T1,T2>					// creating template of two diff datatypes
{
	T1 a;
	T2 b;
	MultipleGenerics(T1 a , T2 b)
	{
		this.a = a;								// use of this method
		this.b = b;
	}
	void disp()
	{
		System.out.println("A = "+a);
		System.out.println("B = "+b);
		System.out.println("Type of A = "+a.getClass().getName());		//getClass() method is used to get class name
		System.out.println("Type of B = "+b.getClass().getName());		// getName() method is used to print name of class
	}
}
public class Generic3
{
	public static void main(String...args)
	{
		MultipleGenerics<String,Integer> m1 = new MultipleGenerics<String,Integer>("Gaurav",12);
		MultipleGenerics<Integer,Character> m2 = new MultipleGenerics<Integer,Character>(8,'G');
		MultipleGenerics<Integer,Float> m3 = new MultipleGenerics<Integer,Float>(200,3.12f);
		MultipleGenerics<Character,String> m4 =new MultipleGenerics<Character,String>('G',"Maheshwari");
		m1.disp();
		m2.disp();
		m3.disp();
		m4.disp();
	}
}