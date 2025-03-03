import java.util.*;
class details extends Exception
{
	details(String s){
		super(s);
	}
}
class Employee_ExceptionHandling
{
	public static void main(String []args)
	{
		String name=null;
		int id , dept ;
		Scanner sc = new Scanner (System.in);
		try
		{
			System.out.println("Enter employee name : ");
			name= sc.nextLine();
			if(!(name.charAt(0)>=65&&name.charAt(0)<=90))
				throw new details("First letter should be capital");
			System.out.println("Enter Employee ID: ");
			id = sc.nextInt();
			if(!(id>=2001 && id<=5001))
				throw new details("ID should be between 2001 and 5001");
			System.out.println("Enter Department ID: ");
			dept = sc.nextInt();
			if(!(dept>=1 && dept<=5))
				throw new details("Department ID should be between 1 and 5");
			System.out.println("Valid Inputs...");
			System.out.println("Displaying Employee Details...");
			System.out.println("Employee Name: "+name);
			System.out.println("Employee ID: "+id);
			System.out.println("Department ID: "+dept);
		}
		catch(details er)
		{
			System.out.println("Exception Caught " +er);
		}
		finally
		{
			System.out.println("Thank You");
		}
	}
}