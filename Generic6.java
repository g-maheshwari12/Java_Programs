class exam1<T>															//class 1 having generic of T type
{
	T a;
	exam1(T a)															// constructor of class 1
	{
		this.a=a;
	}
	void disp()
	{
		System.out.println("The value is : "+a);
		System.out.println("The type is : "+a.getClass().getName());
	}
}
class exam2<T> extends exam1<T>											//generic inheritance 
{
	T b;
	exam2(T a,T b)
	{
		super(a);														// calling base class constructor
		this.b = b;
	}
	void show()
	{
		disp();
		System.out.println("The value is : "+b);
		System.out.println("The type is : "+b.getClass().getName());
	}
}
public class Generic6
{
	public static void main(String []args)
	{
		exam2<Integer> e1 = new exam2<Integer>(10,12);					//take both arguments as integer type
		exam2<Float> e2 = new exam2<Float>(1.2f,12.12f);
		exam2<String> e3 = new exam2<String>("Gaurav","Maheshwari");
		exam2<Character> e4 = new exam2<Character>('G','M');
		exam2<Double> e5 = new exam2<Double>(12.123456789,12.082003);
		e1.show();
		e2.show();
		e3.show();
		e4.show();
		e5.show();
	}
}