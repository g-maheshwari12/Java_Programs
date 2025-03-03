import javax.swing.*;
import java.awt.*;
class swing1
{	
	swing1()
	{
		JFrame j = new JFrame("Information");
		FlowLayout flow = new FlowLayout();
		
		JPanel jp = new JPanel();
		jp.setLayout(flow);
		
		JLabel name = new JLabel("Name ");
		JTextField jt1 = new JTextField(20);
		JLabel rollno = new JLabel("Roll No ");
		JTextField jt2 = new JTextField(20);
		JLabel sec = new JLabel("Section ");
		JTextField jt3 = new JTextField(20);
		JLabel uni = new JLabel("University Roll No "); 
		JTextField jt4 = new JTextField(20);
		
		JButton save = new JButton("Save");
		JButton exit = new JButton("Exit");
		
		JCheckBox male = new JCheckBox("Male");
		JCheckBox female = new JCheckBox("Female");
		JCheckBox others = new JCheckBox("Others");
		
		JRadioButton mac = new JRadioButton("MAC");
		JRadioButton windows = new JRadioButton("WINDOWS");
		JRadioButton linux = new JRadioButton("LINUX");
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(mac);
		bg.add(windows);
		bg.add(linux);
		
		JComboBox<String> country = new JComboBox<String>();
		country.addItem("India");
		country.addItem("China");
		country.addItem("Japan");
		country.addItem("USA");
		country.addItem("UK");
		
		String []state = {"UP" , "UK" , "MP" , "J&K" , "Haryana" , "Punjab" , "Rajasthan" , "Gujarat" , "Maharashtra"};
		JComboBox<String> substate = new JComboBox<String>(state);
		
		JTextArea jta = new JTextArea(10,15);
		jta.setLineWrap(true);
		jta.setWrapStyleWord(true);
		
		JTextArea jta1 = new JTextArea(10,15);
		jta1.setLineWrap(true);
		jta1.setWrapStyleWord(true);
		JScrollPane jsp = new JScrollPane(jta1);
		jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		String []week = {"Sunday" , "Monday" , "Tuesday" , "Wednesday" , "Thursday" , "Friday" , "Saturday"};
		JList<String> weekdays = new JList<String>(week);
		weekdays.setVisibleRowCount(3);
		weekdays.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		jp.add(name);
		jp.add(jt1);
		jp.add(rollno);
		jp.add(jt2);
		jp.add(sec);
		jp.add(jt3);
		jp.add(uni);
		jp.add(jt4);
		jp.add(male);
		jp.add(female);
		jp.add(others);
		jp.add(mac);
		jp.add(windows);
		jp.add(linux);
		jp.add(country);
		jp.add(substate);
		jp.add(jta);
		jp.add(jsp);
		jp.add(jta1);
		jp.add(weekdays);
		jp.add(save);
		jp.add(exit);
		
		j.add(jp);
		j.setSize(300,400);
		j.setVisible(true);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String []args)
	{
		swing1 s = new swing1();
	}
}