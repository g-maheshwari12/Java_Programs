import javax.swing.*;										//swing is the subclass of awt
public class FrameExample									//javax comes with java . no other install required
{
	public static void main(String []args)
	{
		JFrame jf = new JFrame();							//JFrame is the subclass of swing that is used to create frame 
		jf.setVisible(true);								//setVisible() is used to show output frame on the display
		jf.setSize(800,800);								//setSize() is used to set the size of the frame bcoz bydefault frame is on the left top 
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//this will close the frame and end the program on clicking close sign on frame
	}
}
