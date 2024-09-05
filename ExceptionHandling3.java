import java.util.*;
public class ExceptionHandling3
{
	public static void main(String[] args)
	{
		String str = null;						//null acts as a string by referencing to a null pointer
		try
		{
			System.out.println("In try block");
			System.out.println(str);
			System.out.println("Length of given string : "+str.length());		//length function works only on string not on referenced pointer
			System.out.println("Try block ends");
		}
		catch(NullPointerException e)				//exception class for pointer pointing to null
		{
			System.out.println("Exception Caught " +e);
			System.out.println("Program execute with exception");
		}
		System.out.println("Programs executed successfully");
	}
}