import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EventFrame3 extends JFrame implements ActionListener
{
	JLabel label;
	JButton button1;
	JButton button2;
	int i;
		
	public EventFrame3() 
	{
		super("Simple Frame");
		i = 0;
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		label=new JLabel("Label");
		button1=new JButton("Button-1");
		button2=new JButton("Button-2");	
		button1.addActionListener(this);
		button2.addActionListener(this);
		c.add(button1);					
		c.add(button2);
		c.add(label);
		setSize(200,200);		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(300,300);		
		setVisible(true);
		setResizable(false);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==button1)
		{
			label.setText("Button-1 is Pressed");
		}
		if(ae.getSource()==button2)
		{
			label.setText("Button-2 is Pressed");
		}
		//label.setText("Hello World : " + i++);

	}
	
	public static void main(String args[])
	{
		new EventFrame3();
	}
}