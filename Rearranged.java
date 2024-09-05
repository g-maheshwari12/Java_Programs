import java.util.*;
public class Rearranged
{
	static void rearrange(int arr[], int n)
	{
		int i,j;
		j = 0;
		for(i = 0; i < n; i++)
		{
			if(arr[i] < 0)
			{
				if(i != j)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			} 
		} 
	}
	public static void main(String []args)
	{
		Scanner sr = new Scanner(System.in);
		int n,i;
		System.out.print("Enter the number of elements : ");
		n=sr.nextInt();
		int arr[]=new int[n];
		System.out.print("Input the array elements : ");
		for(i = 0; i < n; i++)
		{
			arr[i]=sr.nextInt();
		}
		System.out.print("Original array : ");
		for(i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		rearrange(arr, n);
		System.out.print("Rearranged array : ");
		for(i = 0; i < n; i++)
		{
			System.out.print(arr[i]+" "); 
		}
	}
}