import java.io.*;
public class FileHandling5
{
	public static void main(String []args) throws IOException
	{
		FileInputStream fin = new FileInputStream("File4.txt");
		int i;
		do
		{
			i = fin.read();
			if(i!=-1)
			{
				System.out.print((char)i);
			}
		}while(i!=-1);
		fin.close();
	}
}