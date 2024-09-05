import javax.swing.*;
public class FrameExample2 extends JFrame
{
	FrameExample2()
	{
	}
	FrameExample2(String s)
	{
		super(s);
	}
	public static void main(String []args)
	{
		FrameExample2 jf = new FrameExample2("Gaurav");
		jf.setVisible(true);
		jf.setSize(500,500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}