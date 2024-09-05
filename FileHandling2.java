import java.io.*;
public class FileHandling2
{
	public static void main(String []args) throws IOException
	{	
		File f1 = new File("File2.txt");							// f1 points to file but file not created with this
		System.out.println("Is file Exists?? "+f1.exists());
		f1.createNewFile();											// create new file but gives IOException...
																	// To handle this exception we use "throws" 
																	
		System.out.println("Can file read? " +f1.canRead());		// canRead() is used to check whether the file is readable or not
		
		System.out.println("Can file write? " +f1.canWrite());		// canWrite() is used to check whether we can write into file or not
		
		System.out.println("Is file exists? "+f1.exists());			// checks whether file exists or not
		
		System.out.println("File Name... "+f1.getName());			// print the name of the file	
		
		System.out.println("Length of file: "+f1.length());			// print the length of the file
	}
}