//event handling
import java.awt.*;
import java.awt.event.*;
class event
{
	Frame f;
	Button b;
	event()
	{
		f = new Frame ("Frame for Event Handling");
		b = new Button ("Try me out!");
		b.setActionCommand("Your task completed...");	//to set mess. that what action have been completed
	}
	void disp()
	{
		b.addActionListener(new hand());	//method to register handler with the event by passing the reference/object of that class
		f.add(b, BorderLayout.WEST);	//adding button in a west border layout manner
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[]a)
	{
		event e1 = new event();
		e1.disp();
	}
}
class hand implements ActionListener	//'ActionListener' is an interface for the ActionEvent class
{
	public void actionPerformed(ActionEvent e)	//actionPerformed() is method of this interface for defining the event by taking the argument as the event
	{											//ActionEvent is an event class
		System.out.println("\nAction Occurred...");
		System.out.println("Button Command : "+e.getActionCommand());	//to get/print the mess. for completion of task
	}
}
