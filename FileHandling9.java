import java.io.*;
public class FileHandling9
{
	public static void main(String []args) throws IOException
	{
		FileReader f = new FileReader("File5.txt");
		BufferedReader bf = new BufferedReader(f);
		char []ch = new char[20];
		bf.read(ch,2,8);										//read(char_array,starting index,no of characters)
		System.out.println(ch);
		bf.close();
	}
}