import java.util.*;
public class FriendlyPair 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int s1=0,s2=0;
		for(int i=1;i<n1;i++) 
		{
			if(n1%i==0)
			s1=s1+i;
		}
		for(int i=1;i<n2;i++) 
		{
			if(n2%i==0)
			s2=s2+i;
		}
		if(s1==n1&&s2==n2)
			System.out.print("Entered numbers are friendly pair");
		else
			System.out.print("Entered numbers are not friendly pairs");
	} 
}