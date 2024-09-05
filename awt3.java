import java.awt.*;
import java.awt.event.*;
class awt3
{
	awt3()
	{
		Frame f = new Frame("Information");
		
		Label l1 = new Label("Name ");
		//Label l2 = new Label("Roll No ");
		//Label l3 = new Label("Section ");
		l1.setBounds(20,40,50,30);
		//l2.setBounds(20,80,50,30);
		//l3.setBounds(20,120,50,30);
		
		TextField t1 = new TextField();
		//TextField t2 = new TextField();
		//TextField t3 = new TextField();
		t1.setBounds(100,40,50,30);
		//t2.setBounds(100,80,50,30);
		//t3.setBounds(100, 120, 50, 30);
		
		f.add(l1);
		//f.add(l2);
		//f.add(l3);
		f.add(t1);
		//f.add(t2);
		//f.add(t3);
		
		f.setSize(400,400);
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
	}
	
	public static void main(String []args)
	{
		new awt3();
	}
}