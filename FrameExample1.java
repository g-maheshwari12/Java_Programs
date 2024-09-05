import javax.swing.*;										
public class FrameExample1								
{
	public static void main(String []args)
	{
		JFrame jf = new JFrame("Gaurav Notepad");								// to give title to our frame, we pass title in the brackets						 
		jf.setVisible(true);								
		jf.setSize(400,400);								 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
