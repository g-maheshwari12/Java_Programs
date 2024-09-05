import java.util.*;
public class ExceptionHandling1
{
	public static void main(String[] args)
	{
		int a,b,c;
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter two numbers: ");
			a=sc.nextInt();
			b=sc.nextInt();
			c=a/b;
			System.out.println("Result=" +c);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Exception caught " +e);
		}
		System.out.println("\nEnd of Program");
	}
}
