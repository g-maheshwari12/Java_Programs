import java.util.*;
public class ExceptionHandling4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		double balance = 10000;
		System.out.println("Enter amount you want to withdraw: ");
		double cash = sc.nextDouble();
		try
		{
			if(balance>= cash)
			{
				balance = balance - cash;
				System.out.println("Remaining Balance: "+balance);
				System.out.println("Transaction Completed Successfully");
			}
			else
				throw new ArithmeticException ("Insufficient Balance");
		}
		finally
		{
			System.out.println("Thank You User");
		}
	}
}