import java.io.*;
public class FileHandling4
{
	public static void main(String []args) throws IOException			// throws used bcoz file throws not found exception
	{
		FileOutputStream fout = new FileOutputStream("File4.txt");		//creates a file and f1 starts pointing to it directly
		String str = "Hello";
		char ch[] = str.toCharArray();									// string converted into char array
		for(int i = 0 ;i<str.length();i++)
		{
			fout.write(ch[i]);											// write function writes into the file
		}
		fout.close();														// close function closes the file
	}
}