import java.awt.*;
class awt1 extends Frame
{
	awt1()
	{
		Button b = new Button("Click here");	//add button to frame
		b.setBounds(130,100,180,30);			//set size of button and position
		Button c = new Button("Click Here");	//adding another button
		c.setBounds(130,140,180,30);			//setting size(x,y,l,b)
		setSize(400,400);						//set size of frame
		setLayout(null);
		setVisible(true);						//set visibility of frame
		add(b);									//add b button on the frame	
		add(c);									//add c button on the frame
	}
	public static void main(String []args)
	{
		awt1 a = new awt1();
	}
}