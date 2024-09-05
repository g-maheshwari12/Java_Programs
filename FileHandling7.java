import java.io.*;
public class FileHandling7
{
	public static void main(String []args) throws IOException
	{
		int ch;
		FileReader f = new FileReader("File5.txt");				//subclass of Reader class
		BufferedReader bf = new BufferedReader(f);
		while((ch=bf.read())!=-1)								//in java no eof function is there so we use -1 to show the end of file
			System.out.print((char)ch);
		bf.close();
	}
}