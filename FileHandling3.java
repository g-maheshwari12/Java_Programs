import java.io.*;
public class FileHandling3
{
	public static void main(String []args) throws IOException
	{	
		File f1 = new File("File3.txt");	
		f1.createNewFile();											//create a file with name f1 is pointing
		System.out.println("IS file exists? "+f1.exists());
		f1.delete();												//delete the file
		System.out.println("IS file exists? "+f1.exists());
	}
}