import java.awt.*;
import java.util.*;
class awt2 extends Frame
{
	awt2()
	{
		Frame f = new Frame("Adder/Subtractor");
		
		Label l1 = new Label("First Number ");
		l1.setBounds(20,50,80,30);
		Label l2 = new Label("Second Number");
		l2.setBounds(20,90,80,30);
		
		TextField t1 = new TextField();
		t1.setBounds(120,50,80,30);
		//t1.setLayout(null);
		TextField t2 = new TextField();
		t2.setBounds(120,90,80,30);
		//t2.setLayout(null);
		
		Button add = new Button("Add");
		Button sub = new Button("Sub");
		add.setBounds(60,130,80,30);
		setLayout(null);
		sub.setBounds(60,170,80,30);
		setLayout(null);
		
		f.add(l1);
		f.add(l2);
		
		f.add(add);
		f.add(sub);
		
		f.add(t1);
		f.add(t2);
		
		f.setSize(800,800);
		f.setVisible(true);
	
	}
	
	public static void main(String []args)
	{
		new awt2();
	}
}