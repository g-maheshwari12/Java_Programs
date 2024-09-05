import java.util.*;
public class ExceptionHandling2
{
	public static void main(String[] args)
	{
		int []arr={10,5,5};
		try
		{
			arr[2]=arr[0]/(arr[1]-arr[2]);
			System.out.print("Next Element= "+arr[2]);
		}
		catch(ArithmeticException e)
		{
			System.out.print("Exception Caught " +e);
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.print("Exception Caught " +f);
		}
		System.out.print("\nEnd of Program");
	}
}