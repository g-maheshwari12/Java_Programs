class My<T>										//creating a generic with name T
{
	T i;										//creating object of T
	public void set(T i1)
	{
		i = i1 ;
	}
	public T get()
	{
		return i;
	}
}
public class Generic2
{
	public static void main(String []args)
	{
		My<Integer> m1 = new My<Integer>();			//Generic of int class
		My<Float> m2 = new My<Float>();				//Generic of float class
		My<Double> m3 = new My<Double>();			//generic of double class
		My<String> m4 = new My<String>();			//generic of string class
		My<Character> m5 = new My<Character>();		//generic of char class
		m1.set(2003);								//passing values
		m2.set(20.03f);
		m3.set(12.082003);
		m4.set("Gaurav");
		m5.set('G');
		System.out.println("m1 = "+m1.get());		//printing value
		System.out.println("m2 = "+m2.get());
		System.out.println("m3 = "+m3.get());
		System.out.println("m4 = "+m4.get());
		System.out.println("m5 = "+m5.get());
	}
}
		
		