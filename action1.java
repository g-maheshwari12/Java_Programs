import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class action1 implements ActionListener
{
	JPanel jp;
	JButton red,blue,pink;
	action1()
	{
		JFrame j = new JFrame("Colour Changer");
		FlowLayout flow = new FlowLayout();
		
		jp = new JPanel();
		jp.setLayout(flow);
		
		JLabel jl = new JLabel("Click on the box ");
		
		red = new JButton("Red");
		blue = new JButton("Blue");
		pink = new JButton("Pink");
		
		red.addActionListener(this);
		blue.addActionListener(this);
		pink.addActionListener(this);
		
		jp.add(jl);
		jp.add(red);
		jp.add(blue);
		jp.add(pink);
		
		j.add(jp);
		j.setVisible(true);
		j.setSize(800,800);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str;
		str=ae.getActionCommand();
		if(str.equals("Red"))
		{
			jp.setBackground(Color.red);
		}
		else if(str.equals("Blue"))
		{	
			jp.setBackground(Color.blue);
		}
		else if(str.equals("Pink"))
		{	
			jp.setBackground(Color.pink);
		}
	}
	public static void main(String []args)
	{
		new action1();
	}
}