import java.io.*;
public class FileHandling8
{
	public static void main(String []args) throws IOException
	{
		FileReader f = new FileReader("File5.txt");
		BufferedReader bf = new BufferedReader(f);
		String s = bf.readLine();								//readLine method read one line at a time
		String s1 = bf.readLine();
		String s2 = bf.readLine();								//if there is no line and we call readline method then it gives null as output
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		bf.close();
	}
}