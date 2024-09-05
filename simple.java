import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class simple implements ActionListener
{
	JPanel jp; 
	JLabel first,second,result;
	JTextField f,s,r;
	JButton add,sub,mul,div,reset;
	simple()
	{
		JFrame j = new JFrame("Calculator");
		
		FlowLayout flow = new FlowLayout();
		
		jp = new JPanel();
		jp.setLayout(flow);
		
		first  = new JLabel("First Number ");
		f = new JTextField(20);
		second = new JLabel("Second Number");
		s = new JTextField(20);
		result = new JLabel("Result       ");
		r = new JTextField(20);
		
		add =   new JButton("ADD");
		sub =   new JButton("SUB");
		mul =   new JButton("MUL");
		div =   new JButton("DIV");
		reset = new JButton("RESET");
		
		  add.addActionListener(this);
		  sub.addActionListener(this);
		  mul.addActionListener(this);
		  div.addActionListener(this);
		reset.addActionListener(this);
		
		jp.add(first );
		jp.add(f);
		jp.add(second);
		jp.add(s);
		jp.add(result);
		jp.add(r);
		jp.add(add);
		jp.add(sub);
		jp.add(mul);
		jp.add(div);
		jp.add(reset);
		
		j.add(jp);
		j.setSize(250,300);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str = ae.getActionCommand();
		int a,b,res;
		try
		{
			a = Integer.parseInt(f.getText());
			b = Integer.parseInt(s.getText());
			if(str.equals("ADD"))
			{
				res = a+b;
				r.setText(res+"");
			}
			else if(str.equals("SUB"))
			{
				res=a-b;
				r.setText(res+"");
			}
			else if(str.equals("MUL"))
			{
				res = a*b;
				r.setText(res+"");
			}
			else if(str.equals("DIV"))
			{
				res = a/b;
				r.setText(res+"");
			}
			else if(str.equals("RESET"))
			{
				f.setText("");
				s.setText("");
				r.setText("");
				f.requestFocus();
			}
		}
		catch(Exception e)
		{
		
		}
	}
	public static void main(String []args)
	{
		new simple();
	}
}
		