import java.util.Scanner;
public class ReplaceAll
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");		
		int number = sc.nextInt();
		String str = Integer.toString(number);
		int len = str.length();
		String str1 = "";
		str1 = str.replaceAll("0","1");
		System.out.println("Converted number is: "+str1);
	}
}