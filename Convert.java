import java.util.*;
public class Convert
{
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the distance in kilometer");
		int n = sc.nextInt();
		double miles = n * 0.621;
		System.out.print("The distance in miles is --> " + miles);
	}
}		