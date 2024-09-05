import java.util.*;
class MyCalculator
{
	int power(int n,int p) throws Exception
	{
		if(n==0 && p==0)
			throw new Exception("n and p should not be zero");
		else if(n<1 || p<1)
			throw new Exception("n and p should not be negative");
		else
			return (int)Math.pow(n,p);
	}
}
class Power_ExceptionHandling
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base value: ");
		int b = sc.nextInt();
		System.out.print("Enter exponent value: ");
		int e = sc.nextInt();
		MyCalculator M = new MyCalculator();
		try
		{
			System.out.println("Calculated value is : "+M.power(b,e));
		}
		catch(Exception ex)
		{
			System.out.println("Exception Caught : "+ex);
		}
	}
}