import java.io.*;
public class FileHandling6
{
	public static void main(String []args) throws IOException		//file handling gives ioexception always
	{
		FileWriter f = new FileWriter("File5.txt",true);			//sub class of writer class
		BufferedWriter bf = new BufferedWriter(f);					//implementation of buffer writer class
		bf.write("Hello Gaurav...");								//write the string into file
		bf.write("This is your PC");								//same as above
		bf.close();													//file should be closed after use
	}
}
		
